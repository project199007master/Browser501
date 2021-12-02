<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
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
	//String name = request.getParameter("name");
	//String age = request.getParameter("age");
	//String salary = request.getParameter("salary");
	
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	String salary = request.getParameter("salary");
%>

<%
try{
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	Class.forName(driver);
	Connection con = DriverManager.getConnection(url, "jsp", "jsp");
	Statement stmt = con.createStatement();
	String sql = "insert into join values('" + name +"', " + age + ", " + salary+ ")";
	int count = stmt.executeUpdate(sql);
	if(count > 0){
		System.out.println("데이터 insert 성공");
	}
	else{
		System.out.println("데이터 insert 실패");
	}
	
}catch(ClassNotFoundException e){
	
	System.out.println("드라이버 이상");
}catch(SQLException e){
	System.out.println(e.getMessage());
}



%>
</body>
</html>