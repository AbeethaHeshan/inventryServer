package com.newinvent.inventryserver.repository;

import com.newinvent.inventryserver.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<String, Orders> {
}
