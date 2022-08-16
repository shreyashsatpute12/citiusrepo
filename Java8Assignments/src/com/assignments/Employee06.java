package com.assignments;

public class Employee06 {

	private String name;
	private String role;
	
	@Override
	public String toString() {
		return "SixEmployee [name=" + name + ", role=" + role + "]";
	}

	public Employee06(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
