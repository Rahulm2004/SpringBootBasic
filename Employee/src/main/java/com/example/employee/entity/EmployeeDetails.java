package com.example.employee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EmployeeDetails {
   
	@Id
	private int employeeid;
	private String name;
	private String dept;
	private int salary;
	EmployeeDetails()
	{}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [employeeid=" + employeeid + ", name=" + name + ", dept=" + dept + ", salary=" + salary
				+ "]";
	}
	public EmployeeDetails(int employeeid, String name, String dept, int salary) {
		super();
		this.employeeid = employeeid;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
     
}
