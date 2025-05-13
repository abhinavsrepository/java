package com.cdac.entities;

import java.time.LocalDate;
import java.util.Date;

import com.cdac.dao.Category;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name="Product")




public class Product {
	@Column(name="p_id",length=20)
	private Long productId ;
	@Column(name="productName",length = 20)
	private String productName;
	@Column(name="p_category",length=30)
	private String productCategory;
	@Column (name="p_desc",length=20)
	private String productDesc;
	
	private LocalDate ManufactureDate;
	@Column (name="p_price")
	private Double price;
	@Column (name="p_quantity")
	private int quantity;
	public Product(Long productId, String productName, String productCategory, String productDesc,
			LocalDate manufactureDate, Double price, int quantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.productDesc = productDesc;
		ManufactureDate = manufactureDate;
		this.price = price;
		this.quantity = quantity;
	}
	public Product(String next, Category valueOf, String next2, LocalDate parse, double nextDouble, int nextInt) {
		// TODO Auto-generated constructor stub
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public LocalDate getManufactureDate() {
		return ManufactureDate;
	}
	public void setManufactureDate(LocalDate manufactureDate) {
		ManufactureDate = manufactureDate;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCategory="
				+ productCategory + ", productDesc=" + productDesc + ", ManufactureDate=" + ManufactureDate + ", price="
				+ price + ", quantity=" + quantity + "]";
	}
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
