package com.example.pfebackend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Receptionniste extends Utilisateur implements Serializable {

    @OneToMany(mappedBy = "receptionniste")
    private List<DetailRdv>  detailRdv;

    @OneToMany(mappedBy = "receptionniste")
    private List<FichePrestation> fichePrestations;

   }
