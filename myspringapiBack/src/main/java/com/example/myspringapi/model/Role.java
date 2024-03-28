package com.example.myspringapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "role")
public class Role {

    @Id
    @SequenceGenerator(
            name = "role_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "role_sequence",
            strategy = GenerationType.SEQUENCE
    )

    private Long id;
    private String nom;
    private String description;

    public Role(){

    }

    public Role(Long id, String nom, String description) {
        this.id = id;
        this.nom = nom;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
