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
application.setAttribute("name", request.getParameter("name"));
application.setAttribute("id", request.getParameter("id"));

%>
${applicationScope.name}님 반갑습니다.<br>
${applicationScope.name}의 아이디는 ${applicationScope.id}입니다.<br>

<form action="attributeTest2.jsp" method="post">
		<table border=1 id="table">
			<tr>
				<td colspan=2>Session 영역에 저장할 내용들</td>
			</tr>
			<tr>
				<td>email 주소</td>
				<td><input type="text" name="email" id="email" required></td>
			</tr>
			<tr>
				<td>집주소</td>
				<td><input type="text" name="addr" id="addr" required></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><input type="text" name="tel" id="tel" required></td>
			</tr>
			<tr>
				<td colspan=2><input type="submit" id="btn" value="전송"></td>
			</tr>
		</table>
	</form>
</body>
</html>