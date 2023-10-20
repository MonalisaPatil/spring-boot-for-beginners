package com.sj.springbootforbeginners.model.country;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Car{

	@JsonProperty("side")
	private String side;

	@JsonProperty("signs")
	private List<String> signs;

	public void setSide(String side){
		this.side = side;
	}

	public String getSide(){
		return side;
	}

	public void setSigns(List<String> signs){
		this.signs = signs;
	}

	public List<String> getSigns(){
		return signs;
	}

	@Override
 	public String toString(){
		return 
			"Car{" + 
			"side = '" + side + '\'' + 
			",signs = '" + signs + '\'' + 
			"}";
		}
}