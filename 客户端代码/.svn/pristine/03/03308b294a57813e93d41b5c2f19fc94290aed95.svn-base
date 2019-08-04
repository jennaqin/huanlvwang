<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="common/jquery-2.1.4.js"></script>
<script type="text/javascript" src="common/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
<link href="common/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<title>Insert title here</title>
<style type="text/css">
		#b1,#b3,#b4{
	font-size: 17px;
	cursor: pointer;
}
#title{
	position: absolute;
	margin-top: 40px;
	margin-left: 65px;
	font-size: 35px;
}
#details3{
	position: absolute;
}
.tr1{
	cursor: pointer;
	transition: all 100ms;
}
.dtable{
	/* width: 1000px;
	height: 270px; */
	font-size: 16px;
	position: absolute;
	margin-top: 170px;
	margin-left: 60px;
	/* border-collapse: collapse; */
}
/* #dtable td{
	border-bottom: 1px solid #aaa;
} */
#b1{
	/* color: white; */
	position: absolute;
	margin-top: 50px;
	/* background: #333; */
	background: #F5F5F5;
	transition: background-color 0.2s, color 0.2s;
	width: 450px;
	height: 35px;
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
	color: white;
 	background: #333;
	position: absolute;
	margin-top: 50px;
	transition: background-color 0.2s, color 0.2s;
	width: 450px;
	height: 35px;
	margin-left: 906px;
	border:none;
	outline: none;
}
</style>
</head>
<body>
	<div class="container">
		<span id="title">个人中心<span>
		<a href="DeleteAction?method=getT2"><button id="b1" onclick="change(1)">基本信息</button></a>
		<a href="DeleteAction?method=getT"><button id="b3" onclick="change(3)">社交信息</button></a>
		<a href="DeleteAction?method=getT1"><button id="b4" onclick="change(4)">房屋信息</button></a>
		</div>
		<div id="details4">
		<div class="row">
		<hr>
		<table class="table table-hover table-bordered dtable">		
			<tr >
				<th>
					<input type="checkbox" id="sla">
				</th>
				<th class="active">手机号</th>
				<th class="success">房屋所在城市</th>
				<th class="warning">详细地址</th>
				<th class="danger">房屋数</th>
				<th class="info">室</th>
				<th class="active">厅</th>
				<th class="success">阳台</th>
				<th class="warning">卫生间 </th>
				<th class="danger">厨房 </th>
				<th class="info">易住人数</th>
				<th class="active">床数</th>
				<th class="success">开始时间 </th>
				<th class="warning">结束时间 </th>
			</tr >
			<c:forEach items="${pageinfo.hos1}" var="hos">
				<tr class="tr1">
					<!-- <td>uy5y3485ucohr</td> -->
					<td>
						<input type="checkbox" id="${hos.phone }" name='hosflag'>
					</td>
					<td>${hos.phone }</td>
					<td>${hos.housecity }</td>
					<td>${hos.houseaddr }</td>
					<td>${hos.housearea }</td>
					<td>${hos.housebedroom }</td>
					<td>${hos.househallroom }</td>
					<td>${hos.housebalconyroom }</td>
					<td>${hos.houserestroom }</td>
					<td>${hos.housekitchen }</td>
					<td>${hos.houselivingnum }</td>
					<td>${hos.housebedroomnum }</td>
					<td>${hos.housebeginliving }</td>
					<td>${hos.houseendliving }</td>
					<td>
						<a href="DeleteAction?phone=${hos.phone }&method=delete1&cpage=${pageinfo.cpage}">删除</a>
						<a href="HouseChangeAction?phone=${hos.phone }">修改</a>
					</td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="14">
					共有【${pageinfo.count1 }】条交换信息，分为【${pageinfo.maxpage}】页，当前显示【${pageinfo.cpage}/${pageinfo.maxpage }】页
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					
					<a href="DeleteAction?method=getPage1&cpage=1">首页</a>
					<a href="DeleteAction?method=getPage2&cpage=${pageinfo.cpage-1}&maxpage=${pageinfo.maxpage}">上一页</a>
					<a href="DeleteAction?method=getPage2&cpage=${pageinfo.cpage+1}&maxpage=${pageinfo.maxpage}">下一页</a>
					<a href="DeleteAction?method=getPage2&cpage=${pageinfo.maxpage}&maxpage=${pageinfo.maxpage}">尾页</a>
					&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="text" id="cp"><button id="btn">跳转</button>
				</td>
				<td><button id="deleteAllBtn">批量删除</button></td>
			</tr>
		</table> 
		</div>
		</div>
		<script type="text/javascript">
		$(function(){
			$('#btn').on('click',function(){
				location.href="DeleteAction?method=getPage2&cpage="+$('#cp').val();
			});
			
			$('#sla').on('click',function(){
				$('input[name="hosflag"]').prop('checked',$('#sla').prop('checked'));
			});
			$('#deleteAllBtn').on('click',function(){
				/* v:是对应的复选框的dom对象 */
				var ids="";
				$('input[name="hosflag"]:checked').each(function(i,v){
					/* $(V)将dom对象转化成jquery对象 */	
				/* 	console.log(i+"    "+$(v).attr('id')); */
				ids+=$(v).attr('id')+",";
				});
				location.href="DeleteAction?method=batchDelete1&ids="+ids.substring(0,ids.length-1);
			});
		});	
		</script>
</body>
</html>