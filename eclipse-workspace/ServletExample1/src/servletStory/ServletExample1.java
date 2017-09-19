package servletStory;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletExample1")
public class ServletExample1 extends HttpServlet {
	
	private String welcome; 
    
	 public void init() throws ServletException {
	      
		 welcome = "Hello Seema";
	   }
  
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		PrintWriter out=response.getWriter();
		out.println(welcome);
		out.close();
	}

	
}
