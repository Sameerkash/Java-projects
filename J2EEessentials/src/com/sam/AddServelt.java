package com.sam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

public class AddServelt extends HttpServlet {
	public void doGet(final HttpServletRequest req, final HttpServletResponse res) throws IOException, ServletException

	{
		final int i = Integer.parseInt(req.getParameter("num1"));
		final int j = Integer.parseInt(req.getParameter("num2"));

		final int k = i + j;
		// k=k*k;

		// req.setAttribute("k", k);
		// HttpSession session = req.getSession();
		// session.setAttribute("k", k);

		final Cookie cookie = new Cookie("k", k + "");
		res.addCookie(cookie);

		res.sendRedirect("sq");

		// RequestDispatcher rd = req.getRequestDispatcher("sq");
		// rd.forward(req, res);
		//

	}

}
