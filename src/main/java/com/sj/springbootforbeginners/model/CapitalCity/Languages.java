package com.sj.springbootforbeginners.model.CapitalCity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Languages{

	@JsonProperty("est")
	private String est;

	public void setEst(String est){
		this.est = est;
	}

	public String getEst(){
		return est;
	}

	@Override
 	public String toString(){
		return 
			"Languages{" + 
			"est = '" + est + '\'' + 
			"}";
		}
}