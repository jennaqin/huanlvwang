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
	#aa{
		font-size:35px;	
	}
</style>
</head>
<body>
<hr>
	<div class="container">
		<a href="DeleteMemberAction?method=getT"><button>会员信息</button></a>
		<div id="aa">所有会员信息</div>
		<div class="row">
			<table class="table table-hover table-bordered">				
				<tr>
				  <td class="active">手机号</td>
				  <td class="success">密码</td>
				  <td class="warning">身份证号码</td>
				  <td class="danger">问题编号</td>
				  <td class="info">答案</td>
				 </tr>
				 <c:forEach items="${pageinfo.mem}" var="mems">
				<tr class="tr1">
					<!-- <td>uy5y3485ucohr</td> -->
					<%-- <td>
						<input type="checkbox" id="${mems.memberphone }" name='memflag'>
					</td> --%>
					<td>${mems.memberphone }</td>
					<td>${mems.password }</td>
					<td>${mems.memberid }</td>
					<td>${mems.deptno }</td>
					<td>${mems.answer }</td>
					<%-- <td>${mems.househallroom }</td> --%>
					<td>
						<a href="DeleteMemberAction?memberphone=${mems.memberphone }&method=delete&cpage=${pageinfo.cpage}">删除</a>
						<!-- <a href="HouseChange.jsp">修改</a> -->
					</td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="6">
					共有【${pageinfo.count2 }】条交换信息，分为【${pageinfo.maxpage}】页，当前显示【${pageinfo.cpage}/${pageinfo.maxpage }】页
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					
					<a href="DeleteMemberAction?method=getPage&cpage=1">首页</a>
					<a href="DeleteMemberAction?method=getPage&cpage=${pageinfo.cpage-1}">上一页</a>
					<a href="DeleteMemberAction?method=getPage&cpage=${pageinfo.cpage+1}&maxpage=${pageinfo.maxpage}">下一页</a>
					<a href="DeleteMemberAction?method=getPage&cpage=${pageinfo.maxpage}&maxpage=${pageinfo.maxpage}">尾页</a>
					
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="text" id="cp"><button id="btn">跳转</button>
				</td>
				<!-- <td><button id="deleteAllBtn">批量删除</button></td> -->
			</tr>
			</table>
		</div>	
	</div>	
		<script type="text/javascript">
		$(function(){
			$('#btn').on('click',function(){
				location.href="DeleteMemberAction?method=getPage&cpage="+$('#cp').val();
			});
			
			$('#sla').on('click',function(){
				$('input[name="hosflag"]').prop('checked',$('#sla').prop('checked'));
			});
			/* *$('#deleteAllBtn').on('click',function(){
				 v:是对应的复选框的dom对象 
				var ids="";
				$('input[name="hosflag"]:checked').each(function(i,v){
					/* $(V)将dom对象转化成jquery对象 */	
				/* 	console.log(i+"    "+$(v).attr('id')); 
				ids+=$(v).attr('id')+",";
				});
				location.href="DeleteAction?method=batchDelete1&ids="+ids.substring(0,ids.length-1);
			}); */
		});	
		</script>
</body>
</html>