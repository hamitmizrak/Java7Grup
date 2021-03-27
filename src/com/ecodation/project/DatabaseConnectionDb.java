package com.ecodation.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionDb {

	private Connection connection;
	private String url = "jdbc:mysql://localhost:3306/hastane_otomasyonu";
	private String user = "root";
	private String password = "root";

	public Connection dbSuccessConnection() {

		try {
			if (this.connection == null || this.connection.isClosed()) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					// System.out.println("driver başarılı bir şekilde yüklendi.");
					connection = DriverManager.getConnection(url, user, password);
					// System.out.println("database bağlantısı başarılı");
				} catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			// return null;
		}
		return connection;
	}

	public static void main(String[] args) {
		DatabaseConnectionDb connectionDb = new DatabaseConnectionDb();
		connectionDb.dbSuccessConnection();
	}
}
