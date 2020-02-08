package com.jm2200126.jdbc.pstmt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.jm2200126.jdbc.util.DbUtil;

public class UpdateRecordsUsingPstmt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userChoice = "Y";
		try {
			Connection con = DbUtil.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("UPDATE JM2200126_USER SET NAME = ? WHERE ID = ?");
			while (userChoice.equalsIgnoreCase("Y")) {
				System.out.print("Enter ID of user you wish to update: ");
				int id = Integer.parseInt(scan.nextLine());

				System.out.print("Enter new name: ");
				String name = scan.nextLine();

				pstmt.setInt(2, id);
				pstmt.setString(1, name);

				int result = pstmt.executeUpdate();
				if (result == 1) {
					System.out.println("Record updated successfully");
				}

				System.out.print("Do you wish to continue(Y/N)? ");
				userChoice = scan.nextLine();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
