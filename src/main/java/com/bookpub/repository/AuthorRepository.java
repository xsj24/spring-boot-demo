package com.bookpub.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bookpub.domain.Author;

@RepositoryRestResource
public interface AuthorRepository
 extends PagingAndSortingRepository<Author, Long> {
}