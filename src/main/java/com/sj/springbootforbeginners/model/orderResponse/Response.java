package com.sj.springbootforbeginners.model.orderResponse;

import java.util.List;
import lombok.Data;

@Data
public class Response{
	private List<Integer> skus;
	private String quantity;
	private String orderId;
	private String creditCardNumber;
	private String user;
	private Pricing pricing;
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