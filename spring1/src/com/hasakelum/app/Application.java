package com.hasakelum.app;

import java.util.List;

import com.hasakelum.app.model.Employee;
import com.hasakelum.app.service.EmployeeService;
import com.hasakelum.app.service.EmployeeServiceImpl;

public class Application {
	
	public static void main(String[] args) {
		
		
		EmployeeService employeeService=new EmployeeServiceImpl();
		
		List<Employee> employee=employeeService.getAllEmployee();
		
		
		for(Employee employee2: employee){
			
			System.out.println(employee2.getName()+" From "+employee2.getLocation());
		}
		
	}

}
