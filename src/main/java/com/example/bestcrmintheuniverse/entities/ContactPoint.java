package com.example.bestcrmintheuniverse.entities;
import jakarta.persistence.*;
@Entity
public class ContactPoint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Other attributes and relationships

    // Getters and setters

    public Long getId() {
        return id;
    }

    // Other getters and setters
}