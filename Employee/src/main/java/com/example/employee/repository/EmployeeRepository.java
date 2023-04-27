package com.example.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employee.entity.EmployeeDetails;

public interface EmployeeRepository extends JpaRepository<EmployeeDetails,Integer>{

}
