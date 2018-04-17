<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
	<title>申请成功</title>
    <link rel="stylesheet" type="text/css" href="${basePath}/bootstrap/dist/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${basePath}/css/main.css">
    <link rel="stylesheet" type="text/css" href="${basePath}/iconfont/demo.css">
    <link rel="stylesheet" type="text/css" href="${basePath}/iconfont/iconfont.css">
    <script src="${basePath}/js/jquery-2.1.4.js"></script>
    <script src="${basePath}/bootstrap/dist/js/bootstrap.min.js"></script>
    <script src="${basePath}/js/layer/layer.js" type="text/javascript"></script>
    
	<script>
		var _hmt = _hmt || [];
		(function() {
			var hm = document.createElement("script");
			hm.src = "https://hm.baidu.com/hm.js?0c71f8932ec3308cdcb709f7038e2e9d";
			var s = document.getElementsByTagName("script")[0];
			s.parentNode.insertBefore(hm, s);
		})();
		
		function linkpush(value,type){
			
			if(type==1){
				window.location.href=value;
			}else if(type==2){
				window.location.href=value;
			}else{
				return;
			}
			$.ajax({
				type:"post",
				url:"${basePath}/logn/linkPush.shtml",
				data:{'type':type},
			})
		}
	</script>
</head>

<body>
    <div class="container-fluid">
        <div class="row">
                <!-- 顶部-->
                <div class="top">
                    <nav class="navbar navbar-default navbar-fixed-top">
                        <div class="container-fluid">
                            <div class="col-sm-6 col-xs-6 navbar-header">
                                <a href="">
                                    <img src="${basePath}/images/pic_03.png" alt="公司logo" class="logo" style="float:left;">
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
                <div class="container apply-cnt">
                    <div style="text-align: center;">
                        <div class="submit-msg">您的贷款申请已提交</div>
                        <p class="passing-rate">我们将选择最合适您的贷款机构，通过率高达90%</p>
                        <p class="passing-rate"><span class="glyphicon glyphicon-info-sign"></span>以下贷款机构可能会联系您</p>
                        <div class="put-number" style="overflow:hidden;">
                            <div class="col-sm-6 col-xs-12 pingan pingan-account" >
                                <img src="${basePath}/images/pingan.jpg" alt="" style="width:100%;">
                                <div class="account">已投放：23.5万人</div>
                            </div>
                            <div class="col-sm-6 col-xs-12 pingan">
                                <img src="${basePath}/images/ctcf.jpg" alt="" style="width:100%;">
                                <div class="account">已投放：33万人</div>
                            </div>
                        </div>
                        <div class="box">
                            <span class="title">特别推荐超高额度信用卡</span>
                        </div>
                        <div class="citicpe">
                            <img src="${basePath}/images/cmbc-card.jpg" style="width:100%;" alt="招商银行信用卡办理">
                            <button id="zhaoS" name="zhaoS" onclick="linkpush(this.value,1)" value="https://ccclub.cmbchina.com/CrdCardApply/LoginChannelSelect.aspx?cardsel=uc&WT.mc_id=N3700MM2075H741500HH"  type="button" class="btn btn-card col-md-12 col-xs-12">
                            <span class="glyphicon glyphicon-triangle-top"></span>点击办卡</button>
                        </div>
                        <div class="pingan-card">
                            <img src="${basePath}/images/pingan-card.jpg" style="width:100%;" alt="平安要银行信用卡办理">
                            <button id="pingA" name="pingA" onclick="linkpush(this.value,2)" value="https://c.pingan.com/apply/mobile/apply/index.html?scc=910000313&ccp=1a2a3a4a5a8a9a10a11a12a13&showt=0" type="button" class="btn btn-card col-md-12 col-xs-12">
                            <span class="glyphicon glyphicon-triangle-top"></span>点击办卡</button>
                        </div>
                    </div>
                </div>
                <!-- 底板版权-->
                <div class="navbar navbar-default navbar-fixed-bottom">
                    <span class="bottom-cnt">沪ICP备12013087号-22</span>
                </div>
            </div>
        </div>
</body>
</html>