package ch18.mvc.simple;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

// URL Servlet Mapping 방법1 - Annotation
@WebServlet("/ch18/SimpleController")
public class SimpleController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		processRequest(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		processRequest(request, response)
	}
	
	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String type = request.getParameter("type");
		Object resultObject = null;
		
		if(type == null || type.equals("greeting")) {
			resultObject = "안녕하세요";
			
		}else if(type.equals("date")){
			resultObject = new Date();
		}else {
			resultObject = "Invalid Type";
		}
		
		request.setAttribute("result", resultObject);
		RequestDispatcher d = request.getRequestDispatcher("simpleView.jsp");
		d.forward(request, response);
		
	}

}
