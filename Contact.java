package com.mydata.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
     private String name;
     
     private String phone;
     
     private String email;
     
     private String query;

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public Contact(int id, String name, String phone, String email, String query) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.query = query;
	}

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", query=" + query
				+ "]";
	}
     
     
}
