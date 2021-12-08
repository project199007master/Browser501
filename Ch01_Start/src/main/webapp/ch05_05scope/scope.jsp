<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<img src="scope_attribute.png"><br><br>
pageContext Scope: 하나의 jsp 페이지 안에서 사용(변수)<br>
request Scope: include, forward를 통해서 다른 페이지에서도 사용(변수)<br>
session Scope: browser상태에서 페이지 이동시 사용(변수 공유)<br>
application Scope: 서버가 시작부터 종료까지 사용(변수 공유 : 방문자수)<br><br>

<%
pageContext.setAttribute("page", "page1");
request.setAttribute("request", "request1");
session.setAttribute("session", "session1");
application.setAttribute("application", "application1");
%>

<%
	// request영역에 데이터 저장시 forward
	RequestDispatcher d = request.getRequestDispatcher("other_scope.jsp");
	d.forward(request, response);
%>

<hr>
pageContext out: <%= pageContext.getAttribute("page") %><br>
request out: <%= request.getAttribute("request") %><br>
session out: <%= session.getAttribute("session") %><br>
application out: <%= application.getAttribute("application") %><br>

</body>
</html>