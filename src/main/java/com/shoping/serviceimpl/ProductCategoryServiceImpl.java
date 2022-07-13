package com.shoping.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.shoping.model.ProductCategory;
import com.shoping.repo.ProductCategoryRepository;
import com.shoping.service.ProductCategoryService;



public class ProductCategoryServiceImpl implements ProductCategoryService{

	@Autowired
	ProductCategoryRepository categoryRepository;
	
	@Override
	public List<ProductCategory> getAllProductCategory() {
		return this.categoryRepository.findAll();
	}

	@Override
	public ProductCategoryRepository getProductCategoryById1(Long productCategoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductCategoryRepository createProductCategory(ProductCategoryRepository productCategory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProductCategory(Long ProductCategoryId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProductCategoryRepository getProductCategoryById(Long productCategoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
