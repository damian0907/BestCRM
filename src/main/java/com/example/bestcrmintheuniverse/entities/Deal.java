package com.example.bestcrmintheuniverse.entities;
import jakarta.persistence.*;

@Entity
public class Deal {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name= "id", nullable = false)

    private Long id;
    private Double budget;

    @OneToOne
    @JoinColumn(name = "contact_point_id")
    private Person contactPoint;

    @ManyToOne
    @JoinColumn(name = "client_id")
   private Client client;








    private String phone;
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}

