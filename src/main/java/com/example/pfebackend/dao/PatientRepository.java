package com.example.pfebackend.dao;

import com.example.pfebackend.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PatientRepository extends JpaRepository<Patient,Long> {
}
