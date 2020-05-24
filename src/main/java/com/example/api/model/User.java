package com.example.api.model;

import java.time.LocalDate;

import io.swagger.annotations.ApiModelProperty;

public class User {

	public User(long id, String name, String dob) {
		this.id = id;
		this.name = name;
		this.dateOfBirth = LocalDate.parse(dob);
	}
	
	@ApiModelProperty(hidden = true)
	private Long id;
	
	private String name;
	
	private LocalDate dateOfBirth;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	@Override
	public String toString() {		
		return this.id + " " + this.name;
	}
	
}
