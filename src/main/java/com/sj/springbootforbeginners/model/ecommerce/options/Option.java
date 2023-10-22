package com.sj.springbootforbeginners.model.ecommerce.options;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "OPTIONS_TO_OFFER")
public class Option {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@JsonProperty("optionNumber")
	private int optionNumber;

	@JsonProperty("optionDescription")
	private String optionDescription;


}