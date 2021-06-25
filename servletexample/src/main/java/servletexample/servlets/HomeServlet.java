package servletexample.servlets;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/home")
public class HomeServlet extends HttpServlet {



	/**
	 * 
	 */
	private static final long serialVersionUID = 5427880366764654190L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		

		

		RequestDispatcher dispatcher =  req.getRequestDispatcher("home.jsp");
		dispatcher.forward(req, resp);
}

}
