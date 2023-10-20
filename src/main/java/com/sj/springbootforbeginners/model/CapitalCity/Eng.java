package com.sj.springbootforbeginners.model.CapitalCity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Eng{

	@JsonProperty("f")
	private String f;

	@JsonProperty("m")
	private String m;

	public void setF(String f){
		this.f = f;
	}

	public String getF(){
		return f;
	}

	public void setM(String m){
		this.m = m;
	}

	public String getM(){
		return m;
	}

	@Override
 	public String toString(){
		return 
			"Eng{" + 
			"f = '" + f + '\'' + 
			",m = '" + m + '\'' + 
			"}";
		}
}