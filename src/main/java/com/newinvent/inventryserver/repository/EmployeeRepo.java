package com.newinvent.inventryserver.repository;

import com.newinvent.inventryserver.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<String, Employee> {
}
