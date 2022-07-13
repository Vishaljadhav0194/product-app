package com.shoping.serviceimpl;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.shoping.model.Product;
import com.shoping.repo.ProductRepository;
import com.shoping.service.ProductService;


@Service
public class ProductServiceImpl implements ProductService {


	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> getAllProduct() {
		return this.productRepository.findAll();
	}

	@Override
	public Product getProductById(Long id) {
		Optional<Product> optional = this.productRepository.findById(id);
		Product product = null;
		if (optional.isPresent()) {
			product = optional.get();
		} else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No product found with specified id.");
		}
		return product;
	}

	@Override
	public Product addProduct(Product product) {
		return this.productRepository.save(product);
	}

	@Override
	public void deleteProduct(Long id) {
		this.productRepository.deleteById(id);
	}

	@Override
	public void addQuantity(Long productId, Integer quantityIn) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product updateProduct(Long productId, Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deductQuantity(Long productId, Integer quantitySold) {
		// TODO Auto-generated method stub
		
	}

	

	




//	@Override
//	public List<Order> getAllOrderByProductId(Long productId) {
//		Optional<List<Order>> optional = this.orderRepository.findAllByProductId(productId);
//		List<Order> orders = new ArrayList<>();
//		if (optional.isPresent())
//			orders = optional.get();
//		else
//			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No orders found for specified product id.");
//		return orders;
//	}
}
