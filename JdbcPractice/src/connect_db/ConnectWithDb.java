package connect_db;

import java.sql.*;

public class ConnectWithDb {

	static final String DB_URL = "jdbc:mysql://localhost:3306/te?useSSL=false";
	static final String USER = "root";
	static final String PASS = "12345";

	public static void main(String[] args) {
		System.out.println("Connecting to a selected database...");
		// Open a connection
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);) {
			System.out.println("Connected database successfully...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
