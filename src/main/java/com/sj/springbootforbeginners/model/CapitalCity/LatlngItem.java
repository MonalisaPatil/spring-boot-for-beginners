package com.sj.springbootforbeginners.model.CapitalCity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LatlngItem{

	@JsonProperty("type")
	private String type;

	@JsonProperty("value")
	private String value;

	public LatlngItem(String type, String value) {
		this.type = type;
		this.value = value;
	}

	public LatlngItem() {
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setValue(String value){
		this.value = value;
	}

	public String getValue(){
		return value;
	}

	@Override
 	public String toString(){
		return 
			"LatlngItem{" + 
			"type = '" + type + '\'' + 
			",value = '" + value + '\'' + 
			"}";
		}
}