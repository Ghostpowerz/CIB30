package com.BU.CIB30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {

	public static void main(String args[]) throws SQLException {
		Connection con = null;
		Statement stmt = null;
		try {


			String host = "jdbc:Oracle:thin://s5009373_y1@//decatur.bournemouth.ac.uk:1521/decprd";
			String username = "s5009373_y1";
			String password = "mercury1";

			con = DriverManager.getConnection(host, username, password);

		}

		catch (SQLException err) {
			System.out.println(err.getMessage());
		}

		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT YEAR FROM BOND_FILMS");

			while (rs.next()) {
				int filmid = rs.getInt("YEAR");
				System.out.println(filmid + "\n");
			}





		}
		catch (SQLException e) {
			System.out.println("ERROR");
		} finally {
			if (stmt != null) { stmt.close(); }
		}
	}


}
