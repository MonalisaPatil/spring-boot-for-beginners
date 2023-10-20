package com.sj.springbootforbeginners.model.country;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Maps{

	@JsonProperty("openStreetMaps")
	private String openStreetMaps;

	@JsonProperty("googleMaps")
	private String googleMaps;

	public void setOpenStreetMaps(String openStreetMaps){
		this.openStreetMaps = openStreetMaps;
	}

	public String getOpenStreetMaps(){
		return openStreetMaps;
	}

	public void setGoogleMaps(String googleMaps){
		this.googleMaps = googleMaps;
	}

	public String getGoogleMaps(){
		return googleMaps;
	}

	@Override
 	public String toString(){
		return 
			"Maps{" + 
			"openStreetMaps = '" + openStreetMaps + '\'' + 
			",googleMaps = '" + googleMaps + '\'' + 
			"}";
		}
}