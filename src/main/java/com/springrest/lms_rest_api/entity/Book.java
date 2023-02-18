package com.springrest.lms_rest_api.entity;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="LMS_BOOK_DETAILS")
public class Book {

	@Id
	@Column(name="BOOK_CODE")
	private String bookCode;
	
	@Column(name="BOOK_TITLE")
	private String bookTitle;
	
	@Column(name="CATEGORY")
	private String category;
	
	@Column(name="AUTHOR")
	private String author;
	
	@Column(name="PUBLICATION")
	private String publication;
	
	@Column(name="PUBLISH_DATE")
	private Date publishDate;
	
	@Column(name="BOOK_EDITION")
	private int bookEdition;
	
	@Column(name="PRICE")
	private double price;
	
	@Column(name="RACK_NUM")
	private String rackNum;
	
	@Column(name="DATE_ARRIVAL")
	private Date dateArrival;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="SUPPLIER_ID")
	private Supplier supplier;
	
	public Book() {
		
	}
	
	public Book(String bookCode, String bookTitle, String category, String author, String publication, Date publishDate,
			int bookEdition, double price, String rackNum, Date dateArrival) {
		super();
		this.bookCode = bookCode;
		this.bookTitle = bookTitle;
		this.category = category;
		this.author = author;
		this.publication = publication;
		this.publishDate = publishDate;
		this.bookEdition = bookEdition;
		this.price = price;
		this.rackNum = rackNum;
		this.dateArrival = dateArrival;
	}



	public String getBookCode() {
		return bookCode;
	}

	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public int getBookEdition() {
		return bookEdition;
	}

	public void setBookEdition(int bookEdition) {
		this.bookEdition = bookEdition;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getRackNum() {
		return rackNum;
	}

	public void setRackNum(String rackNum) {
		this.rackNum = rackNum;
	}

	public Date getDateArrival() {
		return dateArrival;
	}

	public void setDateArrival(Date dateArrival) {
		this.dateArrival = dateArrival;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	
}
