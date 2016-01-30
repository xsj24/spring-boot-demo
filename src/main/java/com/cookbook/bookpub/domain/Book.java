package com.cookbook.bookpub.domain;

import javax.persistence.Entity;

@Entity
public class Book {
	
	private Long id;
	private String isbn;
	private String title;
	private String description;
	
	protected Book() {}

	public Book(String isbn, String title, String description) {
		this.id = id;
		this.isbn = isbn;
		this.title = title;
		this.description = description;
	}
	
	
}
