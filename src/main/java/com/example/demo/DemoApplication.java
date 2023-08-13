package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.demo.model.AuthUser;
import com.example.demo.repository.UserRepository;

@SpringBootApplication
@EnableMongoRepositories
public class DemoApplication  implements CommandLineRunner{

	@Autowired(required = true)
	UserRepository userrepo;

	@Autowired(required =  true)
	BCryptPasswordEncoder passwordEncoder;

	public static void main(String[] args)  {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args)throws Exception{
		 AuthUser user = new AuthUser("superAdmin@rex.com","suadmin" , this.passwordEncoder.encode("123456"));
		 userrepo.save(user);
	}
}
