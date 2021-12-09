<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jsp:include(167)</title>
</head>
<body>
<img src="jsp_include.jpg"><br>
<%
	request.setAttribute("name1", "park");
%>
include전 name parameter값: <%=request.getParameter("name") %><br>
<!-- include => 설정한 request값, attribute값을 가지고 간다 -->
<jsp:include page="body_sub.jsp">
	<jsp:param value="hong" name="name"/>
</jsp:include>
<hr>
include후 name parameter값: <%=request.getParameter("name") %><br>
</body>
</html>