package com.samples.app;

import java.util.List;
import java.util.Map;

import com.samples.model.Employee;
import com.samples.service.EmployeeServices;

public class MapFilters {
	public static void main(String are[]) {
		EmployeeServices service = new EmployeeServices();		
		Map<String, List<Employee>> empsByDept = service.getEmployeesByDept();
	
	}

}
