

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/study/study02/Sport_anno")
public class SportServletAnno extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String[] sports = request.getParameterValues("sport");
		String gender = request.getParameter("gender");
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");	
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h2>어노테이션 방식으로 불러온 Servlet 입니다.</h2><br>");
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
		
		// doGet을 호출하길래 doGet에서 처리하면 글자가 안 깨질 줄 알았는데 아니었어...
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");	
		
		doGet(request, response);
	}

}
