package com.shoping.service;

import java.util.List;

import com.shoping.model.ProductCategory;
import com.shoping.repo.ProductCategoryRepository;



public interface ProductCategoryService {

	List<ProductCategory> getAllProductCategory();

	ProductCategoryRepository getProductCategoryById(Long productCategoryId);

	ProductCategoryRepository createProductCategory(ProductCategoryRepository productCategory);

	void deleteProductCategory(Long ProductCategoryId);

	ProductCategoryRepository getProductCategoryById1(Long productCategoryId);

}
