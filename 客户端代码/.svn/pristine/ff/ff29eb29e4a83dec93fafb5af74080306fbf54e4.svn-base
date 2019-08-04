<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>交换申请信息修改</title>

        <!-- CSS -->
        <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/font-awesome/css/font-awesome.min.css">
		<link rel="stylesheet" href="assets/css/form-elements.css">
        <link rel="stylesheet" href="assets/css/style.css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!-- Favicon and touch icons -->
        <link rel="shortcut icon" href="assets/ico/favicon.png">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="assets/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="assets/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="assets/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="assets/ico/apple-touch-icon-57-precomposed.png">
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<script>
			function passwdJudge(){
				var passwd = document.getElementById("passwd");
				var memberpasswd = document.getElementById("memberpasswd");
				if(passwd.value.length < 6){
					memberpasswd.style.visibility = "visible";
				}
				else{
					memberpasswd.style.visibility = "hidden";
				}
			}
			function passwdJudge2(){
				var passwd = document.getElementById("passwd");
				var repasswd = document.getElementById("repasswd");
				var memberpasswd2 = document.getElementById("memberpasswd2");
				var passwdsame = document.getElementById("passwdsame");
				if(repasswd.value.length < 6){
					memberpasswd2.style.visibility = "visible";
				}
				else{
					memberpasswd2.style.visibility = "hidden";
					if(repasswd.value != passwd.value){
						passwdsame.style.visibility = "visible";
					}
					else{
						passwdsame.style.visibility = "hidden";
					}
				}
			}
			function memberidJudge(){
				var idjudge = document.getElementById("idJudge");
				var memberid = document.getElementById("memberid");
				if(idjudge.value.length != 18 || isNaN(idjudge.value)){
					memberid.style.visibility = "visible";
				}
				else{
					memberid.style.visibility = "hidden";
				}
			}
			function verify(){
				var memberpasswd = document.getElementById("memberpasswd");
				var memberpasswd2 = document.getElementById("memberpasswd2");
				var passwdsame = document.getElementById("passwdsame");
				var memberid = document.getElementById("memberid");
				var str1 = memberpasswd.style.visibility;
				var str2 = memberpasswd2.style.visibility;
				var str3 = passwdsame.style.visibility;
				var str4 = memberid.style.visibility;
				if(str1 == "visible" ||str2 == "visible" ||str3 == "visible" ||str4 == "visible"){
					alert("信息未填写完整");
					return false;
				}
				else{
					alert("提交成功！");
					return true;
				}
			}
		</script>

    </head>
	<style>
		#submit{
			height: 50px;
			margin: 0;
			padding: 0 20px;
			vertical-align: middle;
			background: #19b9e7;
			border: 0;
			font-family: 'Roboto', sans-serif;
			font-size: 16px;
			font-weight: 300;
			line-height: 50px;
			color: #fff;
			-moz-border-radius: 4px;
			-webkit-border-radius: 4px;
			border-radius: 4px;
			text-shadow: none;
			-moz-box-shadow: none;
			-webkit-box-shadow: none;
			box-shadow: none;
			-o-transition: all .3s;
			-moz-transition: all .3s;
			-webkit-transition: all .3s;
			-ms-transition: all .3s;
			transition: all .3s;
		}
		#memberpasswd{
			margin-left: 50px;
			font-size: 13px;
			color: red;
			visibility: hidden;
			display: inline;
		}
		#memberpasswd2{
			margin-left: 50px;
			font-size: 13px;
			color: red;
			visibility: hidden;
			display: inline;
		}
		#passwdsame{
			position: absolute;
			top: 63px;
			left: 370px;
			font-size: 13px;
			color: red;
			visibility: hidden;
			display: inline;
		}
		#memberid{
			margin-left: 50px;
			font-size: 13px;
			color: red;
			visibility: hidden;
			display: inline;
		}
	</style>
    <body>

		<!-- Top menu -->
		<nav class="navbar navbar-inverse navbar-no-bg" role="navigation">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#top-navbar-1">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
				</div>
				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse" id="top-navbar-1">
					<ul class="nav navbar-nav navbar-right">
					</ul>
				</div>
			</div>
		</nav>

        <!-- Top content -->
        <div class="top-content">
        	
            <div class="inner-bg">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-8 col-sm-offset-2 text">
                            <h1><strong>会员</strong> 信息修改</h1>
                            <div class="description">
                            	<p>
	                            	Change the changeapply's information that you want to select!
                            	</p>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-6 col-sm-offset-3 form-box">
                        	
                        	<form role="form" action="ChangeMemberAction" method="get" class="registration-form" onsubmit="return verify()">
                        		
                        		<fieldset>
		                        	<div class="form-top">
		                        		<div class="form-top-left">
		                        			<h3>${param.member}</h3>
		                            		<p>Change the informations you wang to change:</p>
		                        		</div>
		                        		<div class="form-top-right">
		                        			<i class="fa fa-user"></i>
		                        		</div>
		                            </div>
		                            <div class="form-bottom">
				                    	<div class="form-group">
				                    		<label class="sr-only" for="form-first-name">新密码</label>
				                        	<input type="password" name="repasswd" onblur="passwdJudge()" placeholder="新密码" value="${member.password}" class="form-first-name form-control" id="form-first-name">
				                        	<div id="memberpasswd">请输入六位以上的数字或字符</div>
				                        </div>
				                        <div class="form-group">
				                        	<label class="sr-only" for="form-last-name">请再次输入密码</label>
				                        	<input type="password" name="repasswd" onblur="passwdJudge2()" value="${member.password }" placeholder="再次输入密码"  class="form-last-name form-control" id="form-last-name">
				                        	<div id="memberpasswd2">请输入六位以上的数字或字符</div>
											<div id="passwdsame">密码不相同</div>
				                        </div>
				                        <div class="form-group">
				                        	<label class="sr-only" for="form-last-name">身份证号</label>
				                        	<input type="text" name="rememberid" onblur="memberidJudge()" placeholder="身份证号"  value="${member.memberid}" class="form-last-name form-control" id="form-last-name">
				                        	<div id="memberid">格式必须为18位数字</div>
				                        </div>
				                        <div class="form-group">
				                        	<label class="sr-only" for="form-last-name">密保问题答案</label>
				                        	<input type="text" name="reanswer" placeholder="密保问题答案" value="${member.answer} " class="form-last-name form-control" id="form-last-name">
				                        </div>
				                        <div class="form-group">
				                        	<label class="sr-only" for="form-last-name">密保问题编号</label>
				                        	<input type="text" name="requestionid" placeholder="密保问题编号" value="${member.deptno}" class="form-last-name form-control" id="form-last-name">
				                        </div>
				                        <input type="submit" class="btn btn-next" id="submit">
				                    </div>
			                    </fieldset>
			                    <input  type="hidden" name="caid" value="${member.memberphone}"/>
		                    </form>
		                    
                        </div>
                    </div>
                </div>
            </div>
            
        </div>

        <!-- Javascript -->
        <script src="assets/js/jquery-1.11.1.min.js"></script>
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
        <script src="assets/js/jquery.backstretch.min.js"></script>
        <script src="assets/js/retina-1.1.0.min.js"></script>
        <script src="assets/js/scripts.js"></script>
        
        <!--[if lt IE 10]>
            <script src="assets/js/placeholder.js"></script>
        <![endif]-->

    </body>

</html>
    