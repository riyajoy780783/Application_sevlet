package com.face.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.LoginBO;
import com.face.bo.RegisterBO;
import com.face.dao.LoginDAO;
import com.face.util.ConnectionManager;



public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
		
		
		LoginBO lbo = new LoginBO();
		RegisterBO reg = new RegisterBO();
		
		
		
		
		lbo.setUsername(username);
		lbo.setPassword(password);
		
		ConnectionManager con = new ConnectionManager();
		
		try {
			boolean status = LoginDAO.check(con.getConnection(), lbo);
			
			
			  if(status == true) {
			  
			  
			 
			  ArrayList<String> list= new ArrayList<String>();
			  
			  list.add(lbo.getFirstname());
			  list.add(lbo.getLastname());
			  list.add(lbo.getUsername());
			  list.add(lbo.getPassword());
			  list.add(lbo.getEmail());
			  list.add(lbo.getMobile());
			  
			  request.setAttribute("data", list);
			  
			  RequestDispatcher requestdispatcher = request.getRequestDispatcher("welcome.jsp");
			  
			  requestdispatcher.forward(request, response);
			  
			  }
			  else
			  {
				  RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
		            requestDispatcher.forward(request, response);
			  }
			 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
