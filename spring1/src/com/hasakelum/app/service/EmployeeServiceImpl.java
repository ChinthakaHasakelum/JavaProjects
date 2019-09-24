package com.hasakelum.app.service;

import java.util.List;


import com.hasakelum.app.model.Employee;
import com.hasakelum.app.repository.EmployeeRespository;
import com.hasakelum.app.repository.HibernateRepository;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeRespository employeeRespository=new HibernateRepository();

	@Override
	public List<Employee> getAllEmployee() {
	
		return employeeRespository.getAllEmployee();
		
	} 
	
	
	
	

}
