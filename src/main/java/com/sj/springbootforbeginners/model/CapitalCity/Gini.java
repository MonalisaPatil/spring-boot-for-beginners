package com.sj.springbootforbeginners.model.CapitalCity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Gini{

	@JsonProperty("2018")
	private Object jsonMember2018;

	public void setJsonMember2018(Object jsonMember2018){
		this.jsonMember2018 = jsonMember2018;
	}

	public Object getJsonMember2018(){
		return jsonMember2018;
	}

	@Override
 	public String toString(){
		return 
			"Gini{" + 
			"2018 = '" + jsonMember2018 + '\'' + 
			"}";
		}
}