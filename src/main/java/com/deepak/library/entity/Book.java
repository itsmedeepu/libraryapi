package com.deepak.library.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "books")
public class Book implements Serializable {

	@GenericGenerator(name = "uq",strategy = "increment")
	@GeneratedValue(generator = "uq")
	@Id
	private int id;

	@Column(name = "bookname")
	private String name;

	@Column(name = "discreption")
	private String discreption;

	@Column(name = "authorname")
	private String author;

	@Column(name = "price")
	private Double price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDiscreption() {
		return discreption;
	}
	
	
	public void setDiscreption(String discreption) {
		this.discreption = discreption;
	}
}