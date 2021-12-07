package com.example.SpringCrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringCrud.entity.Employee;
import com.example.SpringCrud.repository.EmployeeRepository;

@Service
public class EmployeeService {

	
	
	@Autowired
    private EmployeeRepository  repo;
	
     public Iterable<Employee> listAll() {
        return this.repo.findAll();
    }
     
   //saving a specific record by using the method save() of CrudRepository  
 	public void saveOrUpdate(Employee employees)   
 	{  
 		try {
 		  repo.save(employees);  
 		}
 		catch(Exception e) {
 			System.out.println("Error Something Went Wrong");
 		}
 	} 
 	
 	public Employee getEmployeeById(long id)   
	{  
		return repo.findById(id).get();  
	}
 	
 	public Employee get(long id)   
	{  
		return repo.findById(id).get();  
	}
		 
 	public void delete(long id)   
	{  
		repo.deleteById(id);  
	} 
 	

}