package com.sj.springbootforbeginners.model.country;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostalCode{

	@JsonProperty("regex")
	private String regex;

	@JsonProperty("format")
	private String format;

	public void setRegex(String regex){
		this.regex = regex;
	}

	public String getRegex(){
		return regex;
	}

	public void setFormat(String format){
		this.format = format;
	}

	public String getFormat(){
		return format;
	}

	@Override
 	public String toString(){
		return 
			"PostalCode{" + 
			"regex = '" + regex + '\'' + 
			",format = '" + format + '\'' + 
			"}";
		}
}