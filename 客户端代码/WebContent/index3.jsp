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
	width: 1000px;
	height: 40px;
	font-size: 16px;
	position: absolute;
	margin-top: 170px;
	margin-left: 500px;
	border-collapse: collapse;
}
 #dtable td{
	border-bottom: 1px solid #aaa;
} 
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
 	color: white;
 	background: #333;
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
	margin-top: 50px;
	background: #F5F5F5;
	transition: background-color 0.2s, color 0.2s;
	width: 450px;
	height: 35px;
	margin-left: 906px;
	border:none;
	outline: none;
}
</style>
<script type="text/javascript" src="common/jquery-2.1.4.js"></script>
</head>
<body>
	<div class="container">
		<span id="title">个人中心<span>
		<a href="DeleteAction?method=getT2"><button id="b1" onclick="change(1)">基本信息</button></a>
		<a href="DeleteAction?method=getT"><button id="b3" onclick="change(3)">社交信息</button></a>
		<a href="DeleteAction?method=getT1"><button id="b4" onclick="change(4)">房屋信息</button></a>
		</div>
		<div id="details3">
		<div class="row">
		<hr>
			<table class="table table-hover table-bordered  dtable">	
			<tr >
				<th>
					<input type="checkbox" id="sla">
				</th>
				<th class="active">手机号</th>
				<th class="success">目标城市</th>
				<th class="warning">详细地址</th>
				<th class="danger">开始的时间</th>
				<th class="info">结束的时间</th>
				<th class="success">申请成功</th>
				<th class="warning">成功的日期 </th>
				<th class="danger">功能</th>
			</tr >
			<c:forEach items="${pageinfo.hos}" var="hous">
				<tr class="tr1">
					<!-- <td>uy5y3485ucohr</td> -->
					<td>
						<input type="checkbox" id="${hous.caid }" name='housflag'>
					</td>
					<td>${hous.caid }</td>
					<td>${hous.cacity }</td>
					<td>${hous.caddress }</td>
					<td>${hous.castarttime }</td>
					<td>${hous.cacomplishtime }</td>
					<td>${hous.cajudge }</td>
					<td>${hous.casuccessdate }</td>
					<td>
						<a href="DeleteAction?caid=${hous.caid }&method=delete&cpage=${pageinfo.cpage}">删除</a>
						<a href="ChangeApplyAction?caid=${hous.caid }">修改</a>
					</td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="10">
					共有【${pageinfo.count }】条交换信息，分为【${pageinfo.maxpage}】页，当前显示【${pageinfo.cpage}/${pageinfo.maxpage }】页
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					
					<a href="DeleteAction?method=getPage&cpage=1">首页</a>
					<a href="DeleteAction?method=getPage3&cpage=${pageinfo.cpage-1}&maxpage=${pageinfo.maxpage}">上一页</a>
					<a href="DeleteAction?method=getPage3&cpage=${pageinfo.cpage+1}&maxpage=${pageinfo.maxpage}">下一页</a>
					<a href="DeleteAction?method=getPage3&cpage=${pageinfo.maxpage}&maxpage=${pageinfo.maxpage}">尾页</a>
					
					&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="text" id="cp"><button id="btn">跳转</button>
					<button id="deleteAllBtn">批量删除</button>
				</td>
			</tr>
		</table> 
		</div>
		</div>
		<script type="text/javascript">
		$(function(){
			$('#btn').on('click',function(){
				location.href="DeleteAction?method=getPage&cpage="+$('#cp').val();
			});
			
			$('#sla').on('click',function(){
				$('input[name="housflag"]').prop('checked',$('#sla').prop('checked'));
			});
			$('#deleteAllBtn').on('click',function(){
				/* v:是对应的复选框的dom对象 */
				var ids="";
				$('input[name="housflag"]:checked').each(function(i,v){
					/* $(V)将dom对象转化成jquery对象 */	
				/* 	console.log(i+"    "+$(v).attr('id')); */
				ids+=$(v).attr('id')+",";
				});
				location.href="DeleteAction?method=batchDelete&ids="+ids.substring(0,ids.length-1);
			});
		});	
		</script>
</body>
</html>