package com.Services;

import org.springframework.beans.factory.annotation.Autowired;

import com.Entity.Department;
import com.Repository.DepartmentRepository;

public class Impdepartmentservices implements  Departmentservices{
	@Autowired
	private DepartmentRepository repos;

	@Override
	public Department savedepartmetn(Department department) {
		// TODO Auto-generated method stub
		return repos.save(department);
	}

}
