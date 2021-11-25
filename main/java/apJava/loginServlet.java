package apJava;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class loginServlet extends HttpServlet implements Servlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//pido los datos ingresados 
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		
		
		if(password.equals("8*8*")) {
			req.getSession().setAttribute("userName", userName);
			resp.sendRedirect("welcome.jsp");
		} else {
			req.setAttribute("flash", "usuario o password incorrecto");
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/login.jsp");
			dispatcher.forward(req, resp);
		}
		
	}
	
}
