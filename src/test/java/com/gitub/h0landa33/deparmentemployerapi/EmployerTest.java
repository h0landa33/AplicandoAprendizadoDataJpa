package com.gitub.h0landa33.deparmentemployerapi;

import java.math.BigDecimal;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.gitub.h0landa33.deparmentemployerapi.model.Department;
import com.gitub.h0landa33.deparmentemployerapi.model.Employer;
import com.gitub.h0landa33.deparmentemployerapi.model.Employer;
import com.gitub.h0landa33.deparmentemployerapi.model.Employer;
import com.gitub.h0landa33.deparmentemployerapi.repository.DepartmentRepository;
import com.gitub.h0landa33.deparmentemployerapi.repository.EmployerRepository;

@SpringBootTest
public class EmployerTest {
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	@Autowired
	EmployerRepository employerRepository;
	
	
	@Test
	void newDepartment() {
		
		Department department = departmentRepository.findById(UUID.fromString("516bad9a-1f00-42af-88cb-bec0f11d04c1")).orElse(null);
		
		Employer emp1 = new Employer();
		
		
		emp1.setName("Samuel Holanda Mendes");
		emp1.setSalary(BigDecimal.valueOf(3000));
		emp1.setDepartment(department); 
		
		employerRepository.save(emp1);

		
	}

}
