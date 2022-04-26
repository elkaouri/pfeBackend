package com.example.pfebackend.dao;

import com.example.pfebackend.entities.DetailRdv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DetailRdvRepository extends JpaRepository<DetailRdv,Long> {
}
