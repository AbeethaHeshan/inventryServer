package com.newinvent.inventryserver.entity;

import jakarta.persistence.*;

@Entity
public class EmployeeSales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "sales_id")
    private Sales sales;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
