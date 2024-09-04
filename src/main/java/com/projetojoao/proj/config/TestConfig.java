package com.projetojoao.proj.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetojoao.proj.entities.User;
import com.projetojoao.proj.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "joao","joao@gmail.com", "9999999", "123456");
		User u2 = new User(null, "maria", "maria@gmail.com", "888899999", "123456");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		
	}
	
	

}
