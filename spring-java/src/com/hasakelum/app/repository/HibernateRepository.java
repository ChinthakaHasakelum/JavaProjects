package com.hasakelum.app.repository;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import com.hasakelum.app.model.*;

@Repository("employeeRespository")
public class HibernateRepository implements EmployeeRespository {
	
	@Autowired
	Environment environment;
	
	
	@Value("${city}")
	String city;
	
	@Override
	public List<Employee> getAllEmployee() {
		
		List <Employee> employees=new ArrayList<>();
		Employee employee=new Employee();
		String name=environment.getProperty("name");
		
		
		employee.setName(name);
		employee.setLocation(city);
		employees.add(employee);
		
		return employees;
		
		
		
	}
	
	

}
