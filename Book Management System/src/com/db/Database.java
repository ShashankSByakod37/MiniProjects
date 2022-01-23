package com.db;


import com.model.*;

import java.util.*;

public class Database{
	
	TreeSet<Book> books;
		
	
	public Database() {
		books = new TreeSet<Book>();
		
		
	}
	@Override
	public String toString() {
		return("hello");
	}

	public TreeSet<Book> getBooks() {
		return books;
	}


	public void setBooks(TreeSet<Book> books) {
		this.books = books;
	}
	
	
	public void addBook(Book bk) {
		books.add(bk);
	}
	
	public Book search(int BookId) {
		Boolean flag = false;
		Book bk = null;
		for(Book bkitr : books) {
			bk = bkitr;
			if(bk.getBookId() == BookId) {
				return bk;
			}
			
		}
		return null;
	}
	
	public int deleteBook(int BookId) {

		Book bk = search(BookId);
		if(bk!=null) {
			books.remove(bk);
			return 1;
		}
		else {
			return -1;
			
		}
	}

	public int updateBook(int BookId,double price) {
		Book bk = search(BookId);
		if(bk!=null) {
			bk.setPrice(price);
			return 1;
		}
		return -1;
	}	
}
