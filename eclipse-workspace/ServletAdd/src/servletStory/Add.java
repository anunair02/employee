package servletStory;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int flag=0;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws  IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		processRequest(request, response);
	}
public void processRequest(HttpServletRequest req, HttpServletResponse res) throws IOException
{
	try{
	int firstNumber=(Integer.parseInt(req.getParameter("a")));
	int secondNumber=(Integer.parseInt(req.getParameter("b")));

	int sum=firstNumber+secondNumber;
	
	PrintWriter out=res.getWriter();
	out.println(sum);
	
	}
	catch(NumberFormatException ex){


        System.out.println("Error occured while conversion");
        flag++;
        if(flag>0)
    	{
    		PrintWriter out=res.getWriter();
    		out.println("enter a number");
    	}
    	
	}
	
}
}