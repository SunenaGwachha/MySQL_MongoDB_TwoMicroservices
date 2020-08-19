package com.example.execute.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Address {
	
	@Id
	private String id;
	private String city;
	private String state;
	private Long zipcode;
	
	
	
	public Address() {
		super();
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public Long getZipcode() {
		return zipcode;
	}



	public void setZipcode(Long zipcode) {
		this.zipcode = zipcode;
	}
}
