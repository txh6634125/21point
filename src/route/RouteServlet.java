package route;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RouteServlet extends HttpServlet {

	private String url;
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException,IOException {
		url = req.getRequestURI().substring(req.getContextPath().length());
		req.getRequestDispatcher("index.jsp").forward(req, res);
	}
	
}
