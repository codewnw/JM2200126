package com.jm2200126.jdbc.ddl;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.jm2200126.jdbc.util.DbUtil;

public class DropTable {

	public static void main(String[] args) {
		try {
			Connection con = DbUtil.getDbConnection();
			Statement stmt = con.createStatement();
			boolean result = stmt.execute("DROP TABLE JM2200126_USER_TEMP");
			if (!result) {
				System.out.println("Table dropped successfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
