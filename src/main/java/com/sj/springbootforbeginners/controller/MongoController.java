package com.sj.springbootforbeginners.controller;

import com.sj.springbootforbeginners.model.User;
import com.sj.springbootforbeginners.repository.UserRepository;
import com.sj.springbootforbeginners.service.MongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/beginners/mongo/crud")
public class MongoController {

	@Autowired
	private MongoService mongoService;

	@PostMapping(value = "/createUser", produces = MediaType.APPLICATION_JSON_VALUE)
	public String createUser(@RequestBody User user) {
       return mongoService.createUser(user);
	}
	@GetMapping(value = "/getByName",produces = MediaType.APPLICATION_JSON_VALUE)
	public User getUserByName(@RequestParam String name) {
		return mongoService.findItemByName(name);
	}
	@GetMapping(value = "/getAllUser",produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<User> getAllUser() {
		return mongoService.findAll();
	}
	@DeleteMapping(value = "/deleteUser",produces = MediaType.APPLICATION_JSON_VALUE)
	public String deleteUserById(@RequestParam String id) {
        mongoService.deleteById(id);
		return "Successfully deleted the record for "+ id ;
	}
	@DeleteMapping(value = "/deleteAllUser",produces = MediaType.APPLICATION_JSON_VALUE)
	public String deleteAllUser() {
		mongoService.deleteAll();
		return "Successfully deleted all" ;
	}

	@GetMapping(value = "/getNameStartsWithA", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<User> getNameStartsWithA(@RequestParam String input){
     return mongoService.getEmployeesByNameStartsWith(input);
	}

	@GetMapping(value = "/getPhoneNumberStartWith", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<String> getPhoneNumberStartWith(@RequestParam String phoneNumber){
		return mongoService.getPhoneNumberStartWith(phoneNumber);
	}

	@GetMapping(value = "/numberOfStudentNameStartsWith", produces = MediaType.APPLICATION_JSON_VALUE)
	public int numberOfStudentNameStartsWith(@RequestParam String name){
		return mongoService.numberOfStudentNameStartsWith(name.toLowerCase());
	}

}
