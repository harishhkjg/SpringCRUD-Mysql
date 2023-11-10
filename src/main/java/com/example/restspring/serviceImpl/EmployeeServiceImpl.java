package com.example.restspring.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.restspring.exception.EmployeeException;
import com.example.restspring.impl.EmployeeRepo;
import com.example.restspring.model.EmployeeEntity;
import com.example.restspring.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepo employeerepository;
	
	
	public EmployeeServiceImpl(EmployeeRepo employeerepository) {
		super();
		this.employeerepository = employeerepository;
	}


	public EmployeeEntity savemployee(EmployeeEntity employee) {
		return employeerepository.save(employee);
	}


	
	public List<EmployeeEntity> getdata() {
		return employeerepository.findAll();
	}


	public EmployeeEntity updatedata(EmployeeEntity employee, long id) {
		EmployeeEntity updatevalue= employeerepository.findById(id).orElseThrow(() -> new EmployeeException("Employee","id",id));
		updatevalue.setEmail(employee.getEmail());
		updatevalue.setFirstName(employee.getFirstName());
		updatevalue.setLastName(employee.getLastName());
		employeerepository.save(updatevalue);
		return updatevalue;
	}


	
	public String deletedata(long id) {
		employeerepository.findById(id).orElseThrow(() -> new EmployeeException("Employee","id",id));
		employeerepository.deleteById(id);
		return "Data Deleted Successfully";
	}





	
//	public EmployeeEntity updatedata(EmployeeEntity employee,long id) {
//		EmployeeEntity updatevalue = employeerepository.findById(id).orElseThrow(() -> new EmployeeException("Employee","id",id));
//		updatevalue.setFirstName(employee.getFirstName());
//		updatevalue.setLastName(employee.getLastName());
//		updatevalue.setEmail(employee.getEmail());
//		 employeerepository.save(updatevalue);
//		 return updatevalue;
//	}
	
	

}
