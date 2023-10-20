package com.sj.springbootforbeginners.model.CapitalCity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NativeName{

	@JsonProperty("est")
	private Est est;

	public void setEst(Est est){
		this.est = est;
	}

	public Est getEst(){
		return est;
	}

	@Override
 	public String toString(){
		return 
			"NativeName{" + 
			"est = '" + est + '\'' + 
			"}";
		}
}