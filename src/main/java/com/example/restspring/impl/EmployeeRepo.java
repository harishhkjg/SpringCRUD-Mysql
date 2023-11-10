package com.example.restspring.impl;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restspring.model.EmployeeEntity;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Long>{

}
