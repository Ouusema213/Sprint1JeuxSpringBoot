package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Jeux;
import com.example.demo.repo.JeuxRepository;
@Service
public class JeuxServiceImpl implements JeuxService {
	
	@Autowired
	private JeuxRepository jeuxRepository ;

	@Override
	public Jeux saveJeux(Jeux j) {
		// TODO Auto-generated method stub
		return jeuxRepository.save(j);
	}

	@Override
	public Jeux updateJeux(Jeux j) {
		// TODO Auto-generated method stub
		return jeuxRepository.save(j);
	}

	@Override
	public void deleteJeux(Jeux j) {
		// TODO Auto-generated method stub
		jeuxRepository.delete(j);
	}

	@Override
	public void deleteJeuxById(Long id) {
		// TODO Auto-generated method stub
		jeuxRepository.deleteById(id);
	}

	@Override
	public Jeux getJeux(Long id) {
		// TODO Auto-generated method stub
		return jeuxRepository.findById(id).get();
	}

	@Override
	public List<Jeux> getAllJeux() {
		// TODO Auto-generated method stub
		return jeuxRepository.findAll();
	}

	@Override
	public Page<Jeux> getAllJeuxParPage(int page, int size) {
		// TODO Auto-generated method stub
		return jeuxRepository.findAll(PageRequest.of(page, size));
	}

}
