package com.coforge.pms.service;

import java.util.List;
import java.util.Optional;

import com.coforge.pms.exception.InvalidProductObjectException;
import com.coforge.pms.exception.ProductNotFoundException;
import com.coforge.pms.model.Product;



public interface ProductService {

	public boolean saveProduct(Product employee);

	public boolean updateProduct(int eid, Product employee);

	public boolean deleteProduct(int eid);

	public Optional<Product> findProduct(int eid);

	public List<Product> findAllProducts();

	public List<Product> findByPname(String ename);
	
	public boolean deleteByPname(String ename);

	public List<Product> findByPrice(int price);

	public List<Product> findByQuantity(int quantity);

}
