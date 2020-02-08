package com.jm2200126.jdbc.stmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecord {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate("UPDATE JM2200126_USER SET NAME = 'Shreyas Iyyar' WHERE ID = 103");
			if (result == 1) {
				System.out.println("Record updated successfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
