package com.newinvent.inventryserver.entity;

import com.newinvent.inventryserver.entity.Item;
import com.newinvent.inventryserver.entity.Orders;
import jakarta.persistence.*;

@Entity
public class OrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Orders order;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;
}
