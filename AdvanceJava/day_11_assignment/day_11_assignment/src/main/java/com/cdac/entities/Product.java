package com.cdac.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Products")
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true,exclude = "category")
public class Product extends BaseEntity {
   
	@Column(name="product_name",length=20 ,nullable = false,unique = true)
	private String name;
	
	@Column(name = "description",length = 200)
	 private String description;
	
	@Column(name="manufacture_date")
	private LocalDate manufactureDate;
	
	@Column(name="price",nullable = false)
	private Double price;
	
	@Column(name="avaliavble_quantity")
	private Integer quantity;
	
	@ManyToOne
	@JoinColumn(name="category_id",nullable = false)// forigen key must not be Null in this case
	private Category category;

	public Product(String name, LocalDate manufactureDate,String description, Double price, Integer quantity) {
		super();
		this.description = description;
		this.name = name;
		this.manufactureDate = manufactureDate;
		this.price = price;
		this.quantity = quantity;
	}
	
}
