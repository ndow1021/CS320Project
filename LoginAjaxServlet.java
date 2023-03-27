//package CS320Project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import edu.ycp.cs320.lab02.controller.NumbersController;
//import edu.ycp.cs320.lab02.controller.MultiplyNumbersController;

public class LoginAjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doRequest(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doRequest(req, resp);
	}

	private void doRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Get parameters
		String email = getString(req, "email");
		String password = getString(req, "password");
		
		// Check whether parameters are valid
		if (email == null || password == null) {
			badRequest("Bad parameters", resp);
			return;
		}
		
		// Use a controller to process the request
		LoginController controller = new LoginController();
	//	String loginInfo = controller.login(email, password);
		
		// Send back a response
		resp.setContentType("text/plain");

	}

	private String getString(HttpServletRequest req, String name) {
		String val = req.getParameter(name);
		if (val == null) {
			return null;
		}
		try {
			//return String.parseString(val);
			return null;
		} catch (NumberFormatException e) {
			return null;
		}
	}

	private void badRequest(String message, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		resp.getWriter().println(message);
	}
}
