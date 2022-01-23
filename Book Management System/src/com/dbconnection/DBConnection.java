package com.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	private static DBConnection db;
//	private Connection conn;
	
	
	private DBConnection(){
		
	}
	
	public static DBConnection getInstance() {
		if(db == null) {
			db = new DBConnection();
		}
		return db;
	}
	
	public Connection getConnect() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost/Books", "root","root" );
	}
	
	
}