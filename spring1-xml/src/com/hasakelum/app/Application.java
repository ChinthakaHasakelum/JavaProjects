package com.hasakelum.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hasakelum.app.model.Employee;
import com.hasakelum.app.service.EmployeeService;
import com.hasakelum.app.service.EmployeeServiceImpl;

public class Application {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//EmployeeService employeeService=new EmployeeServiceImpl();
		
		EmployeeService employeeService=applicationContext.getBean("employeeService",EmployeeService.class);
		
		List<Employee> employee=employeeService.getAllEmployee();
		
		
		for(Employee employee2: employee){
			
			System.out.println(employee2.getName()+" From "+employee2.getLocation());
		}
		
	}

}
