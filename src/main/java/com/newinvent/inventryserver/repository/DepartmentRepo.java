package com.newinvent.inventryserver.repository;

import com.newinvent.inventryserver.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<String, Department> {
}
