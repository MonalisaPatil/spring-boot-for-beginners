package com.sj.springbootforbeginners.model.CapitalCity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CapitalInfo{

	@JsonProperty("latlng")
	private List<Double> latlng;

	public CapitalInfo(List<Double> latlng) {
		this.latlng = latlng;
	}

	public CapitalInfo() {
	}

	public void setLatlng(List<Double> latlng){
		this.latlng = latlng;
	}

	public List<Double> getLatlng(){
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