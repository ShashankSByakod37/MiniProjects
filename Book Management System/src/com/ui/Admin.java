package com.ui;


import com.model.*;
import java.util.*;
import com.dao.BookDAO;
public class Admin {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		
		Scanner s = new Scanner(System.in).useDelimiter("\n");
		BookDAO dao= new BookDAO();
		char c;
		
		do {
			System.out.println("\npress 1 for View all Books");
			System.out.println("press 2 for Add a Book");
			System.out.println("press 3 for Delete a Book");
			System.out.println("press 4 for Update a Book");
			System.out.println("press 5 to QUIT\n");
			try{
				choice = s.nextInt(); 
				switch(choice) {
				case 1:
					System.out.println("View HERE : \n");
					Set<Book> bks = dao.viewALL();
					if(bks.isEmpty()) {
						System.out.println("Please add some books to display by pressing 2 in main menu.\n");
					}
					
					Iterator<Book> itr = bks.iterator();
					
					while(itr.hasNext()) {
						System.out.println(itr.next());
						
					}
					break;
				case 2:
					System.out.println("\nAdd ur book here \n");
					try {
						System.out.println("Enter the Book Id: \n");
						int BookId = s.nextInt();
						System.out.println("Enter the Book: \n");
						String BookName = s.next();
						System.out.println("Enter the Author's Name: \n");
						String AuthorName = s.next();
						System.out.println("Enter the Books's price: \n");
						Double Price = s.nextDouble();
						
						Book bk = new Book(BookId,BookName,AuthorName,Price);
						dao.insertBook(bk);
						
						System.out.println("Successfully added a book");
					}
					catch(Exception e) {
						System.out.println(e);
					}
					break;
				case 3:
					System.out.println("\nDelete the book here \n");
					System.out.println("Enter the book id:\n ");
					try {
						int BookId = s.nextInt();
//						if()
						int returnDelete = dao.deleteBook(BookId);
						
						if(returnDelete!=1) {
							throw new BookIdNotFoundException();
						}
						else {
							System.out.println("Deletion successfully completed");
						}
						
						
					}
					catch(BookIdNotFoundException e) {
						System.out.println("Please enter the correct Book Id");
						
					}
					
					catch (Exception E) {
						System.out.println(E);
					}
					break;
				case 4:
					System.out.println("\nUpdate Price of the book\n");
					try {
						System.out.println("Enter the book id: \n ");
						int BookId1 = s.nextInt();
						System.out.println("Enter the new price of the book: ");
						double price = s.nextDouble();
						int returnUpdate = dao.updateBook(BookId1,price);
						if(returnUpdate!= 1) {
							throw new BookIdNotFoundException();
						
						}
						else {
							System.out.println("Updation successfully completed");
						}
						
					}
					catch(BookIdNotFoundException e) {
						System.out.println("Please enter the correct Book Id");
						
					}
					catch (Exception E) {
						System.out.println(E);
					}
					
					break;
				
				default :
					System.exit(0);
					
				}
					
			}
			catch(InputMismatchException e) {
				System.out.println("Enter the numeric in range ");
			}
			
			System.out.println("press y to go back to main menu");
			s.next();

		}
		while(true);
	}
	

}
