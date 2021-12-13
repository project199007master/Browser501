package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CartDeleteCookies")
public class CartDeleteCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset=utf-8");

		PrintWriter out = response.getWriter();
		String path = request.getContextPath();

		out.println("<html><body>");
		
		Cookie[] c = request.getCookies();

		if (c != null && c.length > 0) {
			for (int i = 0; i < c.length; i++) {
				if (c[i].getName().equals("product")) {
					Cookie cookie = new Cookie("product","");
					cookie.setMaxAge(0);
					cookie.setPath("/");
					response.addCookie(cookie);
				}
			}
		}		
		
		out.println("장바구니 비웠음!!"+"<br>");
				
		out.println("<a href='" + path + "/ch09_cookie/study09/cookie.html'>상품 선택 페이지</a>" + "<br>");
		out.println("<a href='" + path + "/CartBasketCookie'>장바구니 보기</a>");
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
