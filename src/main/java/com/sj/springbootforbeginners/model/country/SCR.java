package com.sj.springbootforbeginners.model.country;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SCR{

	@JsonProperty("symbol")
	private String symbol;

	@JsonProperty("name")
	private String name;

	public void setSymbol(String symbol){
		this.symbol = symbol;
	}

	public String getSymbol(){
		return symbol;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	@Override
 	public String toString(){
		return 
			"SCR{" + 
			"symbol = '" + symbol + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}