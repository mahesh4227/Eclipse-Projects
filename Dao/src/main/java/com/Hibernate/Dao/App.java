package com.Hibernate.Dao;

import java.util.List;
public class App 
{
	public static void main(String[] args) {
		        BookService bookService = new BookService();
		        Book book1 = new Book("1", "hello world", "mahesh");
		        Book book2 = new Book("2", "hey", "xyz");
		        Book book3 = new Book("3", "abc", "mno");
		        System.out.println("Insert - start");
		        bookService.insert(book1);
		        bookService.insert(book2);
		        bookService.insert(book3);
		        List<Book> books1 = bookService.findAll();
		        System.out.println("Books Persisted are :");
		        for (Book b : books1) {
		            System.out.println("-" + b.toString());
		        }
		        System.out.println(" Insert - end ");
		        System.out.println(" Update - start");
		        book1.setTitle("The Idiot");
		        bookService.update(book1);
		        System.out.println("Book Updated is =>" +bookService.findById(book1.getId()).toString());
		        System.out.println(" Update - end");
		        System.out.println(" Find - start");
		        String id1 = book1.getId();
		        Book another = bookService.findById(id1);
		        System.out.println("Book found with id " + id1 + " is =>" + another.toString());
		        System.out.println("*** Find - end ***");
		        System.out.println("Delete - start ");
		        String id3 = book3.getId();
		        bookService.delete(id3);
		        System.out.println("Deleted book with id " + id3 + ".");
		        System.out.println("Now all books are " + bookService.findAll().size() + ".");
		        System.out.println(" Delete - end ");
		        System.out.println(" FindAll - start ");
		        List<Book> books2 = bookService.findAll();
		        System.out.println("Books found are :");
		        for (Book b : books2) {
		            System.out.println("-" + b.toString());
		        }
		        System.out.println(" FindAll - end ");
		        System.out.println("DeleteAll - start ");
		        bookService.deleteAll();
		        System.out.println("Books found are now " + bookService.findAll().size());
		        //System.out.println(" DeleteAll - end ");
		         System.exit(0);
		    }

}
