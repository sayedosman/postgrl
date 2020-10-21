package com.example.postgrl.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.postgrl.Entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
