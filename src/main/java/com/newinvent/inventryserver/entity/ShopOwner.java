package com.newinvent.inventryserver.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class ShopOwner {
    @Id
    private String shopOwnerId;

    @ManyToOne
    @JoinColumn(name = "sales_id")
    private Sales sales;

    @OneToMany(mappedBy = "shopOwner", cascade = CascadeType.ALL)
    private List<Payment> payments;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Orders orders;
}
