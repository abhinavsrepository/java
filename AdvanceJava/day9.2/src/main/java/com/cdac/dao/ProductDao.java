package com.cdac.dao;

import com.cdac.entities.Product;

public interface ProductDao {
	
	String addproduct(Product transientProduct);
	Product getProductById(Long productid);
	
	
}
