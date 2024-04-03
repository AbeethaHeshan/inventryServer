package com.newinvent.inventryserver.entity;

import com.newinvent.inventryserver.entity.embed.Address;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Employee {
     @Id
     private String employeeId;
     private String name;
     @Embedded
     private Address address;
     private String telephone;
     private String employment;

     @ManyToOne
     @JoinColumn(name = "department_Id")
     private Department department;

     @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
     private List<Stock> stocks;

     @OneToMany(mappedBy = "employee")
     private List<EmployeeSales> employeeSales;

     @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
     private List<Role> roles;
}
