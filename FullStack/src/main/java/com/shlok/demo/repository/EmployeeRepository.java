package com.shlok.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shlok.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
