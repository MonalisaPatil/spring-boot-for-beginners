package com.sj.springbootforbeginners.model.ecommerce.productHasOptions;

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
public class ProductHasOptions{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@JsonProperty("specs")
	private String specs;

	@JsonProperty("quantity")
	private int quantity;

	@JsonProperty("price")
	private int price;

	@JsonProperty("product_id")
	private int productId;

	@JsonProperty("option_id")
	private int optionId;

	@JsonProperty("on_sale")
	private int onSale;


}