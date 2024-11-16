package com.devsuperior.gamestream.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.gamestream.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
