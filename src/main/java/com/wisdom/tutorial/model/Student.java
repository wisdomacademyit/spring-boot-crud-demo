package com.wisdom.tutorial.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student {

	@Id
	@GeneratedValue
	private Integer id;

	@Column(name = "FIRST_NAME", length = 60)
	private String firstName;

	@Column(name = "LAST_NAME", length = 60)
	private String lastName;

	@Column(name = "EMAIL", length = 40)
	private String email;

	@Override
	public String toString() {

		return "[" + "First Name: " + firstName + ", Last Name:" + lastName + "]";	
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
