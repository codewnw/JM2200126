package com.jm2200126.jdbc.batch.pstmt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.jm2200126.jdbc.util.DbUtil;

public class UpdateBatchOfRecordsUsingPstmt {

	public static void main(String[] args) {
		try {
			// 1. Establish the connectio with db
			Connection con = DbUtil.getDbConnection();
			// 2.1 Prepare statement/command
			PreparedStatement pstmt = con.prepareStatement("UPDATE JM2200126_USER SET NAME = ? WHERE ID = ?");

			Scanner scan = new Scanner(System.in);
			String userChoice = "Y";
			while (userChoice.equalsIgnoreCase("y")) {
				System.out.print("Enter Id for updating name: ");
				int id = Integer.parseInt(scan.nextLine());

				System.out.print("Enter new name: ");
				String name = scan.nextLine();

				// 2.2 set value in the question mark(placeholder/bind variable)
				pstmt.setInt(2, id);
				pstmt.setString(1, name);

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
