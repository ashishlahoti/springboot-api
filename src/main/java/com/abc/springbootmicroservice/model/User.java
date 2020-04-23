package com.abc.springbootmicroservice.model;

public class User {

	public User(long id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	private Long id;
	
	private String name;
	
	private Integer age;

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
	
}
