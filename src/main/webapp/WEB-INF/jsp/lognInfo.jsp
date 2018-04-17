<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
	<title>52来钱贷款申请完善信息页</title>
	<style>
	.form-group{
		margin-bottom:7px;
	}
	.l-select-down{
		display:inline-block;
		position:absolute;
		right:5px;
		top:20px;
	}
	.l-border{
		border-bottom: 2px solid #e6dede!important;
	}
	</style>
    <link  rel="stylesheet" type="text/css" href="${basePath}/js/layer/skin/layer.css">
	<link rel="stylesheet" type="text/css" href="${basePath}/bootstrap/dist/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${basePath}/css/main.css">
    <link rel="stylesheet" type="text/css" href="${basePath}/iconfont/demo.css">
    <link rel="stylesheet" type="text/css" href="${basePath}/iconfont/iconfont.css">
 
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
<body class="msg-body">
    <div class="container-fluid">
        <div class="row">
                <!-- 顶部-->
                <div class="top">
                    <nav class="navbar navbar-default navbar-fixed-top">
                        <div class="container-fluid">
                            <div class="col-sm-6 col-xs-6 navbar-header">
                                <a href="#">
                                    <img src="${basePath}/images/pic_03.png" alt="公司logo" class="logo">
                                </a>
                            </div>
                            <div class="col-sm-6 col-xs-6 navbar-header partners">
                                <a href="">
                                    <img src="${basePath}/images/partners-logo.jpg" alt="公司logo" class="logo" style="float:right;">
                                </a>
                            </div>
                        </div>
                    </nav>
                </div>
                <!-- 页面内容-->
                <div class="msg-page">
                    <!-- <div class="pic"></div> -->
                    <!-- 表单信息-->
                    <div class="col-md-3 col-xs-12 col-md-offset-7">
                        <div class="loan-form-msg">
                            <div class="form-title">完善信用信息</div>
                            <div class="form-content">
                                <form class="form-horizontal" id="lognform" name="lognform" method="post" action="${basePath}/logn/lognInfo.shtml">
                                    <div class="form-group">
                                        <label class="col-md-4 col-xs-4 control-label control-l"> <span class="star">*</span>期望额度</label>
                                        <div class="col-md-8 col-xs-8 input-border">
                                            <input type="text" class="form-control" id="qwlogn" name="qwlogn" onkeyup="if(this.value.length==1){this.value=this.value.replace(/[^0-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}"
                                            onafterpaste="if(this.value.length==1){this.value=this.value.replace(/[^0-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}"
                                            required oninvalid="setCustomValidity('请输入期望贷款金额');" oninput="setCustomValidity('');" required="required" placeholder="请输入贷款金额1~50" maxlength="2">
                                        	<span class="unit">万元</span>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-4 col-xs-4 control-label control-l"><span class="star">*</span>出生年月</label>
                                        <div class="col-md-8 col-xs-8 input-border">
                                            <input type="date" name="birth" class="form-control" id="birth" required oninvalid="setCustomValidity('请输入出生年月');" oninput="setCustomValidity('');" placeholder="">
                                        </div>
                                    </div>
                                    <div class="form-group" style="margin-top:16px;">
                                        <label class="col-md-4 col-xs-4 control-label radio-lbl">性别</label>
                                        <div class="gender">
                                            <label class="radio-inline col-md-3 col-xs-3 radio1">
                                                <input type="radio" name="gender" id="inlineRadio1" value="0" checked> 男
                                            </label>
                                            <label class="radio-inline" style="margin-top:6px">
                                                <input type="radio" name="gender" id="inlineRadio2" value="1"> 女
                                            </label>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-4 col-xs-4 control-label control-l"><span class="star">*</span>所在地区</label>
<!--                                         <div class="location" data-toggle="distpicker"> -->
											<div class="col-md-4 col-xs-4 l-border" data-toggle="distpicker" style="padding-left:30px;">
												<select name="provice_id" id="myselect" class="form-inline location-sel" onchange="proCity()">
													<option value="">--省份--</option>
													<c:forEach items="${provinces}" var="pro">
														<option value="${pro.id}">${pro.name}</option>
													</c:forEach>
												</select> 
												<span class="l-select-down"><img src="${basePath}/images/select_down.png" width="50%" height="50%" alt=""/></span> 
											</div>
											<div class="col-md-4 col-xs-4 l-border" data-toggle="distpicker" style="padding-left:30px;">
												<select name="city" id="selectL" class="form-inline location-sel">
													<option value="">--城市--</option>
												</select>
												<span class="l-select-down"><img src="${basePath}/images/select_down.png" width="50%" height="50%" alt=""/></span>
											</div>
<!-- 										</div> -->
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-4 col-xs-4 control-label radio-lbl">户籍</label>
                                        <div class="census-register">
                                            <label class="radio-inline col-md-3 col-xs-3 radio1">
                                                <input type="radio" name="register" id="inlineRadio1" value="0" checked> 本地
                                            </label>
                                            <label class="radio-inline" style="margin-top:6px">
                                                <input type="radio" name="register" id="inlineRadio2" value="1"> 非本地
                                            </label>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-4 col-xs-4 control-label control-l">名下房产</label>
                                        <div class="col-md-8 col-xs-8 input-border">
                                            <select name="house" id="house" class="form-control" required oninvalid="setCustomValidity('请输入名下房产');" oninput="setCustomValidity('');" required="required">
                                                <option value="">请选择</option>
                                                <option value="无房产">无房产</option>
                                                <option value="有房产，还贷中">有房产，还贷中</option>
                                                <option value="有房产，无房贷">有房产，无房贷</option>
                                            </select>
                                            <span class="select-down"><img src="${basePath}/images/select_down.png" width="50%" height="50%" alt=""/></span>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-4 col-xs-4  control-label control-l"><span class="star">*</span>名下车辆</label>
                                        <div class="col-md-8 col-xs-8 input-border">
                                            <select name="car" id="car" class="form-control" required oninvalid="setCustomValidity('请输入名下车辆');" oninput="setCustomValidity('');" required="required">
                                                <option value="">请选择</option>
                                                <option value="有车辆，还贷中">有车辆，还贷中</option>
                                                <option value="有车辆，无车贷">有车辆，无车贷</option>
                                                <option value="无车辆">无车辆</option>
                                            </select>
                                            <span class="select-down"><img src="${basePath}/images/select_down.png" width="50%" height="50%"  alt=""/></span>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-4 col-xs-4 control-label control-l">您的职业</label>
                                        <div class="col-md-8 col-xs-8 input-border">
                                            <select name="profession" id="profession" class="form-control" required oninvalid="setCustomValidity('请输入您的职业');" oninput="setCustomValidity('');" required="required">
                                                <option value="">请选择</option>
                                                <option value="上班族">上班族</option>
                                                <option value="公务员">公务员</option>
                                                <option value="私营业主">私营业主</option>
                                                <option value="学生">学生</option>
                                            </select>
                                            <span class="select-down"><img src="${basePath}/images/select_down.png" width="50%" height="50%"  alt=""/></span>
                                        </div>
                                    </div>
                                   <div class="form-group salary-type" id="salaryType" style="display:none;">
                                       <label class="col-md-4 col-xs-4 control-label control-l">发工资形式</label>
                                       <div class="col-md-8 col-xs-8 input-border">
                                           <select name="pay_off" id="pay_off" class="form-control" required oninvalid="setCustomValidity('请输入发工资形式');" oninput="setCustomValidity('');" required="required">
                                               <option value="">请选择</option>
                                               <option value="银行卡发放">银行卡发放</option>
                                               <option value="现金发放">现金发放</option>
                                           </select>
                                           <span class="select-down"><img src="${basePath}/images/select_down.png" width="50%" height="50%" alt=""/></span>
                                       </div>
                                   </div>
                                    <div class="form-group" id="pay" style="display:none;">
                                       <label class="col-md-4 col-xs-4 control-label control-l">月收入</label>
                                       <div class="col-md-8 col-xs-8 input-border">
                                           <input type="text" class="form-control" id="income" name="m_income" onkeyup="if(this.value.length==1){this.value=this.value.replace(/[^0-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}"
                                           onafterpaste="if(this.value.length==1){this.value=this.value.replace(/[^0-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}"
                                           required oninvalid="setCustomValidity('请输入月收入');" oninput="setCustomValidity('');" placeholder="请输入月收入" maxlength="8">
                                       </div>
                                   </div>
                                   <div class="form-group" id="socialSecurity" style="display:none;">
                                       <label class="col-md-4 col-xs-4 control-label control-l">社保公积金</label>
                                       <div class="col-md-8 col-xs-8 input-border">
                                           <select name="social" id="social" class="form-control" required oninvalid="setCustomValidity('请输入社保公积金');" oninput="setCustomValidity('');" required="required">
                                               <option value="">请选择</option>
                                               <option value="缴费6个月以上">缴费6个月以上</option>
                                               <option value="缴费未满6个月">缴费未满6个月</option>
                                               <option value="无社保">无社保</option>
                                           </select>
                                           <span class="select-down"><img src="${basePath}/images/select_down.png" width="50%" height="50%" alt=""/></span>
                                       </div>
                                   </div>
                                   <div class="form-group" id="worktime" style="display:none;">
                                       <label class="col-md-4 col-xs-4  control-label control-l">工作时间</label>
                                       <div class="col-md-8 col-xs-8 input-border">
                                           <select name="w_time" id="w_time" class="form-control" required oninvalid="setCustomValidity('请输入工作时间');" oninput="setCustomValidity('');" required="required">
                                               <option value="">请选择</option>
                                               <option value="现单位6个月以内">现单位6个月以内</option>
                                               <option value="现单位6-12个月">现单位6-12个月</option>
                                               <option value="现单位12-24个月">现单位12-24个月</option>
                                               <option value="现单位24个月以上">现单位24个月以上</option>
                                           </select>
                                           <span class="select-down"><img src="${basePath}/images/select_down.png" width="50%" height="50%" alt=""/></span>
                                       </div>
                                   </div>
                                   <div class="form-group" id="ybusiness" style="display:none;">
                                       <label class="col-md-4 col-xs-4 control-label control-l">营业执照</label>
                                       <div class="col-md-8 col-xs-8 input-border">
                                           <select name="business" id="business" class="form-control" required oninvalid="setCustomValidity('请输入营业执照');" oninput="setCustomValidity('');" required="required">
                                               <option value="">请选择</option>
                                               <option value="注册一年以上">注册一年以上</option>
                                               <option value="注册一年以下">注册一年以下</option>
                                           </select>
                                           <span class="select-down"><img src="${basePath}/images/select_down.png" width="50%" height="50%" alt=""/></span>
                                       </div>
                                   </div>
                                   <div class="form-group">
                                       <label class="col-md-4 col-xs-4 control-label control-l"><span class="star">*</span>有无信用卡</label>
                                       <div class="col-md-8 col-xs-8 input-border">
                                           <select name="policy" id="policy" class="form-control" required oninvalid="setCustomValidity('请输入有无信用卡');" oninput="setCustomValidity('');" required="required">
                                               <option value="">请选择</option>
                                               <option value="有">有</option>
                                               <option value="无">无</option>
                                           </select>
                                           <span class="select-down"><img src="${basePath}/images/select_down.png" width="50%" height="50%" alt=""/></span>
                                       </div>
                                   </div> 
                                    <div class="form-group">
                                        <label class="col-md-4 col-xs-4 control-label radio-lbl">微粒贷</label>
                                        <div class="loans">
                                            <label class="radio-inline col-md-3 col-xs-3 radio1">
                                                <input type="radio" name="wmd" id="inlineRadio1" value="0"> 有
                                            </label>
                                            <label class="radio-inline" style="margin-top:6px">
                                                <input type="radio" name="wmd" id="inlineRadio2" value="1" checked> 无
                                            </label>
                                        </div>
                                    </div>
                                    <div class="form-group apply-btn">
                                        <input type="button" id="mysubmit" class="btn btn-submit btn-block" value="提交申请" />
                                    </div>
                                    <div class="note add-info">
                                        <p class="note-t">平台郑重承诺:</p>
                                        <p class="n-cbk">所有贷款申请在未成功放款前绝不收取任何费用，为保障您的资金安全，请不要相信任何要求您支付费用的信息、邮件、电话等不实信息。</p>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
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
	
		function proCity() {
		var parms = $("#myselect").val();
		
		$.ajax({
			type : "post",
			url : "${basePath}/logn/procity.shtml",
			data : {
				'procity' : parms
			},
			success : function(data) {
				var citys = data.citys;
				$("#selectL").empty();
				var html = "<option value=''>--城市--</option>";
				for (var i = 0; i < citys.length; i++) {
					html += " <option value="+citys[i].name+">" + citys[i].name + "</option>";
				}
				$("#selectL").append(html);
			}
		})
	}
	
   //回车控制
  $("#lognform").on("keydown", function(e) {
        var key = e.keyCode || e.which;
        if(key == 13) {
        	return true;
        }
    });
   
 //表单属性提交    必填项：贷款额度，所在地区，有无信用卡
   $(function(){
   	$("#mysubmit").click(function(){
   		
   		var qwmoney = $('#qwlogn').val();
   		var birth = $('#birth').val();
   		var myselect = $('#myselect').val();
   		var selectL = $('#selectL').val();
   		var house = $('#house').val();
   		var car = $('#car').val();
   		var profession = $('#profession').val();
   		var policy = $('#policy').val();
   		var current_date = new Date();
   		var input_date=new Date(Date.parse(birth.replace(/-/g, "/")));
   		
   		if(parseInt(qwmoney)<1 || qwmoney=='' || parseInt(qwmoney)>50){
   			layer.alert("请输入贷款金额1~50万元",{icon:7});
   			return false;
   		}
   		if(birth=='' || input_date>current_date){
   			layer.alert("请输入正确的出生年月",{icon:7});
   			return false;
   		}
   		if((myselect == '') || (selectL =='')){
   			layer.alert("请选择省市",{icon:7});
   			return false;
   		}
//    		if(house==''){
//    			layer.alert("请选择名下房产",{icon:7});
//    			return false;
//    		}
   		if(car==''){
   			layer.alert("请选择名下车辆",{icon:7});
   			return false;
   		}
//    		if(profession == "上班族"){
//    			var pay_off = $('#pay_off').val();
//    			var income = $('#income').val();
//    			var social = $('#social').val();
//    			var w_time = $('#w_time').val();
//    			//清除不属属性
//    			$('#business').val("");
//    			if(pay_off==''){
//    				layer.alert("请选择发工资形式",{icon:7});
//    				return false;
//    			}
//    			if(income=='' || parseInt(income)<1000){
//    				layer.alert("请输入真实月收入",{icon:7});
//    				return false;
//    			}
//    			if(social==''){
//    				layer.alert("请选择社保缴费期限",{icon:7});
//    				return false;
//    			}
//    			if(w_time==''){
//    				layer.alert("请选择现单位工作时间",{icon:7});
//    				return false;
//    			}
// 		   }else if(profession == "公务员"){
// 			   var income = $('#income').val();
// 			   var w_time = $('#w_time').val();
// 			   //清除不属属性
// 			   $('#pay_off').val("");
// 			   $('#social').val(""); 
// 			   $('#business').val(""); 
// 			   if(income=='' || parseInt(income)<1000){
// 	   				layer.alert("请输入真实月收入",{icon:7});
// 	   				return false;
// 	   			}
// 			   if(w_time==''){
// 	   				layer.alert("请选择现单位工作时间",{icon:7});
// 	   				return false;
// 	   			}
// 		   }else if(profession == "私营业主"){
// 			   var income = $('#income').val();
// 			   var business = $('#business').val();
// 			   //清除不属属性
// 			   $('#pay_off').val("");
// 			   $('#social').val(""); 
// 			   $('#w_time').val(""); 
// 			   if(income=='' || parseInt(income)<1000){
// 	   				layer.alert("请输入真实月收入",{icon:7});
// 	   				return false;
// 	   			}
// 			   if(business==''){
// 	   				layer.alert("请选择营业执照注册年限",{icon:7});
// 	   				return false;
// 	   			}
// 		   }else if(profession == "学生"){
// 			   var policy = $('#policy').val();
// 			   //清除不属属性
// 			   $('#pay_off').val("");
// 			   $('#social').val(""); 
// 			   $('#w_time').val(""); 
// 			   $('#business').val("");
// 			   $('#income').val("");
// 			   if(policy==''){
// 		   			layer.alert("请选择有无信用卡",{icon:7});
// 		   			return false;
// 		   		}
// 		   }else{
// 			   layer.alert("请选择您的职业",{icon:7});
// 			   return false;
// 		   }

   		if(policy==''){
   			layer.alert("请选择有无信用卡",{icon:7});
   			return false;
   		}
   		
   		var parms = $("#lognform").serialize();
   		
   		$.ajax({
   			type:"post",
   			url:"${basePath}/logn/lognInfo.shtml",
   			data:parms,
   			success: function(data){
   				if(data.success == 0){
	        		window.location.href='${basePath}/logn/applySuccess.shtml';
	        		$("#lognform").empty();
	        	}else if(data.success == 1){
	        		window.location.href='${basePath}/home/index.shtml';
	        	}
   			}
   			
   		})
   		
   	});
   })
 
   $(function(){
	   $("#profession").change(function(){
		   if($('#profession option:selected') .val() == "上班族"){
			   $("#salaryType").css('display','block');
			   $("#socialSecurity").css('display','block');
			   $("#pay").css('display','block');
			   $("#worktime").css('display','block');
			   $("#ybusiness").css('display','none');
			   return true;
		   }else if($('#profession option:selected') .val() == "公务员"){
			   $("#worktime").css('display','block');
			   $("#pay").css('display','block');
			   $("#salaryType").css('display','none');
			   $("#socialSecurity").css('display','none');
			   $("#ybusiness").css('display','none');
			   return true;
		   }else if($('#profession option:selected') .val() == "私营业主"){
			   $("#ybusiness").css('display','block');
			   $("#pay").css('display','block');
			   $("#socialSecurity").css('display','none');
			   $("#salaryType").css('display','none');
			   $("#worktime").css('display','none');
			   return true;
		   }else if($('#profession option:selected') .val() == "学生"){
			   $("#worktime").css('display','none');
			   $("#pay").css('display','none');
			   $("#salaryType").css('display','none');
			   $("#socialSecurity").css('display','none');
			   $("#ybusiness").css('display','none');
			   return true;
		   }else{
			   return false;
		   }
	   })
   })
   
</script>
</body>
</html>