<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% request.setCharacterEncoding("utf-8"); %>
<jsp:useBean id="memberInfo" class="ch08_useBean.member.MemberInfo"></jsp:useBean>
<jsp:setProperty property="*" name="memberInfo"></jsp:setProperty>
<jsp:setProperty property="password" name="memberInfo" value="<%=memberInfo.getId() %>"></jsp:setProperty>

<jsp:getProperty property="name" name="memberInfo"/><br>
<jsp:getProperty property="email" name="memberInfo"/><br>
</body>
</html>