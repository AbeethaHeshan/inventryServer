package com.newinvent.inventryserver.entity;


import com.newinvent.inventryserver.entity.embed.Address;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Supplier {

    @Id
    private String supplierId;
    private String supplierName;
    @Embedded
    private Address address;
    private String telephone;

    @OneToMany(mappedBy = "supplier")
    private List<SupplyStocks> supplierStocks;

}
