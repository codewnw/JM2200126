package com.jm2200126.jdbc.tcl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jm2200126.jdbc.util.DbUtil;

public class InsertButdoNotCommit {

	public static void main(String[] args) {
		try {
			Connection con = DbUtil.getDbConnection();
			con.setAutoCommit(false);
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate("INSERT INTO JM2200126_USER VALUES(100003, 'Temp User')");
			if (result == 1) {
				System.out.println("Record inserted successfully.");
			}

			ResultSet rs = stmt.executeQuery("SELECT * FROM JM2200126_USER");
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				System.out.println(id + " " + name);
			}
//			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
