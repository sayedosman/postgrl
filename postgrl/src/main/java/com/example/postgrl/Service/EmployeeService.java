package com.example.postgrl.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.postgrl.Entity.Employee;
import com.example.postgrl.Repository.EmployeeRepository;

public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee>getAllEmployee(){
		return employeeRepository.findAll();
	}
	
}
