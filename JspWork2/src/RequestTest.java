

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
	
    //�ܺο��� get or post��û�Ҷ� ->service() �ۼ��ϸ� �ȴ�.->�������ε� �����ϴ�.
	private void test(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html;charset=utf-8");//html����+�ѱ۵�����
		//PrintWriter out=new PrintWriter(~);
		PrintWriter out=response.getWriter();//��ü ���� 3��° ���
		out.println("<html><head></head>");//document.write("<html><head></head>");
		out.println("<body>");
		out.println("<h1>������ ���� �� ����</h1>");
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
