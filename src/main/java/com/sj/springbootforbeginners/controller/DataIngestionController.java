package com.sj.springbootforbeginners.controller;

import com.sj.springbootforbeginners.service.DataIngestionService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/beginners/data/ingestion")
public class DataIngestionController {

	@Service
	private DataIngestionService dataIngestionService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/flipkart")
	public String ingestFlipkartData() {

		return "Hello World";
	}

	@GetMapping(value = "/helloUsingPathParameter")
	public String sayHello(@RequestParam String name) {
		return "Hello "+name;
	}

	@GetMapping(value = "/helloUsingPathParameters")
	public String sayHello(@RequestParam String name, @RequestParam String city, @RequestParam String phoneNumber) {
		return "Hello "+name  +" Your are located at: "+city + " your phone number is: "+ phoneNumber;
	}

}
