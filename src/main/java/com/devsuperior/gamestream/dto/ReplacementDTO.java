package com.devsuperior.gamestream.dto;

public class ReplacementDTO {
	private Integer sourceIndex;
	private Integer destinationIndex;
	
	public ReplacementDTO() {}
	
	public Integer      getSourceIndex() { return this.sourceIndex; }
	public Integer getDestinationIndex() { return this.destinationIndex; }
	
	public void      setSourceIndex(Integer sourceIndex)      { this.sourceIndex = sourceIndex; }
	public void setDestinationIndex(Integer destinationIndex) { this.destinationIndex = destinationIndex; }
	
}
