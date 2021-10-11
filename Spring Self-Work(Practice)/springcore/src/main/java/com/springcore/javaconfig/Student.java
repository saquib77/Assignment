package com.springcore.javaconfig;

public class Student {
	private  Book book;
	
	public Student(Book book) {
		super();
		this.book = book;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public void study() {
		this.book.showBook();
		System.out.println("Studying....");
	}

	@Override
	public String toString() {
		return "Student [book=" + book + "]";
	}
}
