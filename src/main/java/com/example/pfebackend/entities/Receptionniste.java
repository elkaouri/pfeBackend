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
public class Receptionniste extends Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "receptionniste")
    private List<DetailRdv>  detailRdv;

    @OneToMany(mappedBy = "receptionniste")
    private List<FichePrestation> fichePrestations;

   }
