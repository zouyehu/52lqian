<%@  page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <meta http-equiv="Content-Language" content="zh-CN" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta name="renderer" content="webkit" />
	<title>52来钱</title>
	 <link rel="shortcut icon" href="${basePath}/images/favicon.ico" />
	<link rel="stylesheet" type="text/css" href="${basePath}/bootstrap/dist/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${basePath}/css/main.css">
    <link rel="stylesheet" type="text/css" href="${basePath}/iconfont/demo.css">
    <link rel="stylesheet" type="text/css" href="${basePath}/iconfont/iconfont.css">
    <link  rel="stylesheet" type="text/css" href="${basePath}/js/layer/skin/layer.css">
	
	<script>
		var _hmt = _hmt || [];
		(function() {
			var hm = document.createElement("script");
			hm.src = "https://hm.baidu.com/hm.js?0c71f8932ec3308cdcb709f7038e2e9d";
			var s = document.getElementsByTagName("script")[0];
			s.parentNode.insertBefore(hm, s);
		})();
	</script>
</head>
<body class="register-body">
	<div class="container-fluid">
        <div class="row">
                <!-- 顶部-->
                <div class="top">
                    <nav class="navbar navbar-default navbar-fixed-top">
                        <div class="container-fluid">
                            <div class="col-md-6 col-xs-6 navbar-header">
                                <a href="#">
                                    <img src="${basePath}/images/pic_03.png" alt="公司logo" class="logo" style="float:left;">
                                </a>
                            </div>
                            <div class="col-md-6 col-xs-6 navbar-header partners">
                                <a href="">
                                    <img src="${basePath}/images/partners-logo.jpg" alt="公司logo" class="logo" style="float:right;">
                                </a>
                            </div>
                        </div>
                    </nav>
                </div>

                <!-- 页面内容-->
                <div class="page-content">
                    <!-- 表单信息-->
                    <div class="col-md-3 col-xs-12 col-md-offset-8">
                        <div class="loan-form">
                            <div class="form-title">贷款申请 <span class="t-note"><i class="icon iconfont icon-jinggao"></i>在线申请1~50万无抵押贷款</span></div>
                            <div class="form-content">
                                <form class="form-horizontal" id="myform" name="myform" method="post" action="${basePath}/logn/register.shtml">
                                    <input type="hidden" id="userURL" name="userURL" value="${userURL}"/>
                                    <div class="form-group fg-border">
                                        <div class="col-md-2 col-xs-2"><i class="icon iconfont icon-user icon-s"></i></div>
                                        <div class="col-md-10 col-xs-10">
                                            <input type="text" class="form-control" id="userName" name="userName" placeholder="请输入正确的中文姓名" maxlength="7">
                                        </div>
                                    </div>
                                    <div class="form-group fg-border">
                                        <div class="col-md-2 col-xs-2"><i class="icon iconfont icon-shouji icon-s"></i></div>
                                        <div class="col-md-10 col-xs-10">
                                            <input type="num" class="form-control" onkeyup="if(isNaN(value))execCommand('undo')" onafterpaste="if(isNaN(value))execCommand('undo')" id="phone" name="phone" placeholder="请输入正确的手机号码" maxlength="11">
                                        </div>
                                    </div>
                                    <div class="form-group fg-border" id="myspan" style="display:none;">
                                        <div class="col-md-2 col-xs-2"><i class="icon iconfont icon-tuxingyanzhengma icon-s"></i></div>
                                        <div class="col-md-10 col-xs-10">
	                 							<input type="text" name="validatecode" class="form-control" id="validatecode" placeholder="请输入正确的验证码" maxlength="5">
			         							<i class="code-pic"><img id="img" alt="验证码" width="100" height="36"></i>
		         							<!-- <div style="position:relative;">
	                                            <input type="text" class="form-control" id="code" name="code" placeholder="请输入短信验证码">
	                                            <input type="button" class="btn btn-get-code" id="button" name="button" value="获取验证码" onclick="phoneCode(this)">
	                							<input type="hidden" id="hidCode" >
                							</div> -->
                                        </div>
                                    </div>
                                    <div class="form-group fg-border">
                                        <div class="col-md-2 col-xs-2"><i class="icon iconfont icon-verify-code icon-s"></i></div>
                                        <div class="col-md-10 col-xs-10">
                                        	<div style="position:relative;">
	                                            <input type="text" class="form-control" id="code" name="code" placeholder="请输入短信验证码" maxlength="4">
	                                            <input type="button" class="btn btn-get-code" id="button" name="button" value="获取验证码" onclick="phoneCode(this)">
	                							<input type="hidden" id="hidCode" >
                							</div> 
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="col-md-12 col-xs-12">
                                            <div class="checkbox">
                                                <label class="n-cbk r-n-cbk">
                                                    <input type="checkbox" name="agreement" id="agreement" checked> 同意
                                                </label>
                                                <a class="user-d" href="" onclick="return false;" data-toggle="modal" data-target="#secModal">《用户协议》</a>
                                               	<span class="n-loan"> 并申请信用贷款</span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <input type="button" id="ajaxBtn" class="btn btn-submit btn-block" value="提交申请" />
                                    </div>
                                    <div class="form-group">
                                        <div class="col-md-12 col-xs-12">
                                            <div class="checkbox">
                                                <label class="register-n-cbk n-cbk">
                                                    <input type="checkbox" name="apply" id="apply" checked> 申请有礼 : 送100万赔付意外险,平安出行
                                                   	<p><span class="star">*</span>我确定已了解<a class="user-d"href="" onclick="return false;" data-toggle="modal" data-target="#activityRulesModal">活动规则</a>及<a class="user-d" href="" onclick="return false;" data-toggle="modal" data-target="#InforSecuritySpecificationModal">信息安全说明</a> </p>	
                                                </label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="note">
                                        <p class="register-note-t note-t">平台郑重承诺:</p>
                                        <p class="n-cbk register-n-cbk">所有贷款申请在未成功放款前绝不收取任何费用，为保障您的资金安全，请不要相信任何要求您支付费用的信息、邮件、电话等不实信息。</p>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
  				<!-- Modal start -->
                <div class="modal fade" id="secModal" tabindex="-1" role="dialog">
                    <div class="modal-dialog  modal-lg" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                <h4 class="modal-title">安全保障</h4>
                            </div>
                            <div class="modal-body">
                                <p class="p-title">数据与信息安全:</p>
                                <p>本公司在任何时候都竭力保证客户的个人信息不被人擅自或意外取得、处理或删除。采取各种实际措施保证个人信息不会被保管超过合理的期限，本公司将遵守所有关于可辨别个人信息保存的法规要求。</p>
                                <p><i class="icon iconfont icon-lengxing icon-p"></i>支持安全套接层协议和128位加密技术——这种加密技术是互联网上保护数据安全的行业标准，让客户在进行会员管理、个人账户管理、充值等涉及敏感信息的操作时，信息被自动加密，然后才被安全地通过互联网发送出去。</p>
                                <p><i class="icon iconfont icon-lengxing icon-p"></i>采取各种合适的物理、电子和管理方面的措施来保护数据，以实现对数据安全的承诺。</p>
                                <p><i class="icon iconfont icon-lengxing icon-p"></i>采用集中的影像存储服务来保证合同等文件信息的存储，有效避免被篡改以及删除，并可以实现永久保存。</p>
                                <p><i class="icon iconfont icon-lengxing icon-p"></i>网站之间的页面跳转以及数据的发送采用数字签名技术来保证信息以及来源的不可否认性。</p>
                                <p><i class="icon iconfont icon-lengxing icon-p"></i>网站架设三层防火墙隔离系统，确保平台内部网络不受侵害，保障平台数据流的安全;采用数据签名、数据加密、安全套接协议等安全技术，确保传送的数据都是被加密的，从而有效的保证通信过程的私密性和真实性。</p>
                                <p><i class="icon iconfont icon-lengxing icon-p"></i>运用流程管理的方法，完善内部控制制度，配备专职安全系统运维工程师，保障系统连续、可靠、正常地运行，保护系统数据、硬件、软件等不因偶然或恶意的原因而遭到破坏，而导致数据外流。</p>
                                <p class="p-title">隐私保密:</p>
                                <p>本公司的业务是建立在与客户彼此信任的基础之上的，为了提供更优质的客户服务和产品。为了使您提供的所有信息都能得到机密保障，我们采用以下关于信息保护的政策：</p>
                                <p><i class="icon iconfont icon-lengxing icon-p"></i>当您在本公司的推广页面中自主填写了您的个人需求及信息后，即视为您同意本公司将您的信息提供与本公司合作的贷款产品方，我们将根据您的财务需要向您推送符合您需求的贷款产品，并安排贷款产品专业服务人员为您提供专业咨询类服务。</p>
                                <p><i class="icon iconfont icon-lengxing icon-p"></i>本公司收集信息的范围仅限于那些本公司认为对了解您的财务需求和开展业务所必需的相关资料。</p>
                                <p><i class="icon iconfont icon-lengxing icon-p"></i>本公司将对客户提供的信息严格保密，除具备下列情形之一外，不会向任何外部机构披露：</p>
                                <p class="p-mark">1.经过客户事先同意而披露；</p>
                                <p class="p-mark">2.应法律法规的要求而披露；</p>
                                <p class="p-mark">3.应政府部门或其他代理机构的要求而披露；</p>
                                <p class="p-mark">4.应上级监管机构的要求而披露；</p>
                                <p><i class="icon iconfont icon-lengxing icon-p"></i>本公司尽力确保对客户的信息记录是准确和及时的。</p>
                                <p><i class="icon iconfont icon-lengxing icon-p"></i>本公司设有严格的安全系统，以防止未经授权的任何人、包括本公司的职员获取客户信息。</p>
                                <p><i class="icon iconfont icon-lengxing icon-p"></i>因服务必要而委托的第三方，在得到本公司许可获取客户的个人信息时，都被要求严格遵守保密责任。</p>
                                <p class="p-title">风险保障：</p>
                                <p><i class="icon iconfont icon-lengxing icon-p"></i>对借款人的审核要点包括评估借款人职业的稳定性、居住的稳定性、项目的稳定性、家庭社交网络的稳定性等，通过对这些关键点的把握，确保公司筛选出最有守信的意愿和守信的能力的借款人。</p>
                            </div>
                        </div>
                    </div>
                </div>
                
                <!-- 活动规则 Modal -->
				<div class="modal fade" id="activityRulesModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
				  <div class="modal-dialog" role="document">
				    <div class="modal-content">
				      <div class="modal-header">
				        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
				        <h4 class="modal-title" id="myModalLabel">活动规则</h4>
				      </div>
				      <div class="modal-body">
				        <p>1.投保对象：本保险身故受益人为法定受益人。本保险的保险对象要求身体健康、能正常工作或正常生活的自然人</p>
						<p>2.保险期限：以被保险人收到短信通知上的保险起止日期为准。对保险日期之外所发生的保障事故保险公司不负责给付保险责任</p>
						<p>3.使用条款：详情内容请登录保险公司官网网站查询</p>
						<p>4.告知义务：依我国《保险法》的规定，投保人、被保险人应如实告知，否则保险人有权依法解除保险合同，并对于保险合同解除前发生的保险事故不负任何责任。 投保人、被保险人在投保时，应对投保书内各项内容如实详细的说明或填写清楚。否则，保险人有权依法解除保险合同。</p>
						<p>5.保险判定流程：根据用户所填写的资料后台自动匹配最适合用户的保险为期进行投保</p>
						<p>6.保险提供商：相关保险由中国平安提供，之后会有可能收到保险代理人回访电话。</p>
						<p>7.保险凭证：保险公司对保险仅提供电子保单；赠送保险每人只能投保一份，重复或投保多分无效。</p>
						<p>8.如对本活动有疑问及建议请拨打【021-50561328】进行咨询（咨询时间:工作日9:30至18:00）； 如对赠险内容及理赔有疑问请拨打相关保险公司客服电话进行咨询</p>
						<hr class="activity-hr"/>
						<p class="downlaod"><a href="${basePath}/pdf/平安交通团体意外伤害保险条款.pdf"  target="_blank">平安交通团体意外伤害保险条款</a></p>
						<p class="downlaod"><a href="${basePath}/pdf/平安旅行附加行李物品和旅行证件损失保险条款.pdf"  target="_blank">平安旅行附加行李物品和旅行证件损失保险条款</a></p>
				      </div>
				    </div>
				  </div>
				</div>
                
                <!-- 信息安全说明 Modal -->
                <div class="modal fade" id="InforSecuritySpecificationModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
				  <div class="modal-dialog" role="document">
				    <div class="modal-content">
				      <div class="modal-header">
				        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
				        <h4 class="modal-title" id="myModalLabel">信息安全说明</h4>
				      </div>
				      <div class="modal-body">
				        <p>本人授权保险公司，除法律另有规定之外，将本人提供给保险公司的信息、享受保险公司服务产生的信息（包括本〔单证〕签署之前提供和产生的信息）以及保险公司根据本条约定查询、收集的信息，用于保险公司及其因服务必要委托的合作伙伴为本人提供服务、推荐产品、开展市场调查与信息数据分析。</p>
						<p>本人授权保险公司，除法律另有规定之外，基于为本人提供更优质服务和产品的目的，向保险公司因服务必要开展合作的伙伴提供、查询、收集本人的信息。为确保本人信息的安全，保险公司及其合作伙伴对上述信息负有保密义务，并采取各种措施保证信息安全。</p>
						<p>本条款自本〔单证〕签署时生效，具有独立法律效力 , 不受合同成立与否及效力状态变化的影响。</p>
				      </div>
				    </div>
				  </div>
				</div>
				
                <!-- Modal end -->
               <!-- 底板版权-->
               <div class="navbar navbar-default navbar-fixed-bottom">
                   <span class="bottom-cnt">沪ICP备12013087号-22</span>
               </div>
           </div>
       </div>
       
    <script src="${basePath}/js/jquery-2.1.4.js"></script>
    <script src="${basePath}/bootstrap/dist/js/bootstrap.min.js"></script>
	<script src="${basePath}/js/common/validatuntil.js" type="text/javascript"></script>
	<script src="${basePath}/js/layer/layer.js" type="text/javascript" charset="utf-8" ></script>
	<script type="text/javascript">
	
	//验证码60计时
	var countdown=60;
	function settime(obj) {
	  if (countdown == 0) {
	    obj.removeAttribute("disabled");
	    obj.value="请重新获取";
	    countdown = 60;
	    return;
	  } else {
	    obj.setAttribute("disabled", true);
	    obj.value="获取验证码(" + countdown + ")";
	    countdown--;
	  }
	setTimeout(function() {
	  settime(obj) 
	  }
	  ,1000)
	}
	//表单属性提交
	$(function(){
		$("#ajaxBtn").click(function(){
			
			var parms = $("#myform").serialize();
			var userName = $("#userName").val();
			var phone = $("#phone").val();
			var apply = $("#apply").val();
			//手机验证码
			var code = $("#code").val();
			//后台返回手机验证码
			var scodeCode = $("#hidCode").val();
			
			if(!isUserName(userName)){
				layer.alert("请输入正确的中文姓名",{icon:7});
				return false;
			}
			if(!isMobile(phone)){
				layer.alert("请输入正确的手机号",{icon:7});
				return false;
			}
// 			if((code == '') || (code !=scodeCode)){
// 				layer.alert("请输入有效的验证码",{icon:7});
// 				return false;
// 			} 
			if(document.getElementById("agreement").checked == false){
				layer.alert("需要同意《用户协议》",{icon:7});
				document.getElementById("agreement").focus();
				return false;
				}
				
			
			$.ajax({
				type:"post",
				url:"${basePath}/logn/register.shtml",
				data:parms,
				success: function(data){
					if(data.success == 0){
						$("#myform").empty();
						window.location.href='${basePath}/logn/lognInfoye.shtml';
					}
				}
				
			})
			
		});
		
		//点击更换验证码
		$("#img").on("click", function(e) {
			_change();
		});
	})
		
		
	//短信验证码	
	function phoneCode(obj){
		
		var phoneNum = $("#phone").val();
		//图形验证码
		var validatecode_state = $('#validatecode');
		var validatecode = $("#validatecode").val();
		
		if(!isMobile(phoneNum)){
			layer.alert("请输入正确的手机号",{icon:7});
			return false;
		}
		$.ajax({
			type:"post",
			url:"${basePath}/logn/pcode.shtml",
			data:{'phoneNum':phoneNum,'validatecode':validatecode},
			success: function(data){
				if(data.success == 1){
					layer.alert("该手机号已注册，请更换",{icon:7});
					return false;
				}else if(data.code == -1){
					$("#myspan").css('display','block'); 
					_change();
					return false;
				}else if(data.code == -2){
					
					layer.alert("获取验证码超频，请3天后重试",{icon:7});
					return false;
				}else{
					settime(obj);
					var scode = data.scode;
					$("#hidCode").val(scode);
					
				}
				
			}
		})
	}
	
	
		//验证码获取
		function _change() {
			document.getElementById("img").src = "${basePath}/img?"
					+ new Date().toLocaleString();
			$('#validatecode').val("");
		}
	
	
	</script>
</body>
</html>