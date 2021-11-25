package apJava;

import java.io.IOException;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWordServlet
 */
@WebServlet("/Hello")
public class HelloWordServlet extends HttpServlet implements Servlet {
       
   
	


	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		HttpServletResponse response2 = (HttpServletResponse) response;
		response2.getWriter()
		.append("<h1>")
		.append("Hola Servlet!!")
		.append("</h1>");
		response2.getWriter()
		.append("<br>")
		.append("<h1>")
		.append("Hola Servlet!!")
		.append("</h1>")
		.append("<br>")
		.append("<p>")
		.append(new java.util.Date().toString())
		.append("</p>")
		;
		
	}
	
	

}
