package com.bookpub.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Publisher {
	
	private Long id;
	private String name;
	
	private List<Book> books;

	protected Publisher() {}
	
	public Publisher(String name) {
		this.name = name;
	}

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(mappedBy="publisher")
	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	@Entity
	public class Reviewer {
		
		@Id
		@GeneratedValue
		private Long id;
		private String firstName;
		private String lastName;
		
		protected Reviewer() {}

		public Reviewer(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		
	}
	
}
