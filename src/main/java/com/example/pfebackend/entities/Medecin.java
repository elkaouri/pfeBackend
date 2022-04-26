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
@PrimaryKeyJoinColumn(name = "medecin_id")
public class Medecin extends Utilisateur implements Serializable {

    @OneToMany(mappedBy = "medecin")
    private List<Rapport> rapports;

}
