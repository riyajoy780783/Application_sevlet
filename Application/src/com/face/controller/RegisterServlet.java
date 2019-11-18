package com.face.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.RegisterBO;
import com.face.dao.RegisterDAO;
import com.face.util.ConnectionManager;

/**
 * @author Riya
 * @impl Note perform user registration
 * Date 14-11-2019
 * @category controller class
 */

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @implSpec ->  action method to register customer with database
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		String firstname = request.getParameter("FirstName");
		String lastname = request.getParameter("LastName");
		String username = request.getParameter("Username");
		String pass = request.getParameter("Password");
		String email = request.getParameter("Email");
		String mobile = request.getParameter("Mobile");
		
		
		RegisterBO regbo = new RegisterBO();
		
		regbo.setFirstname(firstname);
		regbo.setLastname(lastname);
		regbo.setUsername(username);
		regbo.setPass(pass);
		regbo.setEmail(email);
		regbo.setMobile(mobile);
		
		ConnectionManager con = new ConnectionManager();
			
				
					
						try {
							RegisterDAO.save(con.getConnection(),regbo);
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
				
			
		
		}
		
		
	

}
