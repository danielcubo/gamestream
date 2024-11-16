package com.devsuperior.gamestream.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.gamestream.dto.GameMinDTO;
import com.devsuperior.gamestream.entities.Game;
import com.devsuperior.gamestream.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepositoy;
	
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepositoy.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
}
