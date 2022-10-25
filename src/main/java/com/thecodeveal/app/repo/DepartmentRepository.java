package com.thecodeveal.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thecodeveal.app.model.Department;


@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
	
	public Department findBydeptCode(String depCode);

}
