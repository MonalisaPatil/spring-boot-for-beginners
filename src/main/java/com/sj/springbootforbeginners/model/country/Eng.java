package com.sj.springbootforbeginners.model.country;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Eng{

	@JsonProperty("common")
	private String common;

	@JsonProperty("official")
	private String official;

	@JsonProperty("f")
	private String f;

	@JsonProperty("m")
	private String m;

	public void setCommon(String common){
		this.common = common;
	}

	public String getCommon(){
		return common;
	}

	public void setOfficial(String official){
		this.official = official;
	}

	public String getOfficial(){
		return official;
	}

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
			"common = '" + common + '\'' + 
			",official = '" + official + '\'' + 
			",f = '" + f + '\'' + 
			",m = '" + m + '\'' + 
			"}";
		}
}