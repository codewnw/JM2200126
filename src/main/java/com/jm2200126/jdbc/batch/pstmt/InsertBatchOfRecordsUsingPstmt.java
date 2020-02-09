package com.jm2200126.jdbc.batch.pstmt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.jm2200126.jdbc.util.DbUtil;

public class InsertBatchOfRecordsUsingPstmt {

	public static void main(String[] args) {
		try {
			// 1. Establish the connectio with db
			Connection con = DbUtil.getDbConnection();
			// 2.1 Prepare statement/command
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO JM2200126_USER VALUES(?, ?)");

			Scanner scan = new Scanner(System.in);
			String userChoice = "Y";
			while (userChoice.equalsIgnoreCase("y")) {
				System.out.print("Enter Id: ");
				int id = Integer.parseInt(scan.nextLine());

				System.out.print("Enter name: ");
				String name = scan.nextLine();

				// 2.2 set value in the question mark(placeholder/bind variable)
				pstmt.setInt(1, id);
				pstmt.setString(2, name);

				// 3.1 Add in the batch
				pstmt.addBatch();

				System.out.print("Do you wish to continue (Y/N)?: ");
				userChoice = scan.nextLine();
			}
			// 3.2 Execute batch
			int[] result = pstmt.executeBatch();

			// 4. Process the result
			for (int i = 0; i < result.length; i++) {
				System.out.print(result[i] + " ");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
