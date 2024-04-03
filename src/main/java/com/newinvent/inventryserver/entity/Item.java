package com.newinvent.inventryserver.entity;

import com.newinvent.inventryserver.entity.OrderDetails;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Item {

    @Id
    private String itemId;

    @OneToMany(mappedBy = "item")
    private List<OrderDetails> orderDetails;
}
