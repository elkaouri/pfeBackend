package com.example.pfebackend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MedecinTraitant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nom_medecin")
    private String nomMedecin;
    @Column(name = "prenom_medecin")
    private String prenomMedecin;
    private String telephone;
    private String adresse;
    @Column(name = "date_creation")
    private Date dateCreation;

    @OneToMany(mappedBy = "medecinTraitant")
    private List<FichePrestation>  fichePrestations;


}
