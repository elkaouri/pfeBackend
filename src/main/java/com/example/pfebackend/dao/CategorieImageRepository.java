package com.example.pfebackend.dao;

import com.example.pfebackend.entities.CategorieImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="categorieImage",path="categorie-image")
public interface CategorieImageRepository extends JpaRepository<CategorieImage,Long> {

}
