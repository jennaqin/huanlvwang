<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>zhuce</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="robots" content="all,follow">
    <link rel="stylesheet" href="vendor/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="vendor/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="css/fontastic.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins:300,400,700">
    <link rel="stylesheet" href="css/style.default.css" id="theme-stylesheet">
    <link rel="stylesheet" href="css/custom.css">
    <link rel="shortcut icon" href="img/favicon.ico">
    <script type="text/javascript" src="comm/jquery-2.1.4.js"></script>
    <script type="text/javascript">
    
	function myClick(){
		location.href="actionEmployee?method=getReturn";
	}
	function idPassword(obj){
		if(obj.length==0) 
		{ 
			alert('密码不能为空！');
			return false; 
		} 
		if(obj.length!=11) 
		{ 
			alert('请输入六位密码！');
			return false; 
		} 
	}
	
	function isPhone(obj) 
	{ 
		if(obj.length==0) 
		{ 
			alert('手机号码不能为空！');
			return false; 
		} 
		if(obj.length!=11) 
		{ 
			alert('请输入有效的手机号码，必须是11位！');
			return false; 
		} 
	
		var myreg = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1}))+\d{8})$/; 
		if(!myreg.test(mobile)) 
		{ 
			alert('请输入有效的手机号码！'); 
			return false; 
		} 
		var reg = /^[0-9]+$/; 
		if(obj!=""&&!reg.test(obj)){ 
		alert('只能输入数字！'); 
		return false; 
		} 
	} 
	function idLength(obj){
		if(obj.length==0) 
		{ 
			alert('身份证号码不能为空！');
			return false; 
		} 
		if(obj.length!=18) 
		{ 
			alert('请输入有效的身份证号码，必须是18位！');
			return false; 
		} 
	}
	</script>
  </head>
  <body>
    <div class="page login-page">
      <div class="container d-flex align-items-center">
        <div class="form-holder has-shadow">
          <div class="row">
            <!-- Logo & Information Panel-->
            <div class="col-lg-6">
              <div class="info d-flex align-items-center">
                <div class="content">
                  <div class="logo">
                    <h1>注册</h1>
                  </div>
                  <p>Register to our site</p>
                   
                </div>
              </div>
            </div>
            <!-- Form Panel    -->
            <div class="col-lg-6 bg-white">
              <div class="form d-flex align-items-center">
                <div class="content">
                
                  <form class="form-validate" action="InsertAction" method="get">
                    <div class="form-group">
                      <input id="register-username" type="text" name="registerUsername" required data-msg="Please enter your username" class="input-material" onblur="isPhone(this.value) ">
                      <label for="register-username" class="label-material">手机号</label>
                    </div>
                    <div class="form-group">
                      <input id="register-password" type="password" name="registerPassword" required data-msg="Please enter your password" class="input-material" onblur="idPassword(this.value)">
                      <label for="register-password" class="label-material">请输入六位密码</label>
                    </div>
                    <div class="form-group">
                      <input id="register-username" type="text" name="registerUsername" required data-msg="Please enter a valid ID card" class="input-material" onblur="idLength(this.value)">
                      <label for="register-email" class="label-material">身份证ID</label>
                    </div>
                    <div class="form-group">
							                        请选择你的密保问题：
											<select name="deptno" >
												<c:forEach items="${depts }" var="dept">
													<option value="${dept.deptno }">${dept.ques }</option>
												</c:forEach>
												
											</select>
                    </div>
                    <div class="form-group">
                      <input id="register-username" type="text" name="answer" required data-msg="Please enter a valid answer" class="input-material">
                      <label for="register-email" class="label-material">密保答案</label>
                    </div>
                    <div class="form-group terms-conditions">
                      <input id="register-agree" name="registerAgree" type="checkbox" required value="1" data-msg="Your agreement is required" class="checkbox-template">
                      <label for="register-agree">Agree the terms and policy</label>
                    </div>
                    <div class="form-group">
                    <input type="hidden" name="method" value="save" >
			
                      <button id="regidter" type="submit" name="registerSubmit" class="btn btn-primary">Register</button>
                    	<button id="regidter" type="submit" name="registerSubmit" class="btn btn-primary" style="position:absolute; left:70%" onclick="myClick();">return</button>
                    </div>
                  </form><small>Already have an account? </small><a href="login.html" class="signup">Login</a>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      
    </div>
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/popper.js/umd/popper.min.js"> </script>
    <script src="vendor/bootstrap/js/bootstrap.min.js"></script>
    <script src="vendor/jquery.cookie/jquery.cookie.js"> </script>
    <script src="vendor/chart.js/Chart.min.js"></script>
    <script src="vendor/jquery-validation/jquery.validate.min.js"></script>
    <script src="js/front.js"></script>
  </body>
</html>