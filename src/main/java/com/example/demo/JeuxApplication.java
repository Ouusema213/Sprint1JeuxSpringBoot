package com.example.demo;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.demo.entities.Jeux;
import com.example.demo.entities.Role;
import com.example.demo.entities.User;
import com.example.demo.service.JeuxService;
import com.example.demo.service.UserService;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JeuxApplication implements CommandLineRunner {

	@Autowired
	JeuxService jeuxService;
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	@Autowired
	PasswordEncoder passwordEncoder;
	@Autowired
	UserService userService ;
	
	public static void main(String[] args) {
		SpringApplication.run(JeuxApplication.class, args);
	}

	
	
	/*@PostConstruct
	void init_users() {
	//ajouter les rôles
	userService.addRole(new Role(null,"ADMIN"));
	userService.addRole(new Role(null,"AGENT"));
	userService.addRole(new Role(null,"USER"));
	//ajouter les users
	userService.saveUser(new User(null,"admin","123",true,null));
	userService.saveUser(new User(null,"nadhem","123",true,null));
	userService.saveUser(new User(null,"user1","123",true,null));
	//ajouter les rôles aux users
	userService.addRoleToUser("admin", "ADMIN");
	userService.addRoleToUser("nadhem", "USER");
	userService.addRoleToUser("nadhem", "AGENT");
	userService.addRoleToUser("user1", "USER");
	}*/
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//repositoryRestConfiguration.exposeIdsFor(Jeux.class);
		//System.out.println("Password Encoded BCRYPT :******************** ");
		//System.out.println(passwordEncoder.encode("123"));

		}
	}


