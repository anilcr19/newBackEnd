package com.thecodeveal.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thecodeveal.app.model.Department;
import com.thecodeveal.app.repo.DepartmentRepository;

@Service
public class DepartmentService {
		
		@Autowired
		DepartmentRepository departmentRepository;
		
		public Department findDepartment(String depCode)
		{
			return departmentRepository.findBydeptCode(depCode);
		}
		
		
	
}
