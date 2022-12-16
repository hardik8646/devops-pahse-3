package com.store.happyHeels.service;

import java.util.List;

import com.store.happyHeels.model.Product;
import com.store.happyHeels.model.ProductCategory;

public interface ProductService {

	public Product getProductById(Long productCode);
	
	public Product getProductByProductCategory(ProductCategory productCategory);
	
	public void updateProduct(Product product);
	
	public Product saveProduct(Product product);
	public void deleteProduct(Long productCode);
	
	
	public List<Product> getAllProducts();
	
	
}
