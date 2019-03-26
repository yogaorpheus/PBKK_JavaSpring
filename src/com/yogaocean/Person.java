package com.yogaocean;

public class Person {
	private String name;
	private String gender;
	private int age;
	private String contactNumber;
	
	
	public Person() {
		
	}
	
	public Person(String name, String gender, int age, String contactNumber) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.contactNumber = contactNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
}
