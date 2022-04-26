package com.example.pfebackend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RapportTechnique  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    @Column(name = "date_de_creation")
    private LocalDateTime dateCreation;

    @ManyToOne
    @JoinColumn(name = "technicien_id")
    private Technicien technicien;

    @OneToOne
    @JoinColumn(name = "fiche_prestation_id")
    private FichePrestation fichePrestation;

    @OneToOne(mappedBy = "rapportTechnique")
    private Rapport rapport;

}
