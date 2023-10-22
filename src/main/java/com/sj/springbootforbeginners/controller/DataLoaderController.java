package com.sj.springbootforbeginners.controller;

import com.sj.springbootforbeginners.model.User;
import com.sj.springbootforbeginners.service.DataLoaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;

@RestController
@RequestMapping("/")
public class DataLoaderController {

	@Autowired
	private DataLoaderService dataLoaderService;

	@GetMapping(value = "/loadShoppingTrend",produces = MediaType.APPLICATION_JSON_VALUE)
	public String loadShoppingTrends() {
		dataLoaderService.LoadShoppingTrends();
		return "Successfully Loaded";
	}

	@GetMapping(value = "/loadEcommerceData",produces = MediaType.APPLICATION_JSON_VALUE)
	public String loadEcommerceData() {
		dataLoaderService.loadEcommerceData();
		return "Successfully Loaded";
	}


}
