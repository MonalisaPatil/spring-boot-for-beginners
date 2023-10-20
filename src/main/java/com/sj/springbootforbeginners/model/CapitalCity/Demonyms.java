package com.sj.springbootforbeginners.model.CapitalCity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Demonyms{

	@JsonProperty("fra")
	private Fra fra;

	@JsonProperty("eng")
	private Eng eng;

	public void setFra(Fra fra){
		this.fra = fra;
	}

	public Fra getFra(){
		return fra;
	}

	public void setEng(Eng eng){
		this.eng = eng;
	}

	public Eng getEng(){
		return eng;
	}

	@Override
 	public String toString(){
		return 
			"Demonyms{" + 
			"fra = '" + fra + '\'' + 
			",eng = '" + eng + '\'' + 
			"}";
		}
}