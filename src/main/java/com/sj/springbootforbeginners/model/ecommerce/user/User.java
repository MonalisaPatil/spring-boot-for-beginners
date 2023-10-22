package com.sj.springbootforbeginners.model.ecommerce.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@JsonProperty("password")
	private String password;

	@JsonProperty("full_name")
	private String fullName;

	@JsonProperty("address")
	private String address;

	@JsonProperty("user_id")
	private int userId;

	@JsonProperty("phone")
	private long phone;

	@JsonProperty("email")
	private String email;

	@JsonProperty("username")
	private String username;

}