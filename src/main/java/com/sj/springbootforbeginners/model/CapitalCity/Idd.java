package com.sj.springbootforbeginners.model.CapitalCity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Idd{

	@JsonProperty("suffixes")
	private List<String> suffixes;

	@JsonProperty("root")
	private String root;

	public void setSuffixes(List<String> suffixes){
		this.suffixes = suffixes;
	}

	public List<String> getSuffixes(){
		return suffixes;
	}

	public void setRoot(String root){
		this.root = root;
	}

	public String getRoot(){
		return root;
	}

	@Override
 	public String toString(){
		return 
			"Idd{" + 
			"suffixes = '" + suffixes + '\'' + 
			",root = '" + root + '\'' + 
			"}";
		}
}