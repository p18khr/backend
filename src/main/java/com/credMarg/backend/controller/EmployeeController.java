package com.credMarg.backend.controller;

import com.credMarg.backend.models.Employee;
import com.credMarg.backend.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@CrossOrigin("http://localhost:3000/")
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@GetMapping
	public List<Employee> getAllEmployees() {
		return service.getAllEmployees();
	}

	@PostMapping
	public Employee createEmployee(@RequestBody Employee employee) {
		return service.saveEmployee(employee);
	}
}
