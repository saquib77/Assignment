package com.springrest.springrest.entity;

import javax.persistence.*;

@Entity
public class Courses {
	
	@Id
	private Long id;
	private String title;
	private String description;
	private Long price;
	public Courses(Long id, String title, String description,Long price) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.price = price;
	}
	public Courses() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Courses [id=" + id + ", title=" + title + ", description=" + description + ", price=" + price + "]";
	}
	
}
