package com.jm2200126.jdbc.pstmt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.jm2200126.jdbc.util.DbUtil;

public class DeleteRecordsUsingPstmt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userChoice = "Y";

		try {
			Connection con = DbUtil.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("DELETE FROM JM2200126_USER WHERE ID = ?");

			while (userChoice.equalsIgnoreCase("Y")) {
				System.out.print("Enter Id to delete record: ");
				int id = Integer.parseInt(scan.next());

				pstmt.setInt(1, id);

				int result = pstmt.executeUpdate();
				if (result == 1) {
					System.out.println("Record deleted successfully");
				}

				System.out.print("Do you wish to continue?(Y/N) ");
				userChoice = scan.next();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
