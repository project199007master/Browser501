package example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 결과: http://localhost:8080/Server_Servlet/hello
		// 안녕하세요 (hong) 님
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		out.println("<html><body>");
		
		out.println("안녕하세요 " +  name + " 님!");
		out.println("</body></html>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
