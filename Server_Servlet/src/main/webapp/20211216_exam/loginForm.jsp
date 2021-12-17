<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	.title{
		background:green;
		text-align:center;
	}
	.subtit{
		background:skyblue;
		text-align:center;
	}
	.input{
		background:orange;
	}
	
</style>
<body>
<form action="join.do" method="post">
<table width="400px">
	
	<tr>
		<td colspan="2" class="title">로그인</td>
	</tr>
	<tr>
		<td class="subtit">아이디</td>
		<td class="input"><input type="text" name="id" required="required" autofocus="autofocus"></td>
	</tr>	
	<tr>
		<td class="subtit">암호</td>
		<td class="input"><input type="password" name="pw" required="required"></td>
	</tr>
	<tr>
		<td colspan="2" class="subtit"><input type="submit" value="확인">
	</tr>
	
</table>
</form>
</body>
</html>