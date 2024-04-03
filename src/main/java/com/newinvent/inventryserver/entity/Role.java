package com.newinvent.inventryserver.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Role {
    @Id
    private String role_id;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
