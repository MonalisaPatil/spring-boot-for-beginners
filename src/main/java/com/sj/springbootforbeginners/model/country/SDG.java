package com.sj.springbootforbeginners.model.country;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SDG{

	@JsonProperty("name")
	private String name;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	@Override
 	public String toString(){
		return 
			"SDG{" + 
			"name = '" + name + '\'' + 
			"}";
		}
}