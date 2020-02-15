package com.jm2200126.jdbc.blob;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jm2200126.jdbc.util.DbUtil;

public class SaveImage {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("src//main//resources//img//tech-word-cloud.jpg");
			Connection con = DbUtil.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO JM2200126_PROFILE VALUES(?, ?)");

			pstmt.setString(1, "Tech Word Cloud");
			pstmt.setBinaryStream(2, fis, fis.available());

			int result = pstmt.executeUpdate();
			if (result == 1) {
				System.out.println("Profile created succeessfully.");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
