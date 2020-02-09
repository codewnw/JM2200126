package com.jm2200126.jdbc.batch.stmt;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.jm2200126.jdbc.util.DbUtil;

public class UpdateBatchOfRecordsUsingStmt {

	public static void main(String[] args) {
		try {
			// 1. Establish the connection with db
			Connection con = DbUtil.getDbConnection();
			// 2. Create command/statement
			Statement stmt = con.createStatement();
			Scanner scan = new Scanner(System.in);
			String userChoice = "Y";
			while (userChoice.equalsIgnoreCase("Y")) {
				System.out.print("Tell the ID for updating name: ");
				int id = Integer.parseInt(scan.nextLine());

				System.out.print("Enter new name: ");
				String name = scan.nextLine();
				// 3.1 Add in the batch
				stmt.addBatch("UPDATE JM2200126_USER SET NAME = '" + name + "' WHERE ID = " + id);

				System.out.print("Do you wish to continue (Y/N)?: ");
				userChoice = scan.nextLine();
			}

			// 3.2 Execute batch
			int[] result = stmt.executeBatch();

			// 4. Process the result
			for (int i = 0; i < result.length; i++) {
				System.out.print(result[i] + " ");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
