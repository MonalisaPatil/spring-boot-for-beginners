package com.sj.springbootforbeginners.model.ecommerce.vendor;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
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
public class Vendor{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@JsonProperty("vendor_id")
	private int vendorId;

	@JsonProperty("vendor_phone")
	private long vendorPhone;

	@JsonProperty("vendor_name")
	private String vendorName;

	@JsonProperty("vender_email")
	private String venderEmail;


}