package com.sj.springbootforbeginners.model.country;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Flags{

	@JsonProperty("svg")
	private String svg;

	@JsonProperty("png")
	private String png;

	@JsonProperty("alt")
	private String alt;

	public void setSvg(String svg){
		this.svg = svg;
	}

	public String getSvg(){
		return svg;
	}

	public void setPng(String png){
		this.png = png;
	}

	public String getPng(){
		return png;
	}

	public void setAlt(String alt){
		this.alt = alt;
	}

	public String getAlt(){
		return alt;
	}

	@Override
 	public String toString(){
		return 
			"Flags{" + 
			"svg = '" + svg + '\'' + 
			",png = '" + png + '\'' + 
			",alt = '" + alt + '\'' + 
			"}";
		}
}