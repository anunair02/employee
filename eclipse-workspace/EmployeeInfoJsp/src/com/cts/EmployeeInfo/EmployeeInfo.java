package com.cts.EmployeeInfo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.RequestDispatcher;


@WebServlet("/EmployeeInfo")
public class EmployeeInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public EmployeeInfo() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		String first=request.getParameter("first");
		String last=request.getParameter("last");
		String country=request.getParameter("country");
		String language=request.getParameter("favoriteLanguage");
		
		Employee employee=new Employee();
		
		 
		try {
			employee.setFirstName(first);
			employee.setLastName(last);
			employee.setCountry(country);
			employee.setLanguage(language);
			
			request.setAttribute("data", employee);
			final javax.servlet.RequestDispatcher dispatch= request.getRequestDispatcher("Welcome.jsp");
			dispatch.forward(request, response);
			
			
		response.sendRedirect("Welcome.jsp");
		}catch(NullPointerException e)
		{
			
			System.out.println("Empty String");
			
		}
		
	}

	

}







