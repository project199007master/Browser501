<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	body{
		font-size:2em;
	}
</style>
</head>
<body>
--> <a href="emppool">MVC_POOL</a><hr>
<table>
	<tr>
		<td><b>&nbsp;Connection Pool:&nbsp;</b></td>
		<td>
			많은 자원을 낭비하는 Connection(연결설정)을 사용자가 <br>
            요청할 때 마다 매번 연결하지 않고, 미리 인정 갯수만큼 connection을 맺어 필요한 DAO<br>
            클래스에서 빌려 사용하고 반환하는 방법<br>
            과거에는 Connection Pool 기능을 구현한 클래스(DBCPInit.java)를 직접 작성해서 사용(418)하였으나,<br>
            현재에는 Connection Pool 기능이 포함되어 있는 라이브러리(tomcat-dbcp.jar)를 사용.<br>
		</td>
	</tr>
</table>
<hr>
Pool API:: javax.sql.DataSource, <b>JNDI(Java Naming and Directory Interface)</b>기법<hr>
<img src="connection_pool1.png" width="1500px"><br>
<img src="connection_pool2.png" width="1500px"><br>
<img src="jndi.png" width="1500px"><br>


</body>
</html>