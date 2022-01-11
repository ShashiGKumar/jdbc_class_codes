package com.te.jdbc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class BatchStatement {
	
	public static void main(String[] args){
		String url="jdbc:mysql://localhost:3306/jdbcdemo";
		FileReader fileReader;
		Connection connection=null;
		Statement statement =null;
		try {
			fileReader=new FileReader("C:\\Users\\shashi kumar g\\Desktop\\jdbc.txt");
			Properties properties=new Properties();
			properties.load(fileReader);
			connection=DriverManager.getConnection(url, properties);
			statement=connection.createStatement();
			statement.addBatch("insert into sweets values(9,'ice creame',10,1)");
			statement.addBatch("update sweets set name='cold ice cream' where id=1");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
