package com.example.demo;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.example.demo.entities.Jeux;
import com.example.demo.repo.JeuxRepository;
import com.example.demo.service.JeuxService;

@SpringBootTest
class JeuxApplicationTests {

	@Autowired
	private JeuxRepository jeuxRepository;
	@Autowired

	private JeuxService jeuxService;
	@Test
	public void testCreateJeux() {
	Jeux prod = new Jeux("Fortnite ",999.99,new Date());
	jeuxRepository.save(prod);
	}
	
	@Test
	public void testFindProduit()
	{
	Jeux j = jeuxRepository.findById(1L).get();
	System.out.println(j);
	}
	
	
	@Test
	public void testUpdateProduit()
	{
		Jeux j = jeuxRepository.findById(1L).get();
	j.setPrix(1000.0);
	jeuxRepository.save(j);
	}
	
	
	@Test
	public void testDeleteProduit()
	{
		jeuxRepository.deleteById(1L);;
	}

	
	@Test
	public void testListerTousProduits()
	{
	List<Jeux> prods = jeuxRepository.findAll();
	for (Jeux j : prods)
	{
	System.out.println(j);
	}
	}
	
	@Test
	public void testFindByNomJeuxContains()
	{
	Page<Jeux> jeux = jeuxService.getAllJeuxParPage(0,2);
	System.out.println(jeux.getSize());
	System.out.println(jeux.getTotalElements());
	System.out.println(jeux.getTotalPages());
	jeux.getContent().forEach(j -> {System.out.println(j.toString());
	 });
	/*ou bien
	for (Produit p : prods)
	{
	System.out.println(p);
	} */
	}

}
