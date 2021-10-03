package com.assignment.controlller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired(required=true)
	EmployeeService employeeService;
	
	@GetMapping("/dept/{deptName}")
	public List<String> fetchDeptDetails(@PathVariable(value = "deptName") String deptName) {
		 return  employeeService.fetchDeptDetails(deptName);
		
	}
	
	@GetMapping("/gender/{gender}")
	public List<String> fetchGenderDetails(@PathVariable(value = "gender") String gender) {
		 return  employeeService.fetchGenderDetails(gender);
		
	}
}
