package com.sj.springbootforbeginners.model.ecommerce.cartHasProdcuts;

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
public class CartHasProducts{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@JsonProperty("quantity")
	private int quantity;

	@JsonProperty("product_id")
	private int productId;

	@JsonProperty("option_id")
	private int option_id;

	@JsonProperty("shopping_cart_id")
	private int shoppingCartId;

}