package com.example.api.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModelProperty;

public class User {

	public User(long id, String name, String dob) {
		this.id = id;
		this.name = name;
		this.dateOfBirth = LocalDate.parse(dob);
	}
	
	public User() {}
	
	@ApiModelProperty(hidden = true)
	@JsonIgnore
	private Long id;
	
	private String name;
	
	@JsonFormat(pattern="dd MMM yyyy")
	private LocalDate dateOfBirth;
	
	@JsonFormat(pattern="dd MMM yyyy hh:mm:ss")
	private LocalDateTime lastLogin;
	
	@JsonFormat(pattern = "yyyy-MM-dd@HH:mm:ss.SSSXXX", locale = "en_SG", timezone = "Asia/Singapore")
	private ZonedDateTime zonedDateTime;

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
	
	public LocalDateTime getLastLogin() {
		return lastLogin;
	}
	
	public void setLastLogin(LocalDateTime lastLogin) {
		this.lastLogin = lastLogin;
	}
	
	public ZonedDateTime getZonedDateTime() {
		return zonedDateTime;
	}
	
	public void setZonedDateTime(ZonedDateTime zonedDateTime) {
		this.zonedDateTime = zonedDateTime;
	}
	
	@Override
	public String toString() {		
		return this.id + " " + this.name;
	}
}
