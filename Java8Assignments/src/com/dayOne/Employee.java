package com.dayOne;

public class Employee {
	
	private int empID;
	private String empName;
	public Integer empAge;
	
	
	
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", empAge=" + empAge + "]";
	}


	public Employee(int empID, String empName, int empAge) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empAge = empAge;
	}
	
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	
}
