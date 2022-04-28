package com.example.pfebackend.entities;


import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Entity
@Data @NoArgsConstructor
public class Administrateur extends Utilisateur implements Serializable  {

}
