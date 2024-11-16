package com.devsuperior.gamestream.dto;

import org.springframework.beans.BeanUtils;

import com.devsuperior.gamestream.entities.GameList;

public class GameListDTO {
	private Long id;
	private String name;
	
	public GameListDTO() {}
	
	public GameListDTO(GameList entity) {
		BeanUtils.copyProperties(entity, this);
	}
	
	// Getters
	public Long     getId() { return this.id; }
	public String getNome() { return this.name; }
	
	// Setters
	public void   setId(Long id)     { this.id = id; }
	public void setName(String name) { this.name = name; }

}
