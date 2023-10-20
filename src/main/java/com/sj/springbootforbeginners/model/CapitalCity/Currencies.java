package com.sj.springbootforbeginners.model.CapitalCity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Currencies{

	@JsonProperty("EUR")
	private EUR eUR;

	public void setEUR(EUR eUR){
		this.eUR = eUR;
	}

	public EUR getEUR(){
		return eUR;
	}

	@Override
 	public String toString(){
		return 
			"Currencies{" + 
			"eUR = '" + eUR + '\'' + 
			"}";
		}
}