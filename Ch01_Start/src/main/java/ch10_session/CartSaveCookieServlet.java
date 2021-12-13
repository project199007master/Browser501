package ch10_session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ch09_cookie/study091/CartSaveCookie")
public class CartSaveCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String product = request.getParameter("product");
		Cookie[] cookies = request.getCookies();
		
		Cookie c = null;
		if(cookies == null || cookies.length == 0) {
			c = new Cookie("product", product);
		}
		else {
			// 쿠기가 있다면 이름을 변경하여 추가 하겠다.
			c = new Cookie("product"+(cookies.length+1), product);
		}
		response.addCookie(c);
		
		out.println("<html><body>Product추가"+"<br>");
		out.println("<a href='CartBasketCookie'>장바구니 보기</a>");
		out.println("</body></html>");
		
		
	}

}
