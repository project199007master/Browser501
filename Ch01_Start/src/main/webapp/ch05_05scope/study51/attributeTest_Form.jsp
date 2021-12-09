<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>

	<form action="attributeTest1.jsp" method="post">
		<table border=1>
			<tr>
				<td colspan=2>application 영역에 저장할 내용들</td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" id="name" required></td>
			</tr>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="id" id="id" required></td>
			</tr>
			<tr>
				<td colspan=2><input type="submit" id="btn" value="전송"></td>
			</tr>
		</table>
	</form>

</body>
</html>