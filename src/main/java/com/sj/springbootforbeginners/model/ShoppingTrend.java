package com.sj.springbootforbeginners.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ShoppingTrend{

    @Id
	@JsonProperty("Customer ID")
	private int customerID;

	@JsonProperty("Review Rating")
	private Double reviewRating;

	@JsonProperty("Discount Applied")
	private String discountApplied;

	@JsonProperty("Promo Code Used")
	private String promoCodeUsed;

	@JsonProperty("Category")
	private String category;

	@JsonProperty("Frequency of Purchases")
	private String frequencyOfPurchases;

	@JsonProperty("Size")
	private String size;

	@JsonProperty("Subscription Status")
	private String subscriptionStatus;

	@JsonProperty("Color")
	private String color;

	@JsonProperty("Purchase Amount (USD)")
	private int purchaseAmountUSD;

	@JsonProperty("Gender")
	private String gender;

	@JsonProperty("Shipping Type")
	private String shippingType;

	@JsonProperty("Season")
	private String season;

	@JsonProperty("Payment Method")
	private String paymentMethod;

	@JsonProperty("Item Purchased")
	private String itemPurchased;

	@JsonProperty("Age")
	private int age;

	@JsonProperty("Previous Purchases")
	private int previousPurchases;

	@JsonProperty("Location")
	private String location;


	public void setReviewRating(Double reviewRating){
		this.reviewRating = reviewRating;
	}

	public Double getReviewRating(){
		return reviewRating;
	}

	public void setDiscountApplied(String discountApplied){
		this.discountApplied = discountApplied;
	}

	public String getDiscountApplied(){
		return discountApplied;
	}

	public void setPromoCodeUsed(String promoCodeUsed){
		this.promoCodeUsed = promoCodeUsed;
	}

	public String getPromoCodeUsed(){
		return promoCodeUsed;
	}

	public void setCategory(String category){
		this.category = category;
	}

	public String getCategory(){
		return category;
	}

	public void setFrequencyOfPurchases(String frequencyOfPurchases){
		this.frequencyOfPurchases = frequencyOfPurchases;
	}

	public String getFrequencyOfPurchases(){
		return frequencyOfPurchases;
	}

	public void setSize(String size){
		this.size = size;
	}

	public String getSize(){
		return size;
	}

	public void setSubscriptionStatus(String subscriptionStatus){
		this.subscriptionStatus = subscriptionStatus;
	}

	public String getSubscriptionStatus(){
		return subscriptionStatus;
	}

	public void setColor(String color){
		this.color = color;
	}

	public String getColor(){
		return color;
	}

	public void setPurchaseAmountUSD(int purchaseAmountUSD){
		this.purchaseAmountUSD = purchaseAmountUSD;
	}

	public int getPurchaseAmountUSD(){
		return purchaseAmountUSD;
	}

	public void setGender(String gender){
		this.gender = gender;
	}

	public String getGender(){
		return gender;
	}

	public void setShippingType(String shippingType){
		this.shippingType = shippingType;
	}

	public String getShippingType(){
		return shippingType;
	}

	public void setCustomerID(int customerID){
		this.customerID = customerID;
	}

	public int getCustomerID(){
		return customerID;
	}

	public void setSeason(String season){
		this.season = season;
	}

	public String getSeason(){
		return season;
	}

	public void setPaymentMethod(String paymentMethod){
		this.paymentMethod = paymentMethod;
	}

	public String getPaymentMethod(){
		return paymentMethod;
	}

	public void setItemPurchased(String itemPurchased){
		this.itemPurchased = itemPurchased;
	}

	public String getItemPurchased(){
		return itemPurchased;
	}

	public void setAge(int age){
		this.age = age;
	}

	public int getAge(){
		return age;
	}

	public void setPreviousPurchases(int previousPurchases){
		this.previousPurchases = previousPurchases;
	}

	public int getPreviousPurchases(){
		return previousPurchases;
	}

	public void setLocation(String location){
		this.location = location;
	}

	public String getLocation(){
		return location;
	}

	@Override
 	public String toString(){
		return 
			"ShoppingTrend{" + 
			"review Rating = '" + reviewRating + '\'' + 
			",discount Applied = '" + discountApplied + '\'' + 
			",promo Code Used = '" + promoCodeUsed + '\'' + 
			",category = '" + category + '\'' + 
			",frequency of Purchases = '" + frequencyOfPurchases + '\'' + 
			",size = '" + size + '\'' + 
			",subscription Status = '" + subscriptionStatus + '\'' + 
			",color = '" + color + '\'' + 
			",purchase Amount (USD) = '" + purchaseAmountUSD + '\'' + 
			",gender = '" + gender + '\'' + 
			",shipping Type = '" + shippingType + '\'' + 
			",customer ID = '" + customerID + '\'' + 
			",season = '" + season + '\'' + 
			",payment Method = '" + paymentMethod + '\'' + 
			",item Purchased = '" + itemPurchased + '\'' + 
			",age = '" + age + '\'' + 
			",previous Purchases = '" + previousPurchases + '\'' + 
			",location = '" + location + '\'' + 
			"}";
		}
}