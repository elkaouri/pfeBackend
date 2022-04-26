package com.example.pfebackend.dao;

import com.example.pfebackend.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MedecinRepository extends JpaRepository<Medecin,Long> {
}
