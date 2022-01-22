package com.dbconnection;

import java.sql.*;

public class JDBCDAO {
	public static void main(String args[]) throws SQLException {
		
		
		Connection conn = DBConnection.getInstance().getConnect();
		
		PreparedStatement ps = conn.prepareStatement("insert into BookEntity values(?,?,?,?) ");
		
		PreparedStatement p1 = conn.prepareStatement("select * from BookEntity");
		ResultSet rs = p1.executeQuery();
		
		while(rs.next()) {
			System.out.println("database data is "+rs.getInt(1)+" "+ rs.getString(2));
		}
		
		
		System.out.println();
		
//		ps.setInt(1, 3);
//		ps.setString(2, "Wings of Fire");
//		ps.setString(3,"APJ Abdul Kalam");
//		ps.setDouble(4,350.5);
		
		
//		int result = ps.executeUpdate();
		
		
//		System.out.println("result is "+ result);
	}
}
