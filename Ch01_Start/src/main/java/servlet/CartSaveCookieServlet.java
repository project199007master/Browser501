package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ch09_cookie/study09/CartSaveCookies")
public class CartSaveCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8");
		String product = request.getParameter("product");
		
		Cookie cartCookie = new Cookie("product", product);
		// 쿠키 전달 경로(범위) 설정
		cartCookie.setPath("/"); // '/'및 하위의 모든 경로에 쿠키 전달 
		response.addCookie(cartCookie);		
		
		String path = request.getContextPath();
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("Product 추가"+"<br>");
		// 절대 경로로 한 것인가....
		out.println("<a href='" + path + "/CartBasketCookie'>장바구니 보기</a>");
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
