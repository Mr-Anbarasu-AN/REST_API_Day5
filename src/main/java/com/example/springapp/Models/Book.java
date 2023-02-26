package com.example.springapp.Models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Book_TB")
public class Book {

	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="BookName")
	private String BookName;
	
	@Column(name="price")
	private float price;
	
	@Column (name="quantity")
	private int quantity;
	
	@Column(name="authorName")
	private String authorName;
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getBookName() {
		return BookName;
	}



	public void setBookName(String bookName) {
		BookName = bookName;
	}



	public float getPrice() {
		return price;
	}



	public void setPrice(float price) {
		this.price = price;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public String getAuthorName() {
		return authorName;
	}



	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}



	public Book(int id, String bookName, float price, int quantity, String authorName) {
		super();
		this.id = id;
		BookName = bookName;
		this.price = price;
		this.quantity = quantity;
		this.authorName = authorName;
	}
	
	
	
	public Book() {
		
	}
}