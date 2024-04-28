package com.example.demo.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Jeux;
import com.example.demo.service.JeuxService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class JeuxRESTController {
	@Autowired
	JeuxService jeuxService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Jeux> getAllProduits() {
	return jeuxService.getAllJeux();
	}
	
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Jeux getJeuxById(@PathVariable("id") Long id) {
	return jeuxService.getJeux(id);
	 }
	
	@RequestMapping(method = RequestMethod.POST)
	public Jeux createProduit(@RequestBody Jeux jeux) {
	return jeuxService.saveJeux(jeux);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Jeux updateProduit(@RequestBody Jeux jeux) {
	return jeuxService.updateJeux(jeux);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteProduit(@PathVariable("id") Long id)
	{
		jeuxService.deleteJeuxById(id);
	}
	@RequestMapping(value="/jeuxcat/{id}",method = RequestMethod.GET)
	public List<Jeux> getJeuxsById(@PathVariable("id") Long id) {
	return jeuxService.findByCategorieId(id);
	}


}
