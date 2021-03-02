package com.samples.app;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

import com.samples.model.Employee;
import com.samples.service.EmployeeServices;

public class MapSamples {
	
	public static void main(String are[]) {
		EmployeeServices service = new EmployeeServices();		
		Map<String, List<Employee>> empsByDept = service.getEmployeesByDept();
		 
		empsByDept.forEach((k,v) -> System.out.println(k + ", " + v));
		

		// get total employee in company
		System.out.println("\n  highest Salary employee : " +		
					empsByDept.entrySet()
					.stream()
					.flatMap(s -> s.getValue().stream())
					.count());
		
		
		// get highest Age in company
		System.out.println("\n  Most senior employee : " +		
					empsByDept.entrySet()
					.stream()
					.flatMap(s -> s.getValue().stream())
					.max(Comparator.comparing(Employee::getAge)));
		
		// get highest Salary in company
		System.out.println("\n  highest Salary employee : " +		
					empsByDept.entrySet()
					.stream()
					.flatMap(s -> s.getValue().stream())
					.max(Comparator.comparing(Employee::getSalary)));
		
		
		// get highest Salary in company 

		System.out.println("\n top 5 highest Salary employee : " );
					empsByDept.entrySet()
					.stream()
					.flatMap(s -> s.getValue().stream())
					.sorted(Comparator.comparing(Employee::getSalary).reversed()) 				
					.limit(5).forEach(System.out::println); 


		System.out.println("\n  top 5 highest Salary / Senior employee : " );
					empsByDept.entrySet()
					.stream()
					.flatMap(s -> s.getValue().stream())
					.sorted(Comparator.comparing(Employee::getSalary).reversed().thenComparing(Comparator.comparing(Employee::getAge).reversed())) 				
					.limit(5).forEach(System.out::println); 
	}

}
