package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Categorie;


public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}
