package com.example.pfebackend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class Utilisateur   {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private String sexe;
    @Column(name = "date_de_naissance")
    private Date dateDeNaissance;
    @Column(name = "date_de_creation")
    private Date dateDeCreation;
    @Column(name = "mot_de_passe")
    private String motDePasse;


    @ManyToMany
    private List<Role> roles;

}
