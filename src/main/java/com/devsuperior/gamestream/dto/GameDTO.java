package com.devsuperior.gamestream.dto;

import org.springframework.beans.BeanUtils;

import com.devsuperior.gamestream.entities.Game;

public class GameDTO {
	private Long    id;
	private String  title;
	private Integer year;
	private String  genre;
	private String  platform;
	private Double  score;
	private String  imgUrl;
	private String  shortDescription;
	private String  longDescription;

	public GameDTO() {}
	
	public GameDTO(Game entity) {
		BeanUtils.copyProperties(entity, this);
	}
	
	// Getters
	public Long                  getId() { return id;}
	public String             getTitle() { return title; }
	public Integer             getYear() { return year; }
	public String             getGenre() { return genre; }
	public String          getPlatform() { return platform; }
	public Double             getScore() { return score; }
	public String            getImgUrl() { return imgUrl; }
	public String  getShortDescription() { return shortDescription; }
	public String   getLongDescription() { return longDescription; }

	// Setters
	public void               setId(Long    id)               { this.id = id; }
	public void            setTitle(String  title)            { this.title = title; }
	public void             setYear(Integer year)             { this.year = year; }
	public void            setGenre(String  genre)            { this.genre = genre; }
	public void         setPlatform(String  platform)         { this.platform = platform; }
	public void            setScore(Double  score)            { this.score = score; }
	public void           setImgUrl(String  imgUrl)           { this.imgUrl = imgUrl; }
	public void setShortDescription(String  shortDescription) { this.shortDescription = shortDescription; }
	public void  setLongDescription(String  longDescription)  { this.longDescription = longDescription; }

}
