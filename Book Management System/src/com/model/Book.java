package com.model;

import java.util.Objects;

public class Book implements Comparable<Book> {
	int bookId;
	String book;
	String author;
	Double price;
	
	public Book() {
		
	}
	public Book(int bookId, String book, String author, Double price) {
		super();
		this.bookId = bookId;
		this.book = book;
		this.author = author;
		this.price = price;
	}
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public void setBook(String book) {
		this.book = book;
	}
	public String getBook() {
		return book;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return (this.bookId+"\t"+this.book+"\t"+this.author+"\t"+this.price);
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(bookId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(book, other.book) && bookId == other.bookId
				&& Objects.equals(price, other.price);
	}
	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		
		return (this.bookId - o.bookId);
	}
	
	
	
}
