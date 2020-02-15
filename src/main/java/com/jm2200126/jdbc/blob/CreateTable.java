package com.jm2200126.jdbc.blob;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.jm2200126.jdbc.util.DbUtil;

public class CreateTable {
	public static void main(String[] args) {

		try {
			Connection con = DbUtil.getDbConnection();
			Statement stmt = con.createStatement();
			boolean result = stmt.execute("CREATE TABLE JM2200126_PROFILE(NAME VARCHAR, IMAGE BLOB)");
			if (!result) {
				System.out.println("Table created successfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
