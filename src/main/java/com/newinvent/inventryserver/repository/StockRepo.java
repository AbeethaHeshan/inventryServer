package com.newinvent.inventryserver.repository;

import com.newinvent.inventryserver.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepo extends JpaRepository<String, Stock> {
}
