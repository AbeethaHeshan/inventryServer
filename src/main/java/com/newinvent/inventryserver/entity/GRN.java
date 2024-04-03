package com.newinvent.inventryserver.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class GRN {

    @Id
    private String grnId;
}
