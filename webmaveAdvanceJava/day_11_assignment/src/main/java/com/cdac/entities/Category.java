package com.cdac.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "categories")
@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true,exclude = "productList")
public class Category extends BaseEntity {


	@Column(unique = true,length=20)
	private String name;
	
	@Column(name = "description",length = 200)
	 private String description;
	
		@OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true /* ,fetch = FetchType.EAGER */) //name of field that it is mapped to (data member name)
	private List<Product> productList = new ArrayList<>();
	
	public Category(String name,String description) {
		super();
		this.description=description;
		this.name = name;
	}
	
	
	// helper Functions
	public void addProduct(Product newproduct) {
		this.productList.add(newproduct);
		newproduct.setCategory(this);
	}
	
	public void removeProduct(Product product) {
		this.productList.remove(product);
		product.setCategory(null);
	}
	
}
