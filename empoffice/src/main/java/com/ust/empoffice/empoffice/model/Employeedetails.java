package com.ust.empoffice.empoffice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employeedetails {
	@Id
	@GeneratedValue
    private int id;
	private String name;
	private String email;
	private int experience;
	private String domain;
//	public Employeedetails(int id, String name, String email, int experience, String domain) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.email = email;
//		this.experience = experience;
//		this.domain = domain;
//	}
//	public Employeedetails() {}
	public Employeedetails() {
		// TODO Auto-generated constructor stub
	}
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
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	
	
	
	
	
}	