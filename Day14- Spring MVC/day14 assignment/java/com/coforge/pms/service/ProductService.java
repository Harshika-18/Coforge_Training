package com.coforge.pms.service;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.coforge.pms.model.Product;

@Service
public class ProductService {
	
	private HashMap<Integer, Product> map = new HashMap<>();

	public boolean createProduct(Product product) {
		if(map.containsKey(product.getPid())) {
			return false;
		}
		map.put(product.getPid(), product);
		return true;
	}
	
	public boolean updateProduct(Product product) {
		if(map.containsKey(product.getPid())) {
			map.put(product.getPid(), product);
			return true;
		}
		return false;
		
	}
	
	public boolean deleteProduct(int pid) {
		if(map.containsKey(pid)) {
			map.remove(pid);
			return true;
		}
		return false;
	}

	public Product findProduct(int pid) {
		if(map.containsKey(pid)) {
			return map.get(pid);
		}
		return null;
	}

	public HashMap<Integer,Product> findAllProduct() {
		return map;
	}
}
