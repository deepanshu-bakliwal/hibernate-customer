package com.lti.entity;

import javax.persistence.*;



@Entity
@Table(name="TBL_CUST")

public class Customer {
	@Id //pk
	@GeneratedValue
	
	@Column(name = "CUST_ID")
	 private int id;
	
	@Column(name="CUST_NAME")
	 private  String name;
	
	@Column(name="CUST_EMAIL")
     private String email;
     
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


}
