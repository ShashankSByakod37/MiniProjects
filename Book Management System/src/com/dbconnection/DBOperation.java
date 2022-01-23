package com.dbconnection;

import java.sql.*;
import java.util.*;

import com.model.Book;

public class DBOperation {
	
	Connection conn;
	public DBOperation() throws SQLException {
		conn = DBConnection.getInstance().getConnect();
	}
	
	
	public List<Book> viewAllBooks(){
		
		List<Book> books = new ArrayList<>();
		
		
		try {
			PreparedStatement p = conn.prepareStatement("select * from BookEntity");
			ResultSet s = p.executeQuery();
			
			while(s.next()) {
				Book bk = new Book();
				bk.setBookId(s.getInt(1));
				bk.setBook(s.getString(2));
				bk.setAuthor(s.getString(3));
				bk.setPrice(s.getDouble(4));
				books.add(bk);
//				System.out.println("hello1");
//				bk = null;
				
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return books;
	}
	
	public int insertBook(Book book)  {
		PreparedStatement p;
		int res = -1;
		try {
			p = conn.prepareStatement("insert into BookEntity values(?,?,?,?)");
			p.setInt(1,book.getBookId());
			p.setString(2, book.getBook());
			p.setString(3, book.getAuthor());
			p.setDouble(4, book.getPrice());
			
			res = p.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return res;
		
//		return 0;
	}


	public int deleteBook(int id) {
		// TODO Auto-generated method stub
		
		PreparedStatement p;
		
		int res = -1;
		
		try {
			p = conn.prepareStatement("delete from BookEntity where BookID= ?");
			
			p.setInt(1, id);
			
			res = p.executeUpdate();
		}
		catch(SQLException E) {
			E.printStackTrace();
		}
		return res;
	}


	public int updatePrice(int id, double price) {
		// TODO Auto-generated method stub
		PreparedStatement p;
		
		int res = -1;
		
		try {
			p = conn.prepareStatement("update BookEntity set Price = ?  where BookID= ?");
			
			p.setInt(2, id);
			p.setDouble(1, price);
			
			res = p.executeUpdate();
		}
		catch(SQLException E) {
			E.printStackTrace();
		}
		return res;
//		return 0;
	}
	
	
	
	
	
	
	

}
