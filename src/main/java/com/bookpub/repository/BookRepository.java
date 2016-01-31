package com.bookpub.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookpub.domain.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
	Book findBookByIsbn(String isbn);
}
