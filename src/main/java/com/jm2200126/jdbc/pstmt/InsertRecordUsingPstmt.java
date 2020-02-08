package com.jm2200126.jdbc.pstmt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jm2200126.jdbc.util.DbUtil;

public class InsertRecordUsingPstmt {

	public static void main(String[] args) {
		try {
			Connection con = DbUtil.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO JM2200126_USER VALUES(?, ?)");
			pstmt.setInt(1, 5001);
			pstmt.setString(2, "Amit");

			int result = pstmt.executeUpdate();
			if (result == 1) {
				System.out.println("Record inserted successfully");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
