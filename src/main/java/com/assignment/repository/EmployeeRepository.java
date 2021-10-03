package com.assignment.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.assignment.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	@Query("SELECT emp.gender, max(emp.age), min(emp.age) FROM Employee emp WHERE emp.department = :deptName GROUP BY emp.gender")
	public List<String> fetchDeptDetails(@Param("deptName") String deptName);
	
	@Query("SELECT emp.department ,count(emp.gender )  FROM Employee emp WHERE emp.gender = :gender GROUP BY emp.gender")
	public List<String> fetchGenderDetails(@Param("gender") String gender);

}
