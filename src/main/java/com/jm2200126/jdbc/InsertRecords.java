package com.jm2200126.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.jm2200126.jdbc.util.DbUtil;

public class InsertRecords {

	public static void main(String[] args) {
		try {
			Connection con = DbUtil.getDbConnection();
			Statement stmt = con.createStatement();

			String userChoice = "Y";
			Scanner scan = new Scanner(System.in);
			while (userChoice.equalsIgnoreCase("Y")) {
				System.out.print("Enter Id: ");
				int id = Integer.parseInt(scan.next());

				System.out.print("Enter name: ");
				String name = scan.next();

				int result = stmt.executeUpdate("INSERT INTO JM2200126_USER VALUES(" + id + ", '" + name + "')");
				if (result == 1) {
					System.out.println("Record inserted successfully.");
				}

				System.out.print("Do you wish to continue?(Y/N) ");
				userChoice = scan.next();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
