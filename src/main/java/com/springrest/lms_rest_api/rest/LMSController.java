package com.springrest.lms_rest_api.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.lms_rest_api.entity.Book;
import com.springrest.lms_rest_api.entity.Supplier;
import com.springrest.lms_rest_api.repository.BookRepository;
import com.springrest.lms_rest_api.repository.SupplierRepository;

//@RestController
public class LMSController {
	
	@Autowired
	private SupplierRepository supplierRepository;
	
	@Autowired
	private BookRepository bookRepository;
	
	@GetMapping("/suppliers")
	public List<Supplier> getSuppliers() {
		return supplierRepository.findAll();
	}
	
	@GetMapping("/books")
	public List<Book> getBooks() {
		return bookRepository.findAll();
	}
	
	
	@PostMapping("/book")
	public Book saveBook(@RequestBody Book tempBook) {
		return bookRepository.save(tempBook);
	}
	//save a object from postman or by java object and see if supplier is getting saved in the db
	
}
