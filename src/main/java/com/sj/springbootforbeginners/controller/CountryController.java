package com.sj.springbootforbeginners.controller;

import com.sj.springbootforbeginners.model.CapitalCity.CapitalCity;
import com.sj.springbootforbeginners.model.country.CountryDataItem;
import com.sj.springbootforbeginners.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/country/info/crud")
public class CountryController {

	@Autowired
	private CountryService countryService;

	@GetMapping(value = "/getAllCountries",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CountryDataItem> getAllCountries() {
		return countryService.getAllCountries();
	}

	@GetMapping(value = "/getAllCapitalCity",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CapitalCity> getAllCapitalCity(){
		return countryService.getAllCapitalCity();
	}

	@GetMapping(value = "/getAllTimeZones",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<String> getAllTimeZones(){
		return countryService.getAllTimeZones();
	}

	@GetMapping(value = "/getAllRegionWrtInput",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CountryDataItem> getAllRegionWrtInput(String input){
		return countryService.getAllRegionWrtInput(input);
	}

	@GetMapping(value = "/getCountryWrtDriveway",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<String> getCountryWrtDriveway(String input){
		return countryService.getCountryWrtDriveway(input);
	}





























}

