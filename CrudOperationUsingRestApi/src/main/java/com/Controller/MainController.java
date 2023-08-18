package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.Entity.Department;
import com.Services.Departmentservices;
@RestController
public class MainController {
	@Autowired
	private Departmentservices deptservices;
	
    @PostMapping("/savedepart")
	public Department savedepartment(@RequestBody Department department) {
		return deptservices.savedepartmetn(department);
		
	}
	
	
}
