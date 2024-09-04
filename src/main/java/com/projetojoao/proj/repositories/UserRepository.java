package com.projetojoao.proj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetojoao.proj.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
