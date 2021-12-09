package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name="InitParamServlet_Anno",
urlPatterns= {"/initAnno"},
initParams = {@WebInitParam(name="dirPath", value="c:\\test"),
			  @WebInitParam(name="userid", value="admin")})
public class InitParamServlet_Anno extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//getServletContext().getInitParameter("");
		String dirPath = getInitParameter("dirPath");
		String userid = getInitParameter("userid");
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("dirPath_anno: " + dirPath + "<br>" + "userid_anno: " + userid);
		out.println("</body></html>");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
