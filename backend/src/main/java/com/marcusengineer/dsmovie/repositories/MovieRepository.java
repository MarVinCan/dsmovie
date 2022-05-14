package com.marcusengineer.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcusengineer.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

	
	
}
