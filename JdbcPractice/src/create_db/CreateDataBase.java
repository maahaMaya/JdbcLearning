package create_db;

import java.sql.*;

public class CreateDataBase {
	static final String DB_URL = "jdbc:mysql://localhost:3306/te?useSSL=false";
	static final String USER = "root";
	static final String PASS = "12345";
	static final String QUERY = "SELECT id, first, last, age FROM Employees";

	public static void main(String[] args) {
		// Open a connection
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();) {
			
			//PreparedStatement
			String sql = "CREATE DATABASE STUDENTS";

			int valueToCheckExecuteUpdate = stmt.executeUpdate(sql);

			//To check executeUpdate is modify the Database or not
			if (valueToCheckExecuteUpdate > 0) {
				System.out.println("Database created successfully...");
			}
			else {
				System.out.println("Try agin to  create a Database ...");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
