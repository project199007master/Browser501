import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/20211216_exam/join.do")
public class join extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doPost(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		/*
		1) id와 password를 받아서 MemberDao를 활용하여 존재여부 체크
		2) 데이터가 존재하면 session에 id를 저장하고 1을 result에 저장하고 login.jsp에 전달
		데이터가 없거나 삭제 됐으면 result를 -1을 저장하고 login.jsp에 전달
		암호가 맞지 않으면 result에 0을 저장하고 login.jsp에 전달
		}
		*/
		Member member = new Member();
		member.setId(request.getParameter("id"));
		member.setPassword(request.getParameter("pw"));
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			//madang 에 있다고 가정
			conn = DriverManager.getConnection(url, "madang", "madang");
			String sql = "select password from member2 where id=?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getId());
			
			ResultSet rs = pstmt.executeQuery();
			// id가 있다면
			if(rs.next()) {
				String pw = rs.getString("password");
				System.out.println("pw:" + pw);
				// 비밀번호가 같다면
				if(pw.equals(member.getPassword())) {
					request.setAttribute("id", member.getId());
					request.setAttribute("result", "1");
				}
				// 비밀번호가 틀리다면
				else {
					request.setAttribute("result", "0");
				}
			}
			// id가 없다면
			else {
				request.setAttribute("result", "-1");
			}
			
			RequestDispatcher d = request.getRequestDispatcher("login.jsp");
			d.forward(request, response);
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 없음");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
		

}
