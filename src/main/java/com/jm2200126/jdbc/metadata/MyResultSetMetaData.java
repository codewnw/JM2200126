package com.jm2200126.jdbc.metadata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class MyResultSetMetaData {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM JM2200126_USER");

			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println(rsmd.getColumnCount());
			System.out.println(rsmd.getTableName(1));
			System.out.print(rsmd.getColumnName(1) + "(" + rsmd.getColumnTypeName(1) + ")     ");
			System.out.println(rsmd.getColumnName(2) + "(" + rsmd.getColumnTypeName(2) + ")");

			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				System.out.println(id + " " + name);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
