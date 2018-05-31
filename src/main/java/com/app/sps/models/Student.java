package com.app.sps.models;

import javax.persistence.*;
/**
 * Entity Class For Student Object.
 * @author Vijay.Jejurkar
 *
 */
@Entity
public class Student {
	
	@Id
	private Integer Id;
	private String firstName;
	private String lastName;
	private String mobileNumber;
	
	
	public Student(Integer id, String firstName, String lastName, String mobileNumber) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
	}


	public Integer getId() {
		return Id;
	}


	public void setId(Integer id) {
		Id = id;
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


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
	

}
