package com.sam;

import java.io.*;
import javax.servlet.http.*;

public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

		int k = 0;

		Cookie cookies[] = req.getCookies();
		for (Cookie c : cookies) {
			if (c.getName().equals("k"))
				k = Integer.parseInt(c.getValue());
		}
//		Integer.parseInt(req.getParameter("k"));

//		HttpSession session = req.getSession();
//		int k = (int) session.getAttribute("k");
		k = k * k;

		PrintWriter out = res.getWriter();
		out.println("Result is " + " " + k);

	}

}
