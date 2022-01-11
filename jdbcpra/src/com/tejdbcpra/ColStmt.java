package com.tejdbcpra;

import java.io.FileReader;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class ColStmt {

	public static void main(String[] args) {
		Connection con=null;
		CallableStatement callableStatement=null;
		CallableStatement callableStatement2=null;
		String qry="select * from tyghdemo.sweets";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
//	        callableStatement2 = con.prepareCall(qry);      
			callableStatement = con.prepareCall("tyghdemo sweets(?,?,?,?)");
	        Scanner sc=new Scanner(System.in);
	        while(true) {
	        	System.out.println("Enter the id of an sweet");
	        	int id = sc.nextInt();
	        	if(id==0)
	        		break;
	        	System.out.println("Enter the name of an sweet");
	            String name = sc.next();
	            System.out.println("Enter the cost of an sweet");
	            double cost = sc.nextDouble();
	            System.out.println("Enter the quantity");
	            int qnty = sc.nextInt();
	            
	            callableStatement.setInt(1, id);
	            callableStatement.setString(2, name);
	            callableStatement.setDouble(3, cost);
	            callableStatement.setInt(4, qnty);
	        
	        }
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			
			if(callableStatement!=null) {
				try {
					callableStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
