package com.shoping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoping.model.Product;
import com.shoping.service.ProductService;



@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("")
	public ResponseEntity<?> getAllProduct() {
		List<Product> productList = this.productService.getAllProduct();
		return new ResponseEntity<>(productList, HttpStatus.OK);
	}

	@GetMapping("/{product-id}")
	public ResponseEntity<?> getProductById(@PathVariable(value = "product-id") Long productId) {
		Product foundProdcut = this.productService.getProductById(productId);
		return new ResponseEntity<>(foundProdcut, HttpStatus.OK);
	}

	@PostMapping("")
	public ResponseEntity<?> createProduct(@RequestBody Product product) {
		Product createdProduct = this.productService.addProduct(product);
		return new ResponseEntity<>(createdProduct, HttpStatus.OK);
	}

	@DeleteMapping("/{product-id}")
	public ResponseEntity<?> deleteProduct(@PathVariable(value = "product-id") Long productId) {
		this.productService.deleteProduct(productId);
		return new ResponseEntity<>("Product deleted successfully.", HttpStatus.OK);
	}

//	@GetMapping("/{product-id}/order")
//	public ResponseEntity<?> getAllOrderByProductId(@PathVariable(value = "product-id") Long productId) {
//		List<Order> orderList = this.productService.getAllOrderByProductId(productId);
//		return new ResponseEntity<>(orderList, HttpStatus.OK);
//	}

}
