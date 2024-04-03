package com.newinvent.inventryserver.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Sales {
    @Id
    private String sales_id;

    @OneToMany(mappedBy = "sales")
    private List<EmployeeSales> employeeSales;

    @OneToMany(mappedBy = "sales", cascade = CascadeType.ALL)
    private List<ShopOwner> shopOwners;
}
