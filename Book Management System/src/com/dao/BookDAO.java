package com.dao;

import java.util.*;

import com.db.*;
import com.model.*;


public class BookDAO {
	Database db;
	public BookDAO() {
		 db = new Database();
	}
	
	public TreeSet<Book> viewALL(){
		return db.getBooks();
		
	}
	
	public void insertBook(Book bk) {
		db.addBook(bk);
		
	}
	
	public int deleteBook(int BookId) {
		return db.deleteBook(BookId);
	}
	
	public int updateBook(int BookId,double price) {
		return db.updateBook(BookId,price);
	}
//	public 
	
	
}
