package com.cdac.dao;

import java.util.List;

import com.cdac.entities.Category;

public interface CategoryDao {
     String addCategory(Category category);
     String deleteCategory(String categoryName);
     Category getCategoryWithProducts(String categoryName);
     List<Category> displayAllCategory();
}
