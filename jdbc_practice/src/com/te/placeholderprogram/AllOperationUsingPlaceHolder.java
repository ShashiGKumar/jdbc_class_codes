package com.te.placeholderprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AllOperationUsingPlaceHolder {
	
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		String qry="insert into jdbcdemo.studentpractice values(?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			pstmt = con.prepareStatement(qry);
			pstmt.setInt(1, 7);
			pstmt.setString(2, "vivek");
			pstmt.setDouble(3, 45.89);
			
			pstmt.setInt(1, 8);
			pstmt.setString(2, "mahadev");
			pstmt.setDouble(3, 90.88);
			
			pstmt.setInt(1, 9);
			pstmt.setString(2, "praveen");
			pstmt.setDouble(3, 92.78);
			pstmt.executeUpdate();
			
			pstmt.setInt(1, 10);
			pstmt.setString(2, "sayali");
			pstmt.setDouble(3, 85.89);
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
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
