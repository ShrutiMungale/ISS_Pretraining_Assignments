package com.exceptionhandling;
import java.sql.*;
//SQLException and ClassNotFoundException
public class SQLExample {

	public static void main(String[] args) throws SQLException {
		Connection con=null;
		
			try {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb","root","Mypassword2002#");
				System.out.println("Successfully connected to database");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Failed connecting to database");
			}
			finally {
				con.close();
			}
			
	
		// TODO Auto-generated method stub

	}

}
