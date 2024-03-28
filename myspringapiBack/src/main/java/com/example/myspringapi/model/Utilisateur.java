package com.example.myspringapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Entity
@Getter
@Setter
@Table(name = "utilisateur")
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String email;
    private String codePostal;
    private String adresse;
    private String telephone;
    private Float salaireFixe;
    private Float salaireVariable;
    private String login;
    private String password;
    private String role;

    public Utilisateur(String nom, String prenom, Date dateNaissance, String email, String codePostal,
                       String adresse, String telephone, Float salaireFixe,
                       Float salaireVariable, String login, String password, String role) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.codePostal = codePostal;
        this.adresse = adresse;
        this.telephone = telephone;
        this.salaireFixe = salaireFixe;
        this.salaireVariable = salaireVariable;
        this.login = login;
        this.password = password;
        this.role = role;
    }

    public Utilisateur(Long id, String nom, String prenom, Date dateNaissance, String email, String codePostal,
                       String adresse, String telephone, Float salaireFixe,
                       Float salaireVariable, String login, String password, String role) {

        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.codePostal = codePostal;
        this.adresse = adresse;
        this.telephone = telephone;
        this.salaireFixe = salaireFixe;
        this.salaireVariable = salaireVariable;
        this.login = login;
        this.password = password;
        this.role = role;
        this.id = id;
    }

    public Utilisateur() {

    }
}
