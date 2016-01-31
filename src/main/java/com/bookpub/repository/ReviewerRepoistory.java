package com.bookpub.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bookpub.domain.Publisher.Reviewer;

@RepositoryRestResource
public interface ReviewerRepoistory
    extends PagingAndSortingRepository<Reviewer, Long> {
}