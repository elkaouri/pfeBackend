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
public class Technicien extends Utilisateur implements Serializable {

    @OneToMany(mappedBy = "technicien")
    private List<RapportTechnique> rapportTechniques;
}
