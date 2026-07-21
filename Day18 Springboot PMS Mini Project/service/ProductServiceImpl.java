package com.coforge.pms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coforge.pms.exception.InvalidProductObjectException;
import com.coforge.pms.exception.ProductNotFoundException;
import com.coforge.pms.model.Product;
import com.coforge.pms.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService{

	private ProductRepo repo;
	private Environment environment;
	
	@Autowired
	public ProductServiceImpl(ProductRepo repo,Environment environment) {
		super();
		this.repo = repo;
		this.environment = environment;
	}

	@Override
	public boolean saveProduct(Product product){
		repo.save(product); 
		return true;	
	}

	@Override
	public boolean updateProduct(int pid, Product product) {
		if(!repo.existsById(pid)) {
			throw new ProductNotFoundException(environment.getProperty("pms.invalid.product-notfound"));
		}
		repo.save(product);
		return true;
	}

	@Override
	public boolean deleteProduct(int pid) {
		if(!repo.existsById(pid)) {
			throw new ProductNotFoundException(environment.getProperty("pms.invalid.product-notfound"));
		}
		repo.deleteById(pid);
		return true;
	}

	@Override
	public Optional<Product> findProduct(int pid) {
		if(!repo.existsById(pid)) {
			throw new ProductNotFoundException(environment.getProperty("pms.invalid.product-notfound"));
		}
		return repo.findById(pid);
	}

	@Override
	public List<Product> findAllProducts() {
		List<Product> products= (List<Product>) repo.findAll();
		return products;
	}

	@Override
	public List<Product> findByPname(String pname) {
		List<Product> products = null;
			products = repo.findByPname(pname);
			if(products.isEmpty()) {
				throw new ProductNotFoundException(environment.getProperty("pms.invalid.product-notfound"));
			}
			return products;
	}

	@Override
	@Transactional
	public boolean deleteByPname(String ename)  {
		int n = repo.deleteByPname(ename);
		if(n == 0) {
			throw new ProductNotFoundException(environment.getProperty("pms.invalid.product-notfound"));
		}
		return true;
	}

	@Override
	public List<Product> findByPrice(int price) {
		List<Product> products = null;
		products = repo.findByPrice(price);
		if(products.isEmpty()) {
			throw new ProductNotFoundException(environment.getProperty("pms.invalid.product-notfound"));
		}
		return products;
	}

	@Override
	public List<Product> findByQuantity(int quantity) {
		List<Product> products = null;
		products = repo.findByQuantity(quantity);
		if(products.isEmpty()) {
			throw new ProductNotFoundException(environment.getProperty("pms.invalid.product-notfound"));
		}
		return products;
	}
}
