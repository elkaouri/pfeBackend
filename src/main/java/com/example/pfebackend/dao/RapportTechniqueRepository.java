package com.example.pfebackend.dao;

import com.example.pfebackend.entities.Rapport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RapportTechniqueRepository extends JpaRepository<Rapport,Long> {
}
