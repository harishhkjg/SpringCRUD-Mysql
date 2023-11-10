package com.example.restspring.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.restspring.model.EmployeeEntity;

@Service
public interface EmployeeService {
	EmployeeEntity savemployee(EmployeeEntity employee);

	List<EmployeeEntity> getdata();
	
	public EmployeeEntity updatedata(EmployeeEntity employee,long id);
	
	public String deletedata(long id);

}
