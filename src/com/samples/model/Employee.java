package com.samples.model;

import java.time.LocalDate;

public class Employee {

	String empId;
	String name;
	int age;
	double salary;
	LocalDate doj;	
		
	public Employee(String empId, String name, int age, double salary, LocalDate doj) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.doj = doj;
	}
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", age=" + age + ", salary=" + salary + ", doj=" + doj
				+ "]";
	}
	
	
}
