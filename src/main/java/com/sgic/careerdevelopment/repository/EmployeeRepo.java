package com.sgic.careerdevelopment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sgic.careerdevelopment.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
