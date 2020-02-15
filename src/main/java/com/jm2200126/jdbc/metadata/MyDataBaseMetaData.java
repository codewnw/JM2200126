package com.jm2200126.jdbc.metadata;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jm2200126.jdbc.util.DbUtil;

public class MyDataBaseMetaData {

	public static void main(String[] args) {
		try {
			Connection con = DbUtil.getDbConnection();
			DatabaseMetaData dbmd = con.getMetaData();

			System.out.println(dbmd.getDatabaseProductName());
			System.out.println(dbmd.getDatabaseProductVersion());
			System.out.println(dbmd.getDriverName());
			System.out.println(dbmd.getDriverVersion());
			System.out.println(dbmd.getURL());
			System.out.println(dbmd.getUserName());

			ResultSet rs = dbmd.getTables(null, null, "JM2200126_%", null);
			while (rs.next()) {
				System.out.println(rs.getString(3));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
