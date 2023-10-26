package com.sj.springbootforbeginners.model.ecommerce.product;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductOptionsItem{

	@JsonProperty("availableQuantity")
	private int availableQuantity;

	@JsonProperty("optionSpecification")
	private String optionSpecification;

	@JsonProperty("optionId")
	private int optionId;

	public void setAvailableQuantity(int availableQuantity){
		this.availableQuantity = availableQuantity;
	}

	public int getAvailableQuantity(){
		return availableQuantity;
	}

	public void setOptionSpecification(String optionSpecification){
		this.optionSpecification = optionSpecification;
	}

	public String getOptionSpecification(){
		return optionSpecification;
	}

	public void setOptionId(int optionId){
		this.optionId = optionId;
	}

	public int getOptionId(){
		return optionId;
	}

	@Override
 	public String toString(){
		return 
			"ProductOptionsItem{" + 
			"availableQuantity = '" + availableQuantity + '\'' + 
			",optionSpecification = '" + optionSpecification + '\'' + 
			",optionId = '" + optionId + '\'' + 
			"}";
		}
}