package com.lip6.entities.EntityPhoneNumber;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PhoneNumber {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String phoneKind;
	private String phoneNumber;
	
	
	
	
	public PhoneNumber(String phoneKind, String phoneNumber) {
		super();
		this.phoneKind = phoneKind;
		this.phoneNumber = phoneNumber;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPhoneKind() {
		return phoneKind;
	}
	public void setPhoneKind(String phoneKind) {
		this.phoneKind = phoneKind;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
}
