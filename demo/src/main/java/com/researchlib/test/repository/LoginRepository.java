package com.researchlib.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.researchlib.test.model.Login;

public interface LoginRepository extends JpaRepository<Login, Integer>{

	@Query("SELECT l from Login l WHERE  l.id = ?1")
    List<Login> findByLoginId(Integer id);
	
	@Query("SELECT l from Login l WHERE l.username = ?1")
	List<Login> findByUsername(String username);
}
