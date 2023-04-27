package com.example.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.entity.EmployeeDetails;
import com.example.employee.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService es;
	
	@GetMapping("/employee")
	public List<EmployeeDetails> getDetails()
	{
		return es.getDetails();
	}
	
	@PostMapping("/saveemp")
	public EmployeeDetails saveEmployee(@RequestBody EmployeeDetails e)
	{
		return es.saveEmployee(e);
	}
	
	@PutMapping("/updateemp/{empid}")
	public EmployeeDetails updateEmployee(@RequestBody EmployeeDetails d,@PathVariable int empid)
	{
		return es.updateEmployee(d,empid);
	}
	
	@DeleteMapping("/deleteemp/")
	public void deleteEmployee(@RequestParam int empid)
	{
		es.deleteEmployee(empid);
	}
	
	@GetMapping("/sort/")
	public List<EmployeeDetails> sortEmployee(@RequestParam String field)
	{
		return es.sortEmployee(field);
	}
	
}
