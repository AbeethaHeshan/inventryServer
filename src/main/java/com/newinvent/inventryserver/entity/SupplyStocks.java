package com.newinvent.inventryserver.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class SupplyStocks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date supplyDate;
    private int supplyQuantity;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

    @ManyToOne
    @JoinColumn(name = "stock_id")
    private Stock stock;

}
