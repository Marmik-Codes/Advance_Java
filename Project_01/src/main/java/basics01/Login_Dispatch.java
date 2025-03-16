package basics01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Login_Dispatch extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String usname = (String)req.getAttribute("usname");
		String pwd = (String)req.getAttribute("pwd");
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		if (usname.equals("Marmik") && pwd.equals("Marmik@246")) {
            out.println("<html><body>");
            out.println("<h2>Welcome, " + usname + "!</h2>");
            out.println("<a href='index.html'>Logout</a>");
            out.println("</body></html>");
        } else {
            out.println("<html><body>");
            out.println("<h2 style='color:red;'>Invalid credentials. Try again.</h2>");
            out.println("<a href='login.html'>Go back to Login</a>");
            out.println("</body></html>");
        }
        out.close();

	}

}
