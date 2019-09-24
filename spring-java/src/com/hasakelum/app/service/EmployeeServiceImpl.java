package com.hasakelum.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hasakelum.app.model.Employee;
import com.hasakelum.app.repository.EmployeeRespository;
import com.hasakelum.app.repository.HibernateRepository;

public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRespository employeeRespository;//=new HibernateRepository();

	public EmployeeServiceImpl() {
		System.out.println("Constructor");
	}
	
	
	public EmployeeServiceImpl(EmployeeRespository employeeRespository) {
		System.out.println("Constructor2");
		this.employeeRespository=employeeRespository;
	}
	
	
	public EmployeeRespository getEmployeeRespository() {
		return employeeRespository;
	}

	public void setEmployeeRespository(EmployeeRespository employeeRespository) {
		System.out.println("Setter");
		this.employeeRespository = employeeRespository;
	}

	@Override
	public List<Employee> getAllEmployee() {
	
		return employeeRespository.getAllEmployee();
		
	} 
	
	
	
	

}
