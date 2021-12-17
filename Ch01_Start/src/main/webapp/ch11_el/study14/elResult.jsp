<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
%>
초기화 Parameter NAME: ${applicationScope.NAME}<br>
초기화 Parameter AGE: ${applicationScope.AGE}<hr>

요청 URI: ${pageContext.request.requestURI}<hr>

아이디: ${param.id}<br>
선택한 운동: ${paramValues.sport[0]} ${paramValues.sport[1]} ${paramValues.sport[2]} ${paramValues.sport[3]}

</body>
</html>