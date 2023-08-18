package com.Repository;

import org.springframework.data.repository.CrudRepository;

import com.Entity.Department;

public interface DepartmentRepository extends CrudRepository<Department,Integer> {

}
