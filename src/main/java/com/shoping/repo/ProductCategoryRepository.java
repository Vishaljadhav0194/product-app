package com.shoping.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoping.model.ProductCategory;



public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {

}
