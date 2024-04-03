package com.newinvent.inventryserver.repository;

import com.newinvent.inventryserver.entity.ShopOwner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopOwnerRepo extends JpaRepository<String, ShopOwner> {
}
