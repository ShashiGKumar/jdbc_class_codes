package com.te.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Driver;

public class JDBCCrud {

	public static void main(String[] args) {
		Statement createStatement = null;
		Connection connection = null;
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tyghdemo?user=root&password=root");
			createStatement = connection.createStatement();
			createStatement.execute("create table sweets (id int,name varchar(40),cost double, quantity int)");

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (createStatement != null) {
				try {
					createStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
