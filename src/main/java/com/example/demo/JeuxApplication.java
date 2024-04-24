package com.example.demo;



import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Jeux;
import com.example.demo.service.JeuxService;

@SpringBootApplication
public class JeuxApplication implements CommandLineRunner {

	@Autowired
	JeuxService jeuxService;
	
	public static void main(String[] args) {
		SpringApplication.run(JeuxApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		jeuxService.saveJeux(new Jeux("Valorant", 2600.0, new Date()));
		jeuxService.saveJeux(new Jeux("League of Legends", 2800.0, new Date()));
		jeuxService.saveJeux(new Jeux("Fortnite", 900.0, new Date()));
		}
	}


