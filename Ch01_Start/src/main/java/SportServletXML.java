

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SportServletXML extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String[] sports = request.getParameterValues("sport");
		String gender = request.getParameter("gender");
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");	
		

		// MVC model 2 작성
		HttpSession session = request.getSession();
		session.setAttribute("s1", sports);
		session.setAttribute("s2", gender);
		
		RequestDispatcher rd = request.getRequestDispatcher("sport_mvc2.jsp?id=hong");
		rd.forward(request, response);
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h2>XML 방식으로 불러온 Servlet 입니다.</h2><br>");
		out.println("좋아하는 운동:");
		
		if(sports != null) {
			for(int i=0; i<sports.length; i++) {
				out.println(sports[i]+ " ");
			}
		}
		else
			out.println("없음");		
		
		out.println("<br>");
		if(gender != null)
		out.println("성별: " + gender);
		else
			out.println("성별 선택 X");
		out.println("</body></html>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");	
		
		doGet(request, response);
	}

}
