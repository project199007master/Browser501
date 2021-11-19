<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% String custId = request.getParameter("custId");
	String fname = request.getParameter("fname");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	fname : <%= fname %><br>
	숨겨진 ID: <%=custId %>
</body>
</html>