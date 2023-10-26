package com.sj.springbootforbeginners.model.orderResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pricing{
	private Double individualPrice;
	private Double priceWithTax;
	private Double discountApplied;

}

//{
//		"orderId": "1",
//		"pricing": {
//		"individualPrice": 250.36,
//		"PriceWithTax": 350.36,
//		"discountApplied": 250.36
//		},
//		"skus": [12345,
//		23548],
//		"quantity": "Richardson",
//		"creditCardNumber": "5125252525",
//		"user": "com.sj.springbootforbeginners.model.User"
//		}