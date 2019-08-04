<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="common/jquery-2.1.4.js"></script>
<script type="text/javascript" src="common/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
<link href="common/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<style type="text/css">
		#b1,#b3,#b4{
	font-size: 17px;
	cursor: pointer;
}
.dtable{
	/* width: 1000px;
	height: 270px; */
	font-size: 16px;
	position: absolute;
	margin-top: 150px;
	margin-left: 90px;
	/* border-collapse: collapse; */
}
/* #dtable td{
	border-bottom: 1px solid #aaa;
} */
#title{
	position: absolute;
	margin-top: 40px;
	margin-left: 65px;
	font-size: 35px;
}
#b1{
	color: white;
 	background: #333;
	position: absolute;
	margin-top: 50px;
	transition: background-color 0.2s, color 0.2s;
	width: 450px;
	height: 3px;
	margin-left: 3px;
	border:none;
	outline: none;
}
#b3{
 	background: #F5F5F5;
	position: absolute;
	margin-top: 50px;	
	transition: background-color 0.2s, color 0.2s;
	width: 450px;
	height: 35px;
	margin-left: 453px;
	border:none;
	outline: none;
}
#b4{
	position: absolute;
	background: #F5F5F5;
	margin-top: 50px;
	transition: background-color 0.2s, color 0.2s;
	width: 450px;
	height: 35px;
	margin-left: 906px;
	border:none;
	outline: none;
}
.tr1{
	cursor: pointer;
	transition: all 100ms;
}
</style>
</head>
<body>
	<div class="container">
		<span id="title">个人中心<span>
		<a href="DeleteAction?method=getT2&memberphone=${Member.memberphone }"><button id="b1" onclick="change(1)">基本信息</button></a><a href="DeleteAction?method=getT"><button id="b3" onclick="change(3)">社交信息</button></a><a href="DeleteAction?method=getT1"><button id="b4" onclick="change(4)">房屋信息</button></a>
		</div>
			<div id="details3">
			<div class="row">
			<hr>
			<table class="table table-hover table-bordered dtable">		
			<tr class="tr1">
				<th>
					<input type="checkbox" id="sla">
				</th>
				<th class="active">手机号</th>
				<th class="success">密码</th>
				<th class="warning">身份证号码</th>
				<th class="danger">密保问题答案</th>
				<th class="info">密保问题编号</th>
			</tr >
			<c:forEach items="${pageinfo.mem}" var="mems">
				<tr class="tr1">
					<!-- <td>uy5y3485ucohr</td> -->
					<td>
						<input type="checkbox" id="${mems.memberphone }" name='memsflag'>
					</td>
					<td>${mems.memberphone }</td>
					<td>${mems.password }</td>
					<td>${mems.memberid }</td>
					<td>${mems.answer }</td>
					<td>${mems.deptno }</td>
					<td>
						<a href="IMemberAction?memberphone=${mems.memberphone}">修改</a>
					</td>
				</tr>
			</c:forEach>
		</table> 
		</div>
		</div>
		<script type="text/javascript">
		$(function(){
			$('#sla').on('click',function(){
				$('input[name="housflag"]').prop('checked',$('#sla').prop('checked'));
			});
		});	
	</script>
</body>
</html>