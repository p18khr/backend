package com.credMarg.backend.service;

import com.credMarg.backend.models.Employee;

import java.util.List;

public interface EmployeeService {
	List<Employee> getAllEmployees();

	Employee saveEmployee(Employee employee);
}
