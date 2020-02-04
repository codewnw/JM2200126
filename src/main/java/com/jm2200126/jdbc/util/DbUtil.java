package com.jm2200126.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {

	public static Connection getDbConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
	}
}
