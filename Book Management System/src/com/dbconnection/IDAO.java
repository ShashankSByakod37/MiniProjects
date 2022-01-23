package com.dbconnection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.model.Book;

public interface IDAO {
	

	public int insertBook(Book book);
	public int deleteBook(int id);
	public int updatePrice(int id,double price);
	public List<Book> viewAllBooks();
	

}
