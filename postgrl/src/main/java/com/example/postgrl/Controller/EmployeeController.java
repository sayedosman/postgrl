package com.example.postgrl.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.postgrl.Entity.Employee;
import com.example.postgrl.Service.EmployeeService;
@RestController
@RequestMapping("/Employee")
public class EmployeeController {
   @Autowired
	private EmployeeService employeeService;
   
   @GetMapping("/all")
   public List<Employee>getAllEmployee(){
	   return employeeService.getAllEmployee();
   }
}
