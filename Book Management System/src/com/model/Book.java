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
	public String getBook() {
		return book;
	}
	public String getAuthor() {
		return author;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return ("[Book Id : "+this.bookId+", Book : "+this.book+", Author : "+this.author+", Price : "+this.price+" ]");
		
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
