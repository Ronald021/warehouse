package com.app.warehouse.model;

import javax.persistence.*;

@Entity
@Table(name = "provider")
public class Provider {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProvider;

    @Column
    private String name;
    @Column
    private String nit;
    @Column
    private int phoneNumber;

    public int getIdProvider() {
        return idProvider;
    }

    public void setIdProvider(int idProvider) {
        this.idProvider = idProvider;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
