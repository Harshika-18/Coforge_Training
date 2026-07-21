package com.coforge.pms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.coforge.pms.exception.InvalidProductObjectException;
import com.coforge.pms.exception.ProductNotFoundException;
import com.coforge.pms.model.Product;
import com.coforge.pms.service.ProductService;

@RestController
@RequestMapping("/api/v1/pms")
public class ProductController {
	
	private ProductService service;
	
	private Environment environment;
	
	@Autowired
	public ProductController(ProductService service,Environment environment) {
		super();
		this.service = service;
		this.environment = environment;
	}

	@PostMapping("/products")
	public ResponseEntity<String> saveProduct(@RequestBody Product product) {
		ResponseEntity<String> responseEntity = null;
		boolean status = service.saveProduct(product);
		if(status) {
			responseEntity = new ResponseEntity<>(environment.getProperty("pms.save.success"), HttpStatus.CREATED);
		}
		return responseEntity;
	}
	
	@PutMapping("/products/{pid}")
	public ResponseEntity<String> updateProduct(@PathVariable("pid") int pid, @RequestBody Product product) {
		ResponseEntity<String> responseEntity = null;
		boolean status = service.updateProduct(pid, product);
		if(status) {
			responseEntity = new ResponseEntity<>(environment.getProperty("pms.update.success"), HttpStatus.CREATED);
		}
		return responseEntity;
	}
	
	@DeleteMapping("/products/{pid}")
	public ResponseEntity<String> deleteProduct(@PathVariable("pid") int pid) {
		ResponseEntity<String> responseEntity = null;
		boolean status = service.deleteProduct(pid);
		if(status) {
			responseEntity = new ResponseEntity<>(environment.getProperty("pms.delete.success"), HttpStatus.OK);
		}
		return responseEntity;
	}
	
	@GetMapping("/products/{pid}")
	public ResponseEntity<?> findProduct(@PathVariable("pid") int pid) {
		ResponseEntity<?> responseEntity = null;
		Optional<Product> product = service.findProduct(pid);
		if(product.isPresent()) {
			responseEntity = new ResponseEntity<>(product.get(), HttpStatus.OK);
		}
		return responseEntity;
	}
	
	@GetMapping("/products")
	public ResponseEntity<?> findAllProducts() {
		ResponseEntity<?> responseEntity = null;
		List<Product> employees = service.findAllProducts();
		responseEntity = new ResponseEntity<>(employees, HttpStatus.OK);
		return responseEntity;
	}
	
	@GetMapping("/products/pname/{pname}")
	public ResponseEntity<?> findByPname(@PathVariable("pname") String pname) {
		ResponseEntity<?> responseEntity = null;
		List<Product> products = service.findByPname(pname);
		responseEntity = new ResponseEntity<>(products, HttpStatus.OK);
		return responseEntity;
	}
	
	@GetMapping("/products/price/{price}")
	public ResponseEntity<?> findByPrice(@PathVariable("price") int price) {
		ResponseEntity<?> responseEntity = null;
		List<Product> products = service.findByPrice(price);
		responseEntity = new ResponseEntity<>(products, HttpStatus.OK);
		return responseEntity;
	}
	
	@GetMapping("/products/quantity/{quantity}")
	public ResponseEntity<?> findByQuantity(@PathVariable("quantity") int quantity) {
		ResponseEntity<?> responseEntity = null;
		List<Product> products = service.findByQuantity(quantity);
		responseEntity = new ResponseEntity<>(products, HttpStatus.OK);
		return responseEntity;
	}
	
	@DeleteMapping("/products/pname/{pname}")
	public ResponseEntity<String> deleteByPname(@PathVariable("pname") String pname) {
		ResponseEntity<String> responseEntity = null;
		boolean status = service.deleteByPname(pname);
		if(status) {
			responseEntity = new ResponseEntity<>(environment.getProperty("pms.delete.success"), HttpStatus.OK);
		}
		return responseEntity;
	}
	
}
