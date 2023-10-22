package com.sj.springbootforbeginners.model.ecommerce.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "FINAL_ORDERS")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@JsonProperty("orderPlacedDate")
	private String orderPlacedDate;

	@JsonProperty("orderNumber")
	private int orderNumber;

	@JsonProperty("shippingCost")
	private int shippingCost;

	@JsonProperty("orderDeliveryDate")
	private String orderDeliveryDate;

	@JsonProperty("numberOfItems")
	private int numberOfItems;

	@JsonProperty("tracking_number")
	private String trackingNumber;

	@JsonProperty("tax")
	private double tax;

	@JsonProperty("orderTotalCost")
	private double orderTotalCost;

	@JsonProperty("ship_address")
	private String shipAddress;

	@JsonProperty("customerName")
	private String shipName;

	@JsonProperty("delivery_status")
	private int deliveryStatus;
}