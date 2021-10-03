package com.assignment.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.repository.EmployeeRepository;
import com.assignment.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired(required=true)
	private EmployeeRepository employeeRepository;

	@Override
	public List<String> fetchDeptDetails(String deptName) {
		return employeeRepository.fetchDeptDetails(deptName);
	}

	@Override
	public List<String> fetchGenderDetails(String gender) {
		return employeeRepository.fetchGenderDetails(gender);
	}
	
	

}
