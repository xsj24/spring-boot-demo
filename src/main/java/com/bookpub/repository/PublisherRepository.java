package com.bookpub.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bookpub.domain.Publisher;

@RepositoryRestResource
public interface PublisherRepository 
	extends PagingAndSortingRepository<Publisher, Long> {

}
