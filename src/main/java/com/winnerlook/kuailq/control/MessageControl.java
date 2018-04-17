package com.winnerlook.kuailq.control;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.commons.codec.digest.DigestUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.winnerlook.kuailq.pojo.City;
import com.winnerlook.kuailq.pojo.Logninfo;
import com.winnerlook.kuailq.pojo.Phones;
import com.winnerlook.kuailq.pojo.Province;
import com.winnerlook.kuailq.pojo.User;
import com.winnerlook.kuailq.service.ICityService;
import com.winnerlook.kuailq.service.ILogninfoService;
import com.winnerlook.kuailq.service.IPhonesService;
import com.winnerlook.kuailq.service.IProvinceService;
import com.winnerlook.kuailq.service.IUserService;
import com.winnerlook.util.ConmentsUtil;
import com.winnerlook.util.CookieUtils;
import com.winnerlook.util.HttpJsonClient;
import com.winnerlook.util.HttpUtil;
import com.winnerlook.util.KeyUtil;
import com.winnerlook.util.RequestToBean;

/**
 * 用户贷款信息控制层
 * @author Hu
 * @date 2017-04-11
 */

@Controller
@RequestMapping("/logn")
public class MessageControl {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MessageControl.class);
	
	private static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	
	private HttpJsonClient client = new HttpJsonClient();
	
	@Autowired
	private IUserService userService;
	
	@Autowired
	private IProvinceService provinceService;
	
	@Autowired
	private IPhonesService phonesService;
	
	@Autowired
	private ICityService cityService;
	
	@Autowired
	private ILogninfoService logninfoService;
	
	//短信调度参数
	@Value("${yj_userCode}")
	private String yj_userCode;
	
	@Value("${yj_userPass}")
	private String yj_userPass;
	
	@Value("${yj_smsType}")
	private String yj_smsType;
	
	@Value("${yj_url}")
	private String yj_url;
	
	@Value("${yx_userCode}")
	private String yx_userCode;
	
	@Value("${yx_userPass}")
	private String yx_userPass;
	
	@Value("${yx_Channel}")
	private String yx_Channel;
	
	@Value("${yx_url}")
	private String yx_url;
	
	//新旦投保赠险参数
	@Value("${channelCode}")
	private String channelCode;
	
	@Value("${productCode}")
	private String productCode;
	
	@Value("${sign}")
	private String sign;
	
	@Value("${sintang_url}")
	private String sintang_url;
	
	//跳转第三方银行注册信息
	@Value("${zhaoS}")
	private String zhaoS;
	
	@Value("${pingA}")
	private String pingA;
	
	/**
	 * 贷款信息保存
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/lognInfo.shtml")
	@ResponseBody
	public Map<String,Object> lognInfo(HttpServletRequest request,HttpServletResponse response){
		
		Map<String,Object> resultMap = new HashMap<String, Object>();
		String userId = (String)request.getSession().getAttribute("userId");
		String apply = (String) request.getSession().getAttribute("apply");
		String phone = (String) request.getSession().getAttribute("phone");
		String userName = (String) request.getSession().getAttribute("userName");
		Logninfo lognUserId = null;
		String Insurance = null;
		int gender;
		if(null != userId){
			lognUserId = logninfoService.selectByUserid(userId);
		}
		
		if(lognUserId == null){
			
			String birth = request.getParameter("birth");
			String sex = request.getParameter("gender");
			if(Integer.valueOf(sex)==0){
				gender = 1;
			}else{
				gender = 0;
			}
			Logninfo payinfo = new Logninfo();
			try {
				if(null != birth && !"".equals(birth)){
					payinfo.setBirthdate(format.parse(birth.toString()));
				}
				payinfo.setUserid(userId);
			} catch (ParseException e1) {
				LOGGER.error("日期转换异常：{}",e1);
			}
			Logninfo info = RequestToBean.getBeanToRequeat(request, payinfo);
			
			try {
				info.setId(KeyUtil.getKey());
				//测试代码
//				Calendar calendar = Calendar.getInstance();
//				calendar.setTime(new Date());
//				calendar.add(Calendar.DAY_OF_MONTH, -1);calendar.getTime()
				
				info.setCreate_date(new Date());
				logninfoService.insert(info);
				//短信赠险对接
				if((apply !=null) && (apply.equals("on"))){
					
					//确定计算方法,MD5加密
					String str = channelCode+sign+phone;
					String base64Str = DigestUtils.md5Hex(str);
					
					JSONObject reqJsonData = new JSONObject();
					reqJsonData.put("channelCode", channelCode);
					reqJsonData.put("productCode", productCode);
					reqJsonData.put("mobile", phone);
					reqJsonData.put("name", userName);
					reqJsonData.put("birth", birth);
					reqJsonData.put("sign", base64Str);
					reqJsonData.put("sex", gender);
					
					String result = this.client.send(sintang_url, reqJsonData.toString());
					
					JSONObject resultJson = JSONObject.fromObject(result);
					String status = resultJson.getString("status");
					if(ConmentsUtil.SUCCESS_CODE.equals(status)){
						Insurance = "Insurance_Success";
						User su_user = userService.selectById(userId);
						if(null != su_user){
							su_user.setReserve1(Insurance);
							userService.update(su_user);
						}
						
					}
					
				}
				resultMap.put("success", 0);
				return resultMap;
			} catch (Exception e) {
				LOGGER.error("贷款信息入库异常：{}",e);
				return null;
			}
		}else{
			
			resultMap.put("success", 1);
			return resultMap;
		}
		
	}
	
	/**
	 * 信息OK
	 * 跳转到结束页
	 * @return
	 */
	@RequestMapping(value="/applySuccess.shtml")
	public ModelAndView endye(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("applySuccess");
		return mav;
	}
	
	/**
	 * 第三方链接跳转
	 * @param request
	 * @param response
	 */
	@RequestMapping("/linkPush.shtml")
	public void linkPush(HttpServletRequest request,HttpServletResponse response){
		
		String user_id = (String) request.getSession().getAttribute("userId");
		User user = userService.selectById(user_id);
		String type = request.getParameter("type");
		if(1==Integer.valueOf(type)){
			user.setLink_push(zhaoS);
			
		}else if(2==Integer.valueOf(type)){
			user.setLink_push_two(pingA);
		}
		userService.update(user);
		
	}
	
	/**
	 * 省市二级按钮控制
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/procity.shtml")
	@ResponseBody
	public Map<String,Object> procity(HttpServletRequest request,HttpServletResponse response){
		Map<String,Object> resultMap = new HashMap<String, Object>();
		City city = new City();
		String proId = request.getParameter("procity");
		if((null !=proId) && (!"".equals(proId))){
			city.setProvince_id(Integer.parseInt(proId));
		}
		List<City> citys = cityService.selectList(city);
		resultMap.put("citys", citys);
		return resultMap;
		
	}
	
	/**
	 * 注册信息保存
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/register.shtml")
	@ResponseBody
	public Map<String,Object> register(HttpServletRequest request,HttpServletResponse response){
		Map<String,Object> resultMap = new HashMap<String, Object>();
		User user = new User();
		
		String userName = request.getParameter("userName");
		String phone = request.getParameter("phone");
		String userURL = request.getParameter("userURL");
		String apply = request.getParameter("apply");
		
		request.getSession().setAttribute("apply", apply);
		request.getSession().setAttribute("userName", userName);
	
		if((null != phone) && (!"".equals(phone)) ){
			String userId = KeyUtil.getKey();
			request.getSession().setAttribute("phone", phone);
			request.getSession().setAttribute("userId", userId);
			user.setId(userId);
			user.setName(userName);
			user.setPhone(phone);
			user.setCreate_date(new Date());
			user.setReserve(userURL);
			user.setIs_del(0);
			user.setUser_del(1);
			userService.insert(user);
		}
		
		resultMap.put("success", 0);
		return resultMap; 
		
	}
	
	/**
	 * 贷款信息页跳转
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/lognInfoye.shtml")
	public ModelAndView lognInfoye(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mav = new ModelAndView();
		Province province = new Province();
		List<Province> provinces = provinceService.selectList(province);
		mav.addObject("provinces", provinces);
		mav.setViewName("lognInfo");
		return mav;
		
	}
	
	/**
	 * 获取短信验证码
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/pcode.shtml")
	@ResponseBody
	public Map<String,Object> pcode(HttpServletRequest request,HttpServletResponse response){
		
		 Map<String,Object> resultMap = new HashMap<String, Object>();
		 String DesNo = request.getParameter("phoneNum");
		//1，首先检测用户是否已注册过，是：直接返回
		 String userID = userService.selectByPhone(DesNo);
		 if((null != userID) && !"".equals(userID)){
			 
			 resultMap.put("success", 1);
			 return resultMap;
		 }
		 //2，用户没有注册过，点击获取验证码按钮，先查询是否是第一次点击
		 Phones resPhone = new Phones();
		 resPhone = phonesService.selectByPhone(DesNo);
		 //不是第一次点击
		 if(null !=resPhone){
			 int codeNum = resPhone.getNum();
			 if(codeNum>=1 && codeNum<3){
				 
				//返回验证码到页面
			    resultMap.put("scode", sendCode(DesNo));
			   //该手机号获取验证码次数 +1,保存
            	resPhone.setNum(codeNum+1);
            	resPhone.setUpdate_date(new Date());
            	phonesService.update(resPhone);
			    return resultMap;
				
			 }
			 else if(codeNum>=3 && codeNum<10){
				 //图形验证码校验
				String validatecode = request.getParameter("validatecode");
				String checkImg = CookieUtils.getCookieValue(request,"checkImg");
				if (!validatecode.equalsIgnoreCase(checkImg)) {
					resultMap.put("code",-1);
					return resultMap;
				}
				    //返回验证码到页面
				    resultMap.put("scode", sendCode(DesNo));
				    //该手机号获取验证码次数 +1,保存
	            	resPhone.setNum(codeNum+1);
	            	resPhone.setUpdate_date(new Date());
	            	phonesService.update(resPhone);
				    return resultMap;
			 }else{
				 resultMap.put("code", -2);
				 return resultMap;
			 }
		 }else{
			 //保存第一次点击号码信息
			 Phones userPhone = new Phones();
			 userPhone.setId(KeyUtil.getKey());
			 userPhone.setPhone(DesNo);
			 userPhone.setNum(1);
			 userPhone.setCreate_date(new Date());
			 userPhone.setIs_del(0);
			 phonesService.insert(userPhone);
			//返回验证码到页面
			resultMap.put("scode", sendCode(DesNo));
			return resultMap;
		 }
	}
	
	//生成随机验证码
	public String phoneCode() {
		StringBuilder str = new StringBuilder();
		Random random = new Random();
		for (int l = 0; l < 4; l++) {

			str.append(random.nextInt(10));
		}
		return str.toString();
	}
	
	//短信发送接口调度
	public String sendCode(String desNo){
		 String scode = phoneCode();
		 System.out.println("验证码是："+scode);
		 
		 //测试
//		 String msginfo = "你好，您的验证码是："+scode+"【邹业虎】";
//		 String cs_url = "http://192.168.1.180:8048/winnerrxd/api/trigger";
//		 Map<String, String> Params = new HashMap<String,String>();
//         Params.put("userCode", "huzou");
//         Params.put("userPass","huzou");
//         Params.put("DesNo",desNo);
//         Params.put("Msg", msginfo);
//         Params.put("smsType", "101");
//         String ResultXML =HttpUtil.URLPost(cs_url+"/SendMsg",Params,"UTF-8");
         
         //正式云集通道
		 String msginfo = "您的验证码是"+scode+","+"请在10分钟内完成验证。【伍贰来钱】";
         Map<String, String> Params = new HashMap<String,String>();
         Params.put("userCode", yj_userCode);
         Params.put("userPass", yj_userPass);
         Params.put("DesNo",desNo);
         Params.put("Msg", msginfo);
         Params.put("smsType", yj_smsType);
         String ResultXML =HttpUtil.URLPost(yj_url,Params,"UTF-8");
         
         LOGGER.info("send phone code message: {}",ResultXML);
             Document document;
			try {
				document = DocumentHelper.parseText(ResultXML);
				Element root= document.getRootElement();
	            String value=root.getText();
	            if(value.contains("-")){
	            	//调度另一个短信接口，重新发送：云信通道
	            	String yx_url = "http://120.55.197.77:1210/Services/MsgSend.asmx";
	            	Map<String, String> YX_Params = new HashMap<String,String>();
	            	YX_Params.put("userCode", yx_userCode);
	            	YX_Params.put("userPass", yx_userPass);
	            	YX_Params.put("DesNo", desNo);
	            	YX_Params.put("Msg", msginfo);
	            	YX_Params.put("Channel", yx_Channel);
	                String YX_ResultXML =HttpUtil.URLPost(yx_url,YX_Params,"UTF-8");
	                
	                LOGGER.info("send phone code message YX: {}",YX_ResultXML);
	                Document yx_document = DocumentHelper.parseText(YX_ResultXML);
	                Element yx_root= yx_document.getRootElement();
		            String yx_value=yx_root.getText();
		            if(yx_value.contains("-")){
		            	LOGGER.error("短信发送存在异常：{}",yx_value);
		            }
	            }
	            
			} catch (DocumentException e) {
				LOGGER.error("dom 解析异常：{}", e);
			}
			return scode;
	}
}
