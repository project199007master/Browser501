

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/study/study02/member_anno")
public class MemberServletAnno extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.println("<h2>어노테이션 방식으로 불러온 Servlet 입니다.</h2>");
		
		Enumeration<String> paramName = request.getParameterNames();
		while(paramName.hasMoreElements()) {
			// 가져온 파라미터의 이름을 저장
			String pName = paramName.nextElement();
			// 가져온 파라미터의 이름을 통해 이름에 해당된 값을 가져와 함께 출력
			out.println(pName + " : " + request.getParameter(pName)+"<br>");		
		}
		
		out.println("</body></html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		doGet(request, response);
	}

}
