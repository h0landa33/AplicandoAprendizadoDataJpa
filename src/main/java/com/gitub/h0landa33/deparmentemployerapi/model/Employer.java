package com.gitub.h0landa33.deparmentemployerapi.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "employer")
@AllArgsConstructor
@NoArgsConstructor
public class Employer {


	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "id" , nullable = false)
	private UUID id;
	
	
	@Column(name = "name", nullable = false, length = 100)
	private String name;
	
	
	@Column(name = "salary", nullable = false,precision = 18, scale = 2)
	private BigDecimal salary;
	
	
	@ManyToOne
	@JoinColumn(name = "id_department")
	private Department department;

	
	/*
	 create table employer (
	id UUID not null primary key,
	name varchar(100) not null,
	salary numeric(18,2) not null,
	id_department UUID not null references department(id)
	
)

	 */
	
}
