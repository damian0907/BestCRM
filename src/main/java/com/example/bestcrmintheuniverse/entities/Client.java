package com.example.bestcrmintheuniverse.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;


@Entity

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name= "id", nullable = false)
    private Long id;
    private String name;
    private String address;
    private String phone;
    private String email;
    private Date lastContact;

    @OneToMany(mappedBy = "client")
    private Set <Deal> deals;


    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void setLastContact(Date lastContact) {
        this.lastContact = lastContact;
    }

    public void setDeals(Set<Deal> deals) {
        this.deals = deals;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public Date getLastContact() {
        return lastContact;
    }

    public Set<Deal> getDeals() {
        return deals;
    }

    @OneToMany(mappedBy = "client")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public void setCountry() {
    }

    public void setCountry(String poland) {
    }
}