package com.hash;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.hash.hibernate.HibernateUtil;
import com.hash.model.AllocationHistory;
import com.hash.model.Employee;



public class Application {

	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFacoty().openSession();
		saveData(session);
		
		
		//getData(session);
		
		session.close();

	}

	private static void getData(Session session) {
		
		session.beginTransaction();
		Employee employee=(Employee)session.get(Employee.class, 1);
		
		
		
		//System.out.println(employee.getName()+" Age "+employee.getAge() );
		//employee.setAge(employee.getAge()+1);
		
		session.getTransaction().commit();
		
		
	}

	private static void saveData(Session session) {
		
		System.out.println("Session Open");
		
		session.beginTransaction();
		Employee employee=new Employee();
		employee.setName("Hasakelum");
		employee.getAllocationData().setCity("Colombo");;
		
		employee.setAge(22);
		employee.getAllocationData().setMobile("0715688326");;
		
		employee.getHistories().add(new AllocationHistory("p1","WSO2"));
		employee.getHistories().add(new AllocationHistory("p2","Polixia"));
		
		session.save(employee);
		session.getTransaction().commit();
		
		
		System.out.println("Saved");
		
	}
	
	
	


}
