package com.gitub.h0landa33.deparmentemployerapi;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.gitub.h0landa33.deparmentemployerapi.model.Department;
import com.gitub.h0landa33.deparmentemployerapi.model.Employer;
import com.gitub.h0landa33.deparmentemployerapi.model.NameDepartmentEnum;
import com.gitub.h0landa33.deparmentemployerapi.repository.DepartmentRepository;
import com.gitub.h0landa33.deparmentemployerapi.repository.EmployerRepository;

@SpringBootTest
public class DepartmentTest {
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	
	@Autowired
	EmployerRepository employerRepository;
	
	
	@Test
	@Transactional
	void cadastrarDepartment() {
		
		Department dep1 = new Department();
		
		
		dep1.setName(NameDepartmentEnum.ADMINISTRATIVE);
		dep1.setDescription("Department responsavel por administrar a empresa");		
			Department salvo = departmentRepository.save(dep1);
			System.out.println("Departamento salvo \n" + salvo);
	
	}
	
	@Test
	@Transactional
	void buscarFuncionariosDepartment() {
		
		Department dep1 = new Department();
	
		dep1 = departmentRepository.findById(UUID.fromString("516bad9a-1f00-42af-88cb-bec0f11d04c1")).orElse(null);
		
		dep1.setEmployerList(employerRepository.findByDepartment(dep1));
		
		System.out.println("Departamento encontrado : " + dep1);
		

	}
	
	//CASO SEJA NECESSARIO CRIAR UM DEPARTAMENTO E SALVAR AO MESMO TEMPO UM EMPLOYER , NÃO É UMA BOA PRATICA USAR CASCATE.ALL
	@Test
	void creteDepartmentSaveEmploter() {
		
		Department dep1 = new Department();
		
		dep1.setName(NameDepartmentEnum.FINANCIAL);
		dep1.setDescription("Departamento responsavel por"
				+ " demandas finaceiras.");
		
		Employer emp1 = new Employer();
		
		emp1.setName("Daniels Familly");		
		emp1.setSalary(BigDecimal.valueOf(8000));
		emp1.setDepartment(dep1);		
		
		departmentRepository.save(dep1);
		employerRepository.save(emp1);
		
}
	

}
