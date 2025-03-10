package basics01;

import java.io.IOException;
import java.io.PrintWriter;
//import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TaskForm
 */
public class TaskForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try {
            out.println("<html><head><title>Form Data</title></head><body>");
            out.println("<h2>Submitted Form Data</h2>");
            
            out.println("<p><strong>Text:</strong> " + request.getParameter("text") + "</p>");
            out.println("<p><strong>Password:</strong> " + request.getParameter("password") + "</p>");
            out.println("<p><strong>Email:</strong> " + request.getParameter("email") + "</p>");
            out.println("<p><strong>Telephone:</strong> " + request.getParameter("tel") + "</p>");
            out.println("<p><strong>URL:</strong> " + request.getParameter("url") + "</p>");
            out.println("<p><strong>Search:</strong> " + request.getParameter("search") + "</p>");
            out.println("<p><strong>Number:</strong> " + request.getParameter("number") + "</p>");
            out.println("<p><strong>Range:</strong> " + request.getParameter("range") + "</p>");
            out.println("<p><strong>Date:</strong> " + request.getParameter("date") + "</p>");
            out.println("<p><strong>Time:</strong> " + request.getParameter("time") + "</p>");
            out.println("<p><strong>Datetime-Local:</strong> " + request.getParameter("datetime-local") + "</p>");
            out.println("<p><strong>Gender:</strong> " + request.getParameter("gender") + "</p>");
            out.println("<p><strong>Favorite Color:</strong> " + request.getParameter("color") + "</p>");
            out.println("<p><strong>Subscribe:</strong> " + request.getParameter("subscribe") + "</p>");
            out.println("<p><strong>Month:</strong> " + request.getParameter("month") + "</p>");
            out.println("<p><strong>Week:</strong> " + request.getParameter("week") + "</p>");
            out.println("<p><strong>Hidden Input:</strong> " + request.getParameter("hidden") + "</p>");
            out.println("<p><strong>Message:</strong> " + request.getParameter("textarea") + "</p>");
            out.println("<p><strong>Selected Option:</strong> " + request.getParameter("select") + "</p>");
            
            out.println("</body></html>");
        } finally {
            out.close();
        }
    }
}
