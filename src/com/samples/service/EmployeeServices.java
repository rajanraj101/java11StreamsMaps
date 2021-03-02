package com.samples.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Supplier;

import com.samples.model.Employee;

public class EmployeeServices {

	Supplier<String> randomName = () -> {
		return new Random().ints(97, 123)
				      .limit(10)
				      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
				      .toString();

	};
	
	Supplier<String> randomUptoThreeDigit = () -> { return String.valueOf(new Random().nextInt(1000)); }; 
	Supplier<Integer> randomUptoTwoDigit = () -> { return new Random().ints(18,60).findAny().getAsInt(); }; 
	Supplier<LocalDate> randomDate = () -> { return LocalDate.now().minusDays(randomUptoTwoDigit.get()); }; 
	
	public List<Employee> getEmployees(String dept) {
		List<Employee> emps = new ArrayList<Employee>();
		
		emps.add(new Employee(dept.concat(randomUptoThreeDigit.get()) , randomName.get(), randomUptoTwoDigit.get(), 10000, randomDate.get()));
		emps.add(new Employee(dept.concat(randomUptoThreeDigit.get()) , randomName.get(), randomUptoTwoDigit.get(), 15000, randomDate.get()));
		emps.add(new Employee(dept.concat(randomUptoThreeDigit.get()) , randomName.get(), randomUptoTwoDigit.get(), 10000, randomDate.get()));
		emps.add(new Employee(dept.concat(randomUptoThreeDigit.get()) , randomName.get(), randomUptoTwoDigit.get(), 25000, randomDate.get()));
		emps.add(new Employee(dept.concat(randomUptoThreeDigit.get()) , randomName.get(), randomUptoTwoDigit.get(), 28000, randomDate.get()));
		emps.add(new Employee(dept.concat(randomUptoThreeDigit.get()) , randomName.get(), randomUptoTwoDigit.get(), 23000, randomDate.get()));
		
		return emps;		
	}	

	public Map<String, List<Employee>> getEmployeesByDept( ) {
		Map<String, List<Employee>> empsByDept = new HashMap<String, List<Employee>>();
		
		empsByDept.put("HR", this.getEmployees("HR"));		
		empsByDept.put("IT", this.getEmployees("IT"));		
		empsByDept.put("Sales", this.getEmployees("Sales"));			
		 
		return empsByDept;		
	}

}
