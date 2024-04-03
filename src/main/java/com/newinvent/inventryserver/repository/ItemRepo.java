package com.newinvent.inventryserver.repository;

import com.newinvent.inventryserver.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<String, Item> {
}
