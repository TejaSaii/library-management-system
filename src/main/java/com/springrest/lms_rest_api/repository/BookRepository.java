package com.springrest.lms_rest_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrest.lms_rest_api.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {
	
}
