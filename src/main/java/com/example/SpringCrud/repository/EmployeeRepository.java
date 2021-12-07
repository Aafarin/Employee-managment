package com.example.SpringCrud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringCrud.entity.Employee;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {

	
	
	
	

}
