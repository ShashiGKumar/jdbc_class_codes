package com.te.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetriveData {
	
	public static void main(String[] args) {
		Connection connection=null;
		Statement statement;
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/tyghdemo","root","root");
            statement=connection.createStatement();
            ResultSet resultset=statement.executeQuery("Select * from sweets");
            while(resultset.next()) {
            	//System.out.print(resultset.getString(1)+",");
            	//System.out.print(resultset.getString(2)+",");
            	//System.out.print(resultset.getString(3)+",");
            	//System.out.println(resultset.getString(4)+",");
            	
            	System.out.print(resultset.getInt(1)+",");
            	System.out.print(resultset.getString(2)+",");
            	System.out.print(resultset.getDouble(1)+",");
            	System.out.println(resultset.getInt(4));
            }
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
