package basics01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse rs) throws ServletException, IOException {
		// TODO Auto-generated method stub
		rs.setContentType("text/html");
		PrintWriter out  = rs.getWriter();
		
		out.println("<h1>Hello , There is the first Web-App</h1>");
		out.close();
	}

}
