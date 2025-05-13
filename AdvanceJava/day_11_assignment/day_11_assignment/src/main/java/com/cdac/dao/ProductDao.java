package com.cdac.dao;

import com.cdac.entities.Product;

public interface ProductDao {
 
	String addProduct(Product newproduct,String categoryName);
	String deleteProduct(String productName,String categoryName);
	
}
