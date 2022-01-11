package com.te.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StoredProcedure {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/tyghdemo";
		Connection connection = null;
		CallableStatement callStatement = null;
		try {
			connection = DriverManager.getConnection(url, "root", "root");
			callStatement = connection.prepareCall("call put(?,?,?,?)");
			Scanner sc = new Scanner(System.in);
			while (true) {
				System.out.println("Enter the id of the sweet");
				int id = sc.nextInt();
				if(id==0) {
					break;
				}
				System.out.println("Enter the name of the sweet");
				String name = sc.next();
				System.out.println("Enter the cost of sweet");
				double price = sc.nextDouble();
				System.out.println("Enter the quantity");
				int kg = sc.nextInt();

				callStatement.setInt(1, id);
				callStatement.setString(2, name);
				callStatement.setDouble(3, price);
				callStatement.setInt(4, kg);

				callStatement.execute();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
