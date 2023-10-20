package com.sj.springbootforbeginners.model.CapitalCity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Jpn{

	@JsonProperty("common")
	private String common;

	@JsonProperty("official")
	private String official;

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

	@Override
 	public String toString(){
		return 
			"Jpn{" + 
			"common = '" + common + '\'' + 
			",official = '" + official + '\'' + 
			"}";
		}
}