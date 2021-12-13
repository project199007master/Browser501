package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ch08_useBean.member.PersonalInfo;

//@WebServlet("/PersonalInfoServlet")
public class PersonalInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PersonalInfo pi = new PersonalInfo();
		pi.setName("홍길동");
		pi.setGender('남');
		pi.setAge(24);
		
		request.setAttribute("pinfo", pi);
		
		RequestDispatcher d = request.getRequestDispatcher("/ch08_Jsp_useBean/study08/customerInfoViewer.jsp");
		d.forward(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}
	

}
