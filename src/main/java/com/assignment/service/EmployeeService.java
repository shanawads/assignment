package com.assignment.service;

import java.util.List;

public interface EmployeeService {
	
	public List<String> fetchDeptDetails(String deptName);
	
	public List<String> fetchGenderDetails(String gender);

}
