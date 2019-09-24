package com.hasakelum.app.repository;

import java.util.List;
import java.util.ArrayList;
import com.hasakelum.app.model.*;

public class HibernateRepository implements EmployeeRespository {
	
	
	@Override
	public List<Employee> getAllEmployee() {
		
		List <Employee> employees=new ArrayList<>();
		Employee employee=new Employee();
		
		employee.setName("Hasakelum");
		employee.setLocation("Malabe");
		employees.add(employee);
		
		return employees;
		
		
		
	}
	
	

}
