package com.store.happyHeels.service;

import java.util.List;

import com.store.happyHeels.model.ProductCategory;


public interface ProductCategoryService {
	public ProductCategory getCategoryById(Long id);
	public void updateCategory(ProductCategory category);
	
	public ProductCategory saveCategory(ProductCategory category);
	public void deleteCategory(Long id) ;
	public List<ProductCategory> fetchProductCategoryList();
	 
}

