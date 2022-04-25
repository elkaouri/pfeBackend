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
public class Patient  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cin;

    @OneToMany(mappedBy = "patient")
    private List<DetailRdv> detailRdvs;

    @OneToMany(mappedBy = "patient")
    private List<FichePrestation> fichePrestations;


}
