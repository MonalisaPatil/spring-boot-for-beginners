package com.sj.springbootforbeginners.model.ecommerce.product;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductVendor{

	@JsonProperty("vendorPhone")
	private long vendorPhone;

	@JsonProperty("vendorEmail")
	private String vendorEmail;

	@JsonProperty("vendorId")
	private int vendorId;

	@JsonProperty("vendorName")
	private String vendorName;

	public void setVendorPhone(long vendorPhone){
		this.vendorPhone = vendorPhone;
	}

	public long getVendorPhone(){
		return vendorPhone;
	}

	public void setVendorEmail(String vendorEmail){
		this.vendorEmail = vendorEmail;
	}

	public String getVendorEmail(){
		return vendorEmail;
	}

	public void setVendorId(int vendorId){
		this.vendorId = vendorId;
	}

	public int getVendorId(){
		return vendorId;
	}

	public void setVendorName(String vendorName){
		this.vendorName = vendorName;
	}

	public String getVendorName(){
		return vendorName;
	}

	@Override
 	public String toString(){
		return 
			"ProductVendor{" + 
			"vendorPhone = '" + vendorPhone + '\'' + 
			",vendorEmail = '" + vendorEmail + '\'' + 
			",vendorId = '" + vendorId + '\'' + 
			",vendorName = '" + vendorName + '\'' + 
			"}";
		}
}