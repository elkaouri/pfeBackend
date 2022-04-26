package com.example.pfebackend.dao;

import com.example.pfebackend.entities.FichePrestation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FichePrestationRepository extends JpaRepository<FichePrestation,Long> {
}
