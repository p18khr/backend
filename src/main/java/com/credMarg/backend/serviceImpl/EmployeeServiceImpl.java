package com.credMarg.backend.serviceImpl;

import com.credMarg.backend.dao.EmployeeRepository;
import com.credMarg.backend.models.Employee;
import com.credMarg.backend.service.EmployeeService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
    private EmployeeRepository repo;

	@Override
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		repo.save(employee);
		return employee;
	}
}
