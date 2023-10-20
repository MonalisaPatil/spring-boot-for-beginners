package com.sj.springbootforbeginners.model.country;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CoatOfArms{

	@JsonProperty("svg")
	private String svg;

	@JsonProperty("png")
	private String png;

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

	@Override
 	public String toString(){
		return 
			"CoatOfArms{" + 
			"svg = '" + svg + '\'' + 
			",png = '" + png + '\'' + 
			"}";
		}
}