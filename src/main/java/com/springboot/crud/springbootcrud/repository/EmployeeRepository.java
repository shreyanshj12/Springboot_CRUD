package com.springboot.crud.springbootcrud.repository;

import com.springboot.crud.springbootcrud.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
