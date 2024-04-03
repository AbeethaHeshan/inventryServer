package com.newinvent.inventryserver.repository;

import com.newinvent.inventryserver.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<String, Payment> {
}
