package com.core.spring.data.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.core.spring.data.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
