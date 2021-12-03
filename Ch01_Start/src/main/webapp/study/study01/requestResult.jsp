<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% 
	request.setCharacterEncoding("utf-8");

	String num = request.getParameter("num");
	String name = request.getParameter("name");
	String grade = request.getParameter("grade");
	String subject = request.getParameter("subject");
%>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border=1>
		<caption style="font-size:1.3em">학생 정보</caption>
		<tr>
			<td>학번</td>
			<td><%= request.getParameter("num") %></td>
		</tr>
		<tr>
			<td>이름</td>
			<td>${param.name}</td>
		</tr>
		<tr>
			<td>학년</td>
			<td><%= grade %></td>
		</tr>
		<tr>
			<td>선택과목</td>
			<td><% out.println(subject); %></td>
		</tr>
	</table>
</body>
</html>