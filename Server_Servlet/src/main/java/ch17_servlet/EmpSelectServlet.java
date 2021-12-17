package ch17_servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmpSelect.go")
public class EmpSelectServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		
		
		Connection conn = null;
		
				
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";			
			conn = DriverManager.getConnection(url, "scott", "scott");
			
			String sql = "select empno,ename,sal,deptno from emp";
			PreparedStatement pstmt;
			
			pstmt = conn.prepareStatement(sql);
						
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				out.printf("%d %s %d %d", rs.getInt("empno"), rs.getString("ename"), rs.getInt("sal"), rs.getInt("deptno"));
				out.println("<br>");
			}
			
	
		} catch (ClassNotFoundException e) {
			
			System.out.println("드라이버 이상");
		
		
		} catch (SQLException e) {
	
			System.out.println(e.getMessage());
			
		}
		
		out.println("</body></html>");
	}

}
