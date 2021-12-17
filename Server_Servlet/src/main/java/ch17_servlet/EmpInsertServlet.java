package ch17_servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ch17_servlet/EmpInsert.do")
public class EmpInsertServlet extends HttpServlet {
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
			
			String sql = "insert into emp(empno,ename,sal,deptno) values(?,?,?,?)";
			PreparedStatement pstmt;
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, request.getParameter("empno"));
			pstmt.setString(2, request.getParameter("ename"));
			pstmt.setString(3, request.getParameter("sal"));
			pstmt.setString(4, request.getParameter("deptno"));
			
			int count = pstmt.executeUpdate();
			
			if(count > 0) {
				System.out.println("저장 성공");
				out.println("저장 성공");
			}
			else {
				System.out.println("저장 실패");
				out.println("저장 실패");
			}
	
		} catch (ClassNotFoundException e) {
			
			System.out.println("드라이버 이상");
		
		
		} catch (SQLException e) {
	
			System.out.println(e.getMessage());
			
		}
		
		out.println("</body></html>");
		
		
	}

}
