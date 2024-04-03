package com.newinvent.inventryserver.repository;

import com.newinvent.inventryserver.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<String, Role> {
}
