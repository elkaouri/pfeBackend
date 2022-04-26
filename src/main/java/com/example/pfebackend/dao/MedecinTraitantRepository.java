package com.example.pfebackend.dao;

import com.example.pfebackend.entities.MedecinTraitant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MedecinTraitantRepository extends JpaRepository<MedecinTraitant,Long> {
}
