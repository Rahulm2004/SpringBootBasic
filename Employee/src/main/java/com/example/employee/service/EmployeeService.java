package com.example.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.employee.entity.EmployeeDetails;
import com.example.employee.repository.EmployeeRepository;

@Service

public class EmployeeService {
    
	@Autowired
	EmployeeRepository er; 
	
	public List<EmployeeDetails> getDetails()
	{
		return er.findAll();
	}
	
	public EmployeeDetails saveEmployee(EmployeeDetails e)
	{
		return er.save(e);
	}
	
	public EmployeeDetails updateEmployee(EmployeeDetails d,int empid)
	{
		Optional<EmployeeDetails> optional=er.findById(empid);
		EmployeeDetails obj=null;
		if(optional.isPresent())
		{
			obj=optional.get();
			er.save(d);
		}
		return obj;
	}
	
	public void deleteEmployee(int empid)
	{
		er.deleteById(empid);
	}
	
	public List<EmployeeDetails> sortEmployee(String field)
	{
		return er.findAll(Sort.by(field));
	}
	
}
