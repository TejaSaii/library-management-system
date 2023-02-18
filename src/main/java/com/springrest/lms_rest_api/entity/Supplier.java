package com.springrest.lms_rest_api.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="LMS_SUPPLIERS_DETAILS")
public class Supplier {

	@Id
	@Column(name="SUPPLIER_ID")
	private String supplierId;
	
	@Column(name="SUPPLIER_NAME")
	private String supplierName;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="CONTACT")
	private Long contact;
	
	@Column(name="EMAIL")
	private String email;
	
	@OneToMany(mappedBy="supplier", cascade=CascadeType.ALL,
			fetch=FetchType.LAZY)
	private List<Book> books;

	public Supplier(String supplierId, String supplierName, String address, Long contact, String email,
			List<Book> books) {
		super();
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.address = address;
		this.contact = contact;
		this.email = email;
		this.books = books;
	}
	
	public Supplier() {
		
	}

	public String getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getContact() {
		return contact;
	}

	public void setContact(Long contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	//convenience method for bi-directional relationship
	public void addBook(Book tempBook) {
		
		if(books == null) {
			books = new ArrayList<>();
		}
		
		books.add(tempBook);
		tempBook.setSupplier(this);
	}

	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", supplierName=" + supplierName + ", address=" + address
				+ ", contact=" + contact + ", email=" + email + ", books=" + books + "]";
	}
	
	
}
