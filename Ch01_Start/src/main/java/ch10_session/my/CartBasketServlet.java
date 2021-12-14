package ch10_session.my;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ch10_session/study13/CartBasket123")
public class CartBasketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		// 세션을 새로 생성할 필요가 없으므로 false값을 줘서 세션을 받거나 null로 리턴 
		HttpSession session = request.getSession(false);
		
		out.println("<html><body>장바구니 리스트"+"<br>");
	
		String[] products = (String[])session.getAttribute("list");
				
		if(products != null) {
			for(int i=0; i<products.length; i++) {
				out.print("product" + (i+1) + ": " + products[i] + "<br>");
			}
		}
		else {
			out.println("장바구니 비었음<br><br>");
		}
				
		out.println("<a href='products.html'>상품 선택 페이지</a><br>");
		out.println("<a href='CartDelete'>장바구니 비우기</a>");
		out.println("</body></html>");
	}

}
