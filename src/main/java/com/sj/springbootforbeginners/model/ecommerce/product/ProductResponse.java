package com.sj.springbootforbeginners.model.ecommerce.product;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductResponse {

	@JsonProperty("productTitle")
	private String productTitle;

	@JsonProperty("productCategoryId")
	private int productCategoryId;

	@JsonProperty("productOptions")
	private List<ProductOptionsItem> productOptions;

	@JsonProperty("productId")
	private int productId;

	@JsonProperty("productDescription")
	private String productDescription;

	@JsonProperty("productVendor")
	private ProductVendor productVendor;

	@JsonProperty("productCategory")
	private String productCategory;

	public void setProductTitle(String productTitle){
		this.productTitle = productTitle;
	}

	public String getProductTitle(){
		return productTitle;
	}

	public void setProductCategoryId(int productCategoryId){
		this.productCategoryId = productCategoryId;
	}

	public int getProductCategoryId(){
		return productCategoryId;
	}

	public void setProductOptions(List<ProductOptionsItem> productOptions){
		this.productOptions = productOptions;
	}

	public List<ProductOptionsItem> getProductOptions(){
		return productOptions;
	}

	public void setProductId(int productId){
		this.productId = productId;
	}

	public int getProductId(){
		return productId;
	}

	public void setProductDescription(String productDescription){
		this.productDescription = productDescription;
	}

	public String getProductDescription(){
		return productDescription;
	}

	public void setProductVendor(ProductVendor productVendor){
		this.productVendor = productVendor;
	}

	public ProductVendor getProductVendor(){
		return productVendor;
	}

	public void setProductCategory(String productCategory){
		this.productCategory = productCategory;
	}

	public String getProductCategory(){
		return productCategory;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"productTitle = '" + productTitle + '\'' + 
			",productCategoryId = '" + productCategoryId + '\'' + 
			",productOptions = '" + productOptions + '\'' + 
			",productId = '" + productId + '\'' + 
			",productDescription = '" + productDescription + '\'' + 
			",productVendor = '" + productVendor + '\'' + 
			",productCategory = '" + productCategory + '\'' + 
			"}";
		}
}