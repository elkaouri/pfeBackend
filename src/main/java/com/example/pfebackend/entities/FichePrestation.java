package com.example.pfebackend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FichePrestation  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "medecin_traitant_id")
    private MedecinTraitant medecinTraitant;

    @ManyToOne
    @JoinColumn(name = "receptionniste_id")
    private Receptionniste receptionniste;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
    @OneToOne(mappedBy = "fichePrestation")
    private RapportTechnique rapportTechnique;

    @OneToOne(mappedBy = "fichePrestation")
    private Facture facture;
    @OneToMany(mappedBy = "fichePrestation")
    private List<CategorieImage> categorieImages;

}
