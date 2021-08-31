package com.app.warehouse.model;

import org.hibernate.procedure.spi.ParameterRegistrationImplementor;

import javax.persistence.*;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClient;
    @Column
    private String name;
    @Column
    private int phoneNumber;
    @Column
    private int nit;
    @Column
    private String address;
    @Column
    private String email;

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
