package ch18.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ch18.mvc.dao.EmpDAO;
import ch18.mvc.vo.EmpDTO;


@WebServlet("/ch18/emppool")
public class EmpSelectServletDAO_Pool extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		
		ArrayList<EmpDTO> result = null;
		EmpDAO dao = new EmpDAO();
		dao.connectDB();
		
		result = dao.select();
		
		if(result != null) {
			
			for(EmpDTO dto : result) {
				out.println(dto.printField() + "<br>");
			}
		}
		else {
			out.println("해당 사항 없음");
		}
		
		out.println("</body></html>");
	}

}
