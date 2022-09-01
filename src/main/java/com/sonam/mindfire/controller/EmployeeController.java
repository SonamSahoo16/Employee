package com.sonam.mindfire.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sonam.mindfire.model.Employee;
import com.sonam.mindfire.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	@PostMapping("/create")
	public Employee create(@RequestBody Employee employee)
	{
		return empService.createUser(employee);
	}
	
	@GetMapping("/all")
	public List<Employee> fetchAll()
	{  
		return empService.fetchAll();
	}
	
	@PutMapping("/update")
	public Employee update(@RequestBody Employee employee)
	{
		return empService.updateUser(employee);
	}
	
	@DeleteMapping("/delete")
	public boolean delete(@RequestParam(name = "id") int id)
	{
		return empService.deleteUser(id);
	}

}
