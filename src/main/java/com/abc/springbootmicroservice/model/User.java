package com.abc.springbootmicroservice.model;

import java.time.LocalDate;

public class User {

	public User(long id, String name, int age, String dob) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.dateOfBirth = LocalDate.parse(dob);
	}
	
	private Long id;
	
	private String name;
	
	private Integer age;
	
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	@Override
	public String toString() {		
		return this.id + " " + this.name + " " + this.age;
	}
	
}
