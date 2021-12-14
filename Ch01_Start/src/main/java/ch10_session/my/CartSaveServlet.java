package ch10_session.my;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ch10_session/study13/CartSave123")
public class CartSaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String product = request.getParameter("product");
		
		// 세션 객체를 받아오거나 새로 만들어 리턴 
		HttpSession session = request.getSession();
		
		// 카트에 담을 물품을 저장할 배열
		String[] products = null;
		
		// 세션으로 부터 카트 문자열 배열을 받아옴
		products = (String[])session.getAttribute("list");
		
		// 카트 배열에 아무것도 없다면(첫 선택시) 배열을 새로 생성한 후 인덱스 0번에 저장
		if(products == null) {
			products = new String[1];
			products[0] = product;
			session.setAttribute("list", products);
		}
		else {
			// 기존의 배열이 존재한다면 새 배열을 기존 배열의 크기+1로 생성
			String[] products2 = new String[products.length+1];
			
			// 기존 배열의 내용을 새 배열에 복사
			for(int i=0; i<products.length; i++) {
				products2[i] = products[i];
			}
			// 나머지 한자리(끝자리)에 저장
			products2[products.length] = product;
			session.setAttribute("list", products2);
			
		}
		
		out.println("<html><body>Product추가"+"<br>");
		out.println("<a href='CartBasket'>장바구니 보기</a>");
		out.println("</body></html>");
		
		
	}
	
	
	
	

}
