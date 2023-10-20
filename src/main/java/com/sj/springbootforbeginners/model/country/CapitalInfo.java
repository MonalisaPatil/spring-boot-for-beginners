package com.sj.springbootforbeginners.model.country;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CapitalInfo{

	@JsonProperty("latlng")
	private List<Object> latlng;

	public void setLatlng(List<Object> latlng){
		this.latlng = latlng;
	}

	public List<Object> getLatlng(){
		return latlng;
	}

	@Override
 	public String toString(){
		return 
			"CapitalInfo{" + 
			"latlng = '" + latlng + '\'' + 
			"}";
		}
}