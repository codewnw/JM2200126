package com.jm2200126.jdbc.pstmt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.jm2200126.jdbc.util.DbUtil;

public class InsertRecordsUsingPstmt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userChoice = "Y";

		try {
			Connection con = DbUtil.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO JM2200126_USER VALUES(?, ?)");
			while (userChoice.equalsIgnoreCase("Y")) {
				System.out.print("Enter ID: ");
				int id = Integer.parseInt(scan.nextLine());
				System.out.print("Enter Name: ");
				String name = scan.nextLine();

				pstmt.setInt(1, id);
				pstmt.setString(2, name);

				int result = pstmt.executeUpdate();
				if (result == 1) {
					System.out.println("Record inserted successfully.");
				}

				System.out.print("Do you wish to continue(Y/N)? ");
				userChoice = scan.nextLine();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
