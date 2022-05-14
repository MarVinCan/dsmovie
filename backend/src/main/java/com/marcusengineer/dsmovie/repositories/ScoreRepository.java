package com.marcusengineer.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcusengineer.dsmovie.entities.Score;
import com.marcusengineer.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

	
	
}
