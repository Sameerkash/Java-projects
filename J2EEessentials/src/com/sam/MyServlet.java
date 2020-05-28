package com.sam;

import javax.servlet.http.*;
import java.io.*;
import javax.servlet.*;

public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		out.println("hi ");
	
		
		ServletContext ctx = getServletContext();
		String str = ctx.getInitParameter("name");
		out.print(str);
 
	}

}
