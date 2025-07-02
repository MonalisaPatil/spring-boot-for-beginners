package com.sj.springbootforbeginners.model.flipkart;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "ProductDetails")
public class ProductDetailsItem{

	@JsonProperty("Color")
	private String color;

	@JsonProperty("Pattern")
	private String pattern;

	@JsonProperty("Fabric")
	private String fabric;

	@JsonProperty("Pockets")
	private String pockets;

	@JsonProperty("Closure")
	private String closure;

	@JsonProperty("Style Code")
	private String styleCode;

	public void setColor(String color){
		this.color = color;
	}

	public String getColor(){
		return color;
	}

	public void setPattern(String pattern){
		this.pattern = pattern;
	}

	public String getPattern(){
		return pattern;
	}

	public void setFabric(String fabric){
		this.fabric = fabric;
	}

	public String getFabric(){
		return fabric;
	}

	public void setPockets(String pockets){
		this.pockets = pockets;
	}

	public String getPockets(){
		return pockets;
	}

	public void setClosure(String closure){
		this.closure = closure;
	}

	public String getClosure(){
		return closure;
	}

	public void setStyleCode(String styleCode){
		this.styleCode = styleCode;
	}

	public String getStyleCode(){
		return styleCode;
	}
}