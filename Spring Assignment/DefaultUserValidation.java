package com.sonata.casestudy;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DefaultUserValidation implements UseValidationinterface{

	@Autowired
	private dbInterface dbConnection;
	
	@Override
	public boolean validateUser(String username, String PASSWORD) {
		// TODO Auto-generated method stub
		boolean f=false;
		try {
			PreparedStatement p=dbConnection.getConnection().prepareStatement("Select user_id from user where username=? and PASSWORD=?");
			p.setString(1, username);
			p.setString(2, PASSWORD);
			ResultSet rs=p.executeQuery();
			if(f==rs.next()) {
				f=true;
			}
		}
		catch(Exception e) {
			System.out.println();
		}
		return f;
	}

}
