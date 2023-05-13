
package com.example.bestcrmintheuniverse.entities;
import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name= "id", nullable = false)
    private Long id;

    private String name;
    private String address;
    private String phone;
    private String email;
    private String business;
    private Date lastContact;

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

    public void setBusiness(String business) {
        this.business = business;
    }

    public void setLastContact(Date lastContact) {
        this.lastContact = lastContact;
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

    public String getBusiness() {
        return business;
    }

    public Date getLastContact() {
        return lastContact;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
