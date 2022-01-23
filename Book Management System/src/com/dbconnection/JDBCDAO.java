package com.dbconnection;

import java.sql.*;
import java.util.List;
import java.util.Set;

import com.model.Book;

public class JDBCDAO implements IDAO{
//	public static void main(String args[]) throws SQLException {
//		
//		
//		Connection conn = DBConnection.getInstance().getConnect();
//		
//		PreparedStatement ps = conn.prepareStatement("insert into BookEntity values(?,?,?,?) ");
//		
//		PreparedStatement p1 = conn.prepareStatement("select * from BookEntity");
//		ResultSet rs = p1.executeQuery();
//		
//		while(rs.next()) {
//			System.out.println("database data is "+rs.getInt(1)+" "+ rs.getString(2));
//		}
//		
//		
//		System.out.println();
//		
//	}
	DBOperation DBops;
	public JDBCDAO() throws SQLException {
		DBops = new DBOperation();
	}
	
	@Override
	public int insertBook(Book book) {
		return DBops.insertBook(book);
	}

	@Override
	public int deleteBook(int id) {
		// TODO Auto-generated method stub
		return DBops.deleteBook(id);
//		return 0;
	}

	@Override
	public int updatePrice(int id, double price) {
		// TODO Auto-generated method stub
		return DBops.updatePrice(id,price);
	}

	@Override
	public List<Book> viewAllBooks() {
		// TODO Auto-generated method stub
//		System.out.println("hello from db");
		return DBops.viewAllBooks();
//		return null;
	}

//	@Override
//	public ArrayList<Book> viewAllBooks() {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
