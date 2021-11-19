package com.sonata.casestudy;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


@Component
public class DbConnection implements dbInterface {
		
		Connection con;
		
		public Connection getConnection() {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con =DriverManager.getConnection("jdbc:mysql://localhost:3306/CASESTUDYDB","root","admin@123");
			}catch(ClassNotFoundException e1) {
				System.out.println(e1);
			}catch(SQLException e2) {
				e2.printStackTrace();
			}
			return con;
		}
		
		public void closeConnection() {
			try {
				if(con!=null) {
					con.close();
				}
			}catch(SQLException sqle) {sqle.printStackTrace();
		}
}

		
}