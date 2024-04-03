package com.newinvent.inventryserver.repository;

import com.newinvent.inventryserver.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepo extends JpaRepository<String, Supplier> {
}
