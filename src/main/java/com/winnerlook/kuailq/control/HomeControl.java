package com.winnerlook.kuailq.control;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 注册，贷款信息控制层
 * 
 * @author Hu
 * @date 2017-04-07
 */

@Controller
@RequestMapping(value="/home")
public class HomeControl {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HomeControl.class);
	
	private static final String REGEX = "^[a-zA-Z0-9]{1,10}$";
	
	
	/**
	 * 首页跳转
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/index.shtml")
	public ModelAndView index(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("register");
		return mav;
		
	}
	
	@RequestMapping(value="{randomCode}/index.shtml")
	public ModelAndView indexParam(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mav = new ModelAndView();
		String userURL = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getRequestURI();
		String requURL = request.getRequestURI().split("home/")[1].split("/index")[0];
		 // 编译正则表达式
	    //Pattern pattern = Pattern.compile(regEx);
	    // 忽略大小写的写法
	    Pattern pattern = Pattern.compile(REGEX, Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(requURL);
	    // 字符串是否与正则表达式相匹配
	    boolean rs = matcher.matches();
	    if(rs){
	    	mav.addObject("userURL",userURL);
			mav.setViewName("register");
			return mav;
	    }else{
	    	LOGGER.error("输入链接地址URL无效：{}",userURL);
			return mav;
	    }
		
	}

}
