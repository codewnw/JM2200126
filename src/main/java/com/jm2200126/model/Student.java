package com.jm2200126.model;

import java.util.Arrays;

public class Student {
	private String name;

	private String email;

	private int age;

	private String address;

	private String status;

	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", age=" + age + ", address=" + address + ", status="
				+ status + ", gender=" + gender + ", courses=" + Arrays.toString(courses) + ", country=" + country
				+ "]";
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	private String gender;

	private String[] courses;

	private String country;

	public Student() {
		super();
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
