<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% request.setCharacterEncoding("utf-8"); 

%>   
<jsp:useBean id="testBean" class="ch08_useBean.member.TestBean"/>    

<!-- 폼에서 전달된 name에 속한 값을 자바빈의 name속성에 넣는다 -->
<jsp:setProperty name="testBean" property="name"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>자바빈을 사용하는 JSP페이지</h2>

입력된 이름은 <jsp:getProperty property="name" name="testBean"/>

</body>
</html>