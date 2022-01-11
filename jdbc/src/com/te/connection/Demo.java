package com.te.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class Demo {
	
	public static void main(String[] args) {
		Connection connection =null;
		Statement stmt=null;
		Savepoint setSavapoint=null;
		String url="jdbc:mysql://localhost:3306/tyghdemo";
		try {
			connection=DriverManager.getConnection(url,"root","root");
			stmt=connection.createStatement();
			connection.setAutoCommit(false);
			stmt.execute("insert into trans values(1,'unlocking the fingerprint')");
			stmt.execute("insert into trans values(2,'Entering the pin')");
			stmt.execute("insert into trans values(3,'check balance')");
			System.out.println("balance is 100000000000");
			
		    setSavapoint = connection.setSavepoint();
			
			stmt.execute("insert into trans values(4,'debiting the amount')");
			stmt.execute("insert into trans values(5,'transfer through network')");
			stmt.execute("insert into trans values(6,'creaditing to amount')");
			System.out.println("Transaction completed !tinding !!");
			connection.commit();
			
		} catch (SQLException e) {
			try {
				connection.rollback(setSavapoint);
				connection.commit();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
               System.out.println("transaction failed");
		}
	}



}
