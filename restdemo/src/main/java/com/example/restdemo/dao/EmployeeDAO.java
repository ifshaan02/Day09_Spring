package com.example.restdemo.dao;

import java.util.*;

import com.example.restdemo.entity.Employee;

public interface EmployeeDAO {
	
	List<Employee> findAll();
	
	Employee findById(int theId);
	
	Employee save(Employee thEmployee);
	
	void deleteById(int theId);

}
