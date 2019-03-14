

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestTest
 */
@WebServlet("/RequestTest")
public class RequestTest extends HttpServlet {
	
    //외부에서 get or post요청할때 ->service() 작성하면 된다.->수동으로도 가능하다.
	private void test(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html;charset=utf-8");//html문서+한글데이터
		//PrintWriter out=new PrintWriter(~);
		PrintWriter out=response.getWriter();//객체 생성 3번째 방법
		out.println("<html><head></head>");//document.write("<html><head></head>");
		out.println("<body>");
		out.println("<h1>서블릿의 개요 및 리뷰</h1>");
		out.println("</body></html>");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		   test(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 test(request,response);
	}	
}
