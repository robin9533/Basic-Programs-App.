package com.reg.gt.Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.regnant.gt.jdbc.DBConnection;

public class DBCRUDOperations {
	public static int updatedPassword(String emp_id) throws SQLException {
		PreparedStatement pstm;
		int noOfRows = 0;
		Connection conn;
		try {
			conn = DBConnection.getConnection();
			String UpdateQuery = "UPDATE sra_ltd.employee_tbl SET password = ? WHERE emp_id = ?";
			pstm = conn.prepareStatement(UpdateQuery);
			pstm.setString(1, "lakkakula12345");
			pstm.setString(2, emp_id);
			noOfRows = pstm.executeUpdate();
			System.out.println("Password Updated");
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return noOfRows;
	}	
	
	public static boolean checkEmployee(String emp_id, String email) {
		PreparedStatement pstm;
		int noOfRows = 0;
		Connection conn;
		ResultSet rs;
		try {
			conn = DBConnection.getConnection();
			String query = "Select * from sra_ltd.employee_tbl WHERE emp_id= ? and emp_email = ?";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, emp_id);
			pstm.setString(2, email);
			rs=pstm.executeQuery();
			
			if(rs.next()) {
				System.out.println("Employee Exist");
				return true;
			}
				
				System.out.println("************************");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}	
		
	
	
	public static void main(String[] args) throws SQLException {
		updatedPassword("SRA01");
		checkEmployee("SRA02", "rohit@gmail.com");
	}
}


