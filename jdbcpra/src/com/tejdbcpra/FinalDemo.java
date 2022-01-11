package com.tejdbcpra;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class FinalDemo {
	
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		FileReader fileReader=null;
		String qry="create table practice.mahadev (rollno int , name varchar(30) )";
		String qry1="insert into practice.jdbc values(5,'praveen')";
		String qry2="select * from practice.jdbc  ";
		String qry3="rename practice.jdbc to practice.jdbccccc";
		try {
		    fileReader=new FileReader("C:\\Users\\shashi kumar g\\Desktop\\FileReader.txt");
		    Properties properties = new Properties();
		    properties.load(fileReader);
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306",properties);
			pstmt = con.prepareStatement(qry3);
			pstmt.executeUpdate();
//			rs=pstmt.executeQuery();
//			if(rs.absolute(2)) {
//				int id=rs.getInt(1);
//				String name=rs.getString("name");
//				System.out.println(id +" " +  name);
////			    break;	
//			}
			
		} catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
		}
		finally {
			
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(pstmt!=null) {
				try {
					pstmt.close();
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
