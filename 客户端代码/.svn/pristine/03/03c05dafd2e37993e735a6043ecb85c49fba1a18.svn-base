<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>房源信息修改</title>

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
		<script type="text/javascript">
			function verify(){
				alert("提交成功！");
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
                            <h1><strong>房源</strong> 信息修改</h1>
                            <div class="description">
                            	<p>
	                            	Change the house's information that you want to select!
                            	</p>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-6 col-sm-offset-3 form-box">
                        	
                        	<form role="form" action="ChangeHouseAction" method="get" class="registration-form" onsubmit="return verify()">
                        		
                        		<fieldset>
		                        	<div class="form-top">
		                        		<div class="form-top-left">
		                        			<h3>${param.phone}</h3>
		                            		<p>Change the informations you wang to change:</p>
		                        		</div>
		                        		<div class="form-top-right">
		                        			<i class="fa fa-user"></i>
		                        		</div>
		                            </div>
		                            <div class="form-bottom">
				                    	<div class="form-group">
				                    		<label class="sr-only" for="form-first-name">城市</label>
				                        	<input type="text" name="rehcity" placeholder="城市" value="${house.housecity }" class="form-first-name form-control" id="form-first-name">
				                        </div>
				                        <div class="form-group">
				                        	<label class="sr-only" for="form-last-name">地址</label>
				                        	<input type="text" name="rehaddress" placeholder="地址"  value="${house.houseaddr }" class="form-last-name form-control" id="form-last-name">
				                        </div>
				                        <div class="form-group">
				                        	<label class="sr-only" for="form-last-name">房屋面积</label>
				                        	<input type="text" name="reharea" placeholder="房屋面积" value="${house.housearea} " class="form-last-name form-control" id="form-last-name">
				                        </div>
				                        <div class="form-group">
				                        	<label class="sr-only" for="form-last-name">卧室</label>
				                        	<input type="text" name="rehbedroom" placeholder="卧室" value="${house.housebedroom }" class="form-last-name form-control" id="form-last-name">
				                        </div>
				                        <div class="form-group">
				                        	<label class="sr-only" for="form-last-name">客厅</label>
				                        	<input type="text" name="rehlivingroom" placeholder="客厅" value="${house.househallroom }" class="form-last-name form-control" id="form-last-name">
				                        </div>
				                        <div class="form-group">
				                        	<label class="sr-only" for="form-last-name">阳台</label>
				                        	<input type="text" name="rehbalcony" placeholder="阳台" value="${house.housebalconyroom }" class="form-last-name form-control" id="form-last-name">
				                        </div>
				                        <div class="form-group">
				                        	<label class="sr-only" for="form-last-name">卫生间</label>
				                        	<input type="text" name="rehwashingroom" placeholder="卫生间" value="${house.houserestroom }" class="form-last-name form-control" id="form-last-name">
				                        </div>
				                        <div class="form-group">
				                        	<label class="sr-only" for="form-last-name">厨房</label>
				                        	<input type="text" name="rehkitchen" placeholder="厨房" value="${house.housekitchen }" class="form-last-name form-control" id="form-last-name">
				                        </div>
				                        <div class="form-group">
				                        	<label class="sr-only" for="form-last-name">居住人数</label>
				                        	<input type="text" name="relivingnum" placeholder="居住人数" value="${house.houselivingnum }" class="form-last-name form-control" id="form-last-name">
				                        </div>
				                        <div class="form-group">
				                        	<label class="sr-only" for="form-last-name">床数</label>
				                        	<input type="text" name="rebednum" placeholder="床数" value="${house.housebedroomnum }" class="form-last-name form-control" id="form-last-name">
				                        </div>
				                        <div class="form-group">
				                        	<label class="sr-only" for="form-last-name">居住开始日期</label>
				                        	<input type="text" name="relivingstart" placeholder="居住开始日期" value="${house.housebeginliving }" class="form-last-name form-control" id="form-last-name">
				                        </div>
				                        <div class="form-group">
				                        	<label class="sr-only" for="form-last-name">居住结束日期</label>
				                        	<input type="text" name="relivingfinish" placeholder="居住结束日期" value="${house.houseendliving }" class="form-last-name form-control" id="form-last-name">
				                        </div>
				                        <input type="submit" class="btn btn-next" id="submit">
				                    </div>
			                    </fieldset>
			                    <input type="hidden" name="phone" value="${house.phone}"/>
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

