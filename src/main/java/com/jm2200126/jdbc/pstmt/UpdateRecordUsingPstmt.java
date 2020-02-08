package com.jm2200126.jdbc.pstmt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jm2200126.jdbc.util.DbUtil;

public class UpdateRecordUsingPstmt {

	public static void main(String[] args) {
		try {
			Connection con = DbUtil.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("UPDATE JM2200126_USER SET NAME = ? WHERE ID = ?");
			pstmt.setInt(2, 5003);
			pstmt.setString(1, "Amit John");

			int result = pstmt.executeUpdate();
			if (result == 1) {
				System.out.println("Record updated successfully");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
