package com.face.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import com.face.bo.LoginBO;

public class LoginDAO {

	public static boolean check(Connection connection, LoginBO lbo) throws SQLException {
		Statement st = connection.createStatement();
		boolean status = false;
		String uname = lbo.getUsername();
		String pass = lbo.getPassword();
		
	
		String query = "select * from reg where uname='" + uname + "' and pass='" + pass + "'";
		ResultSet rs = st.executeQuery(query);
		
		while (rs.next()) {

			if (uname.equals(rs.getString("uname")) && pass.equals(rs.getString("pass"))) {
				System.out.println("Succesfully login");
				status = true;
             lbo.setFirstname(rs.getString("fname"));
             lbo.setLastname(rs.getString("lname"));
             lbo.setUsername(rs.getString("uname"));
             lbo.setPassword(rs.getString("pass"));
             lbo.setEmail(rs.getString("email"));
             lbo.setMobile(rs.getString("mobile"));
			}

		}
		if (status == false) {
			System.out.println("Invalid username and password");
		}

		
		 
		return status;

	}
}
