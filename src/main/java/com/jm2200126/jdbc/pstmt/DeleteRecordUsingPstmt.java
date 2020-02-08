package com.jm2200126.jdbc.pstmt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jm2200126.jdbc.util.DbUtil;

public class DeleteRecordUsingPstmt {

	public static void main(String[] args) {
		try {
			Connection con = DbUtil.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("DELETE FROM JM2200126_USER WHERE ID = ?");
			pstmt.setInt(1, 5003);

			int result = pstmt.executeUpdate();
			if (result == 1) {
				System.out.println("Record deleted successfully");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
