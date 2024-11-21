package com.gitub.h0landa33.deparmentemployerapi.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gitub.h0landa33.deparmentemployerapi.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, UUID>{

}
