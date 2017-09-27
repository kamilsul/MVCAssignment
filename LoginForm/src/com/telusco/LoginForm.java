package com.telusco;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginForm")
public class LoginForm extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		Random random = new Random();
		int correctPassword = random.nextInt(2);//(random true or false, 1 for true, 2 for false)
		
		if(correctPassword == 1) {
			HttpSession session = req.getSession();
			session.setAttribute("username", username);
			resp.sendRedirect("Welcome");			
		} else {
			resp.sendRedirect("WrongPassword");
		}
	
	}
}