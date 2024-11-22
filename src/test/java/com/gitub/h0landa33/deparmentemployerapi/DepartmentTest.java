package com.gitub.h0landa33.deparmentemployerapi;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.gitub.h0landa33.deparmentemployerapi.model.Department;
import com.gitub.h0landa33.deparmentemployerapi.model.NameDepartmentEnum;
import com.gitub.h0landa33.deparmentemployerapi.repository.DepartmentRepository;

@SpringBootTest
public class DepartmentTest {
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	
	
	
	@Test
	void cadastrarDepartment() {
		
		Department dep1 = new Department();
		
		
		dep1.setName(NameDepartmentEnum.ADMINISTRATIVE);
		dep1.setDescription("Department responsavel por administrar a empresa");		
			Department salvo = departmentRepository.save(dep1);
			System.out.println("Departamento salvo \n" + salvo);
	
	}

}
