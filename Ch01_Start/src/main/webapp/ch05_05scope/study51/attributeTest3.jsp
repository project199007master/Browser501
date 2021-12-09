<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
	<h2>영역과 속성 테스트</h2>
	<table border=1>
		<tr>
			<td colspan=2>application 영역에 저장된 내용들</td>
		</tr>
		<tr>
			<td>이름</td>
			<td>${applicationScope.name}</td>
		</tr>
		<tr>
			<td>아이디</td>
			<td>${applicationScope.id}</td>
		</tr>

	</table>
	<br>
	<br>

	<table border=1 id="table">
		<tr>
			<td colspan=2>Session 영역에 저장된 내용들</td>
			<%
				Enumeration<String> e = session.getAttributeNames();
				while(e.hasMoreElements()){
					String name = e.nextElement();
					String value = (String)session.getAttribute(name);
				
			%>
		<tr>
			<td><%=name %></td><td><%= value %></td>
		</tr>
		<%
				}
		%>
		
	</table>
</body>
</html>