package com.devsuperior.gamestream.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.gamestream.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{}
