package com.caiman.web.demo.ant;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletDemoAnt")
public class ServletDemoAnt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletDemoAnt() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().println("Hello world desde Servlet");
	}

}
