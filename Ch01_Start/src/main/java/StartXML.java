

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Servlet Mapping 방법: annotation, web.xml
// 1.annotation 방식 - 권장사항
//@WebServlet("/ch02_start/Start_xml")
public class StartXML extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public StartXML() {
        super();       
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");		
		
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter writer = response.getWriter();
		
		writer.println("<html><head></head>");
		writer.println("<body>" + name + " 님 환영합니다. </body>");
		writer.println("</html>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
