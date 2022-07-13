package com.shoping.service;

import java.util.List;

import com.shoping.model.Product;

public interface ProductService {

	List<Product> getAllProduct();

	Product getProductById(Long productId);

	Product addProduct(Product product);

	void deleteProduct(Long productId);

	void addQuantity(Long productId, Integer quantityIn);

	Product updateProduct(Long productId, Product product);

	void deductQuantity(Long productId, Integer quantitySold);



	

	

}
