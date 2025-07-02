package com.sj.springbootforbeginners.model.flipkart;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "Item")
public class FlipkartItem {

	@JsonProperty("seller")
	private String seller;

	@JsonProperty("selling_price")
	private String sellingPrice;

	@JsonProperty("out_of_stock")
	private boolean outOfStock;

	@JsonProperty("images")
	private List<String> images;

	@JsonProperty("actual_price")
	private String actualPrice;

	@JsonProperty("sub_category")
	private String subCategory;

	@JsonProperty("description")
	private String description;

	@JsonProperty("discount")
	private String discount;

	@JsonProperty("average_rating")
	private String averageRating;

	@JsonProperty("pid")
	private String pid;

	@JsonProperty("title")
	private String title;

	@JsonProperty("crawled_at")
	private String crawledAt;

	@JsonProperty("url")
	private String url;

	@JsonProperty("_id")
	private String id;

	@JsonProperty("category")
	private String category;

	@JsonProperty("product_details")
	private List<ProductDetailsItem> productDetails;

	@JsonProperty("brand")
	private String brand;

	public void setSeller(String seller){
		this.seller = seller;
	}

	public String getSeller(){
		return seller;
	}

	public void setSellingPrice(String sellingPrice){
		this.sellingPrice = sellingPrice;
	}

	public String getSellingPrice(){
		return sellingPrice;
	}

	public void setOutOfStock(boolean outOfStock){
		this.outOfStock = outOfStock;
	}

	public boolean isOutOfStock(){
		return outOfStock;
	}

	public void setImages(List<String> images){
		this.images = images;
	}

	public List<String> getImages(){
		return images;
	}

	public void setActualPrice(String actualPrice){
		this.actualPrice = actualPrice;
	}

	public String getActualPrice(){
		return actualPrice;
	}

	public void setSubCategory(String subCategory){
		this.subCategory = subCategory;
	}

	public String getSubCategory(){
		return subCategory;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setDiscount(String discount){
		this.discount = discount;
	}

	public String getDiscount(){
		return discount;
	}

	public void setAverageRating(String averageRating){
		this.averageRating = averageRating;
	}

	public String getAverageRating(){
		return averageRating;
	}

	public void setPid(String pid){
		this.pid = pid;
	}

	public String getPid(){
		return pid;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setCrawledAt(String crawledAt){
		this.crawledAt = crawledAt;
	}

	public String getCrawledAt(){
		return crawledAt;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setCategory(String category){
		this.category = category;
	}

	public String getCategory(){
		return category;
	}

	public void setProductDetails(List<ProductDetailsItem> productDetails){
		this.productDetails = productDetails;
	}

	public List<ProductDetailsItem> getProductDetails(){
		return productDetails;
	}

	public void setBrand(String brand){
		this.brand = brand;
	}

	public String getBrand(){
		return brand;
	}
}