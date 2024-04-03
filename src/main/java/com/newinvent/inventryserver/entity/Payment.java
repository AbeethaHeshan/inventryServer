package com.newinvent.inventryserver.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Payment {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "shopOwner_Id")
    private ShopOwner shopOwner;
}
