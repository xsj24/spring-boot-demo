package com.bookpub.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bookpub.domain.Book;
import com.bookpub.repository.BookRepository;

@RestController
@RequestMapping("/books")
public class BookController {
	@Autowired
	private BookRepository bookRepository;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public Iterable<Book> getAllBooks() {
		return bookRepository.findAll();
	}
	
	@RequestMapping(value="/{isbn}", method=RequestMethod.GET)
	public Book getBook(@PathVariable String isbn) {
		return bookRepository.findBookByIsbn(isbn);
	}
	
	@RequestMapping(value="/sessioin", method=RequestMethod.GET)
	public String getSessionId(HttpServletRequest request) {
		return request.getSession().getId();
	}
}
