package com.example.demo.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.demo.entities.Jeux;

public interface JeuxService {
	Jeux saveJeux(Jeux j);
	Jeux updateJeux(Jeux j);
	void deleteJeux(Jeux j);
	void deleteJeuxById(Long id);
	Jeux getJeux(Long id);
	List<Jeux> getAllJeux();
	
	Page<Jeux> getAllJeuxParPage(int page, int size);
	
}
