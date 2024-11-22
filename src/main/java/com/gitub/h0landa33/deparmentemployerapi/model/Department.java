package com.gitub.h0landa33.deparmentemployerapi.model;

import java.util.List;
import java.util.UUID;


import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "department")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	
	
	@Column(name = "name" , length = 20, nullable = false)
	@Enumerated(EnumType.STRING)
	private NameDepartmentEnum name;
	
	
	@Column(name = "description" , length = 300, nullable = false)
	private String description;

	
	// É UMA BOA PRATICA SEMPRE UTILIZAR O LAZY
	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@ToString.Exclude
	private List<Employer> employerList;
	
	
}
