package com.example.pfebackend.dao;

import com.example.pfebackend.entities.Technicien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TechnicienRepository extends JpaRepository<Technicien,Long> {
}
