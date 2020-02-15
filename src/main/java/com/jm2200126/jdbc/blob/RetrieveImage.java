package com.jm2200126.jdbc.blob;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jm2200126.jdbc.util.DbUtil;

public class RetrieveImage {

	public static void main(String[] args) {
		try {
			Connection con = DbUtil.getDbConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM JM2200126_PROFILE");
			while (rs.next()) {
				String name = rs.getString("NAME");
				Blob blob = rs.getBlob("IMAGE");
				byte[] byteArr = blob.getBytes(1, (int) blob.length());
				FileOutputStream fos = new FileOutputStream("src//main//resources//img//" + name + "-out.jpg");
				fos.write(byteArr);
				fos.close();
			}
		} catch (SQLException | FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
