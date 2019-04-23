package com.sai.store.books.textbooks;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TextBooks")
public class TextBooks
{
	@Id
	private String id;
	private String department;
	private String name;
	private String description;
	private String isbn;
	private double unitPrice;
	

	public TextBooks(String id, String department, String name, String description, String isbn, double unitPrice) 
	{		
		super(); this.id = id;  this.department=department;  this.name = name;
		this.description = description; this.isbn =isbn;	this.unitPrice = unitPrice;
	}
	
	
	public TextBooks() {}
	
	public String getId() {return id;}		
	
	public void setId(String id) {this.id = id;}
		
	public String getName() {return name;}
			
	public void setName(String name) {this.name = name;}
			
	public String getDescription() {return description;}
			
	public void setDescription(String description) {this.description = description;}
		
	public String getIsbn() {return isbn;}
		
	public void setIsbn(String isbn) {this.isbn = isbn;}
		
	public String getDepartment() {return department;}
		
	public void setDepartment(String department) {this.department = department;}

	public double getUnitPrice() {return unitPrice;}

	public void setUnitPrice(double unitPrice) {this.unitPrice = unitPrice;}
		
}
