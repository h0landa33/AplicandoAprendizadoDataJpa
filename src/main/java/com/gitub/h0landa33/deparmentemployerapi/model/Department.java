package com.gitub.h0landa33.deparmentemployerapi.model;

import java.util.UUID;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "derpartment")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	
	
	@Column(name = "name" , length = 20, nullable = false)
	private NameDepartmentEnum name;
	
	
	@Column(name = "description" , length = 300, nullable = false)
	private String description;

	
	
}
