package com.example.pfebackend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class CategorieImage  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String libelle;
    private String Type;
    private float tarif;
    private String path;
    @ManyToOne
    @JoinColumn(name = "fiche_presentation_id")
    private FichePrestation fichePrestation;
}
