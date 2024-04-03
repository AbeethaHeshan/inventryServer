package com.newinvent.inventryserver.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Stock {

    @Id
    private String stockId;

    private  String description;

    private double stockPrice;

    private int bundles;

    private int bundlePerPapers;

    private int stockItemLocation;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @OneToMany(mappedBy = "stock")
    private List<SupplyStocks> supplierStocks;

}
