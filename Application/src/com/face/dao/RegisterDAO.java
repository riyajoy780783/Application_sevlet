package com.face.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.face.bo.RegisterBO;


public class RegisterDAO {

	public static void save(Connection connection, RegisterBO regbo) throws SQLException {
		
		Statement st = connection.createStatement();
		String query = "insert into reg values('"+regbo.getFirstname()+"','"+regbo.getLastname()+"','"
		+regbo.getUsername()+"','"+regbo.getPass()+"','"+regbo.getEmail()+"','"+regbo.getMobile()+"')";
		
		int result = st.executeUpdate(query);
		if(result==1)
		{
			System.out.println("Data inserted successfully");
		}
		else
		{
			System.out.println("Insertion failed");
		}
		

	}

	
}
