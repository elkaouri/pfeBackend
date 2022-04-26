package com.example.pfebackend.dao;

import com.example.pfebackend.entities.Receptionniste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ReceptionnisteRepository extends JpaRepository<Receptionniste,Long> {
}
