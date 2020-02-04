package com.jm2200126.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecord {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate("DELETE FROM JM2200126_USER");
			System.out.println(result);
			if (result > 0) {
				System.out.println("Records deleted successfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
