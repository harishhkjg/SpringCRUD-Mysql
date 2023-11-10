package com.example.restspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restspring.model.EmployeeEntity;
import com.example.restspring.service.EmployeeService;

@RestController

public class SpringController {
	
	@Autowired
	EmployeeService service;
	
	@PostMapping("/adddata")
	public EmployeeEntity savemployee(@RequestBody EmployeeEntity entity)
	{
		return service.savemployee(entity) ;
		
	}
	
	@GetMapping("/getdata")
	public List<EmployeeEntity> getdata()
	{
		return service.getdata();
	}
	
	@PutMapping("/updatedate/{id}")
	public ResponseEntity<EmployeeEntity> updatedata(@PathVariable long id,@RequestBody EmployeeEntity entity)
	{
		return new ResponseEntity<EmployeeEntity>(service.updatedata(entity, id),HttpStatus.OK);
	}
	@DeleteMapping("/data/{id}")
	public ResponseEntity<String> deletedata(@PathVariable long id)
	{
		service.deletedata(id);
		return new ResponseEntity<String>("data deleted successfully",HttpStatus.OK);
	}
			
	
	
}
