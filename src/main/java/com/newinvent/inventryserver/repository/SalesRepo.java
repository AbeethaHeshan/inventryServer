package com.newinvent.inventryserver.repository;

import com.newinvent.inventryserver.entity.Sales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepo extends JpaRepository<String,Sales> {
}
