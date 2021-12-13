package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CartBasketCookies")
public class CartBasketCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html; charset=utf-8");
		
		
		
		PrintWriter out = response.getWriter();
		String path = request.getContextPath();
		
		out.println("<html><body>");
		out.println("장바구니 리스트<br>");
		out.println("product : ");
		
		Cookie[] c = request.getCookies();

		if (c != null && c.length > 0) {
			for (int i = 0; i < c.length; i++) {
				if(c[i].getName().equals("product")){
					out.println(c[i].getValue());
				}
			}
		}
		//out.println("<br>"+"<a href='" + path + "/ch09_cookie/study09/cookie.html'>상품 선택 페이지</a>"+"<br>");		
		out.println("<br>"+"<a href='ch09_cookie/study09/cookie.html'>상품 선택 페이지</a>"+"<br>");		
		out.println("<a href='" + path + "/CartDeleteCookie'>장바구니 비우기</a>");
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
