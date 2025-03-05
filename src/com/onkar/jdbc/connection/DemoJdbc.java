package com.onkar.jdbc.connection;
import java.sql.*;

public class DemoJdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		/*
		 * import package load and register create connection create statement execute
		 * statement process the result close
		 */

		String url = "jdbc:mysql://localhost:3306/imdb";
		String uname = "root";
		String pass = "root";
		Connection con = DriverManager.getConnection(url, uname, pass);
		System.out.println("connection established");
	}

}
