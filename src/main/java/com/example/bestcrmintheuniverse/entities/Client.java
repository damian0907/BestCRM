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
    private String business;
    private Date lastContact;

    @OneToMany(mappedBy = "client")
    private Set <Deal> deals;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
