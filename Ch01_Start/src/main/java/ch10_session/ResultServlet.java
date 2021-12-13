package ch10_session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ch10_session/study10/result")
public class ResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8");
		
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		String animal = request.getParameter("ANIMAL");
		String food =  (String)session.getAttribute("FOOD");
		session.invalidate();
		
		out.println("<html><head><title>성격테스트</title></head><body>");
		out.println("<h3>성격테스트</h3>");
		out.printf("당신은 %s와 %s를 좋아하는 성격입니다.", food, animal);
		//out.println("당신은 " + food + "와 " + animal + "를 좋아하는 성격입니다.");
		out.println("</body></html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
