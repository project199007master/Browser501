<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>영역과 속성 테스트</h2>
<%
	request.setCharacterEncoding("utf-8");
	session.setAttribute("email", request.getParameter("email"));
	session.setAttribute("addr", request.getParameter("addr"));
	session.setAttribute("tel", request.getParameter("tel"));
%>

${applicationScope.name}님의 정보가 모두 저장되었습니다.
<a href="attributeTest3.jsp">확인하러가기</a>

</body>
</html>