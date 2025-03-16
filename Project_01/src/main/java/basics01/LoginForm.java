package basics01;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginForm
 */
public class LoginForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String usname = req.getParameter("username");
		String pwd = req.getParameter("password");

		req.setAttribute("usname", usname);
		req.setAttribute("pwd", pwd);
		
		RequestDispatcher rd = req.getRequestDispatcher("/login-result");
		rd.forward(req, res);
	}

}
