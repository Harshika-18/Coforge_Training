package com.coforge.pms.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coforge.pms.model.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product, Integer>{

	List<Product> findByPname(String pname);

	int deleteByPname(String pname);

	List<Product> findByPrice(int price);

	List<Product> findByQuantity(int quantity);

	@Query("from Product where quantity = ?1")
	List<Product> getProductsByQuantity(int quantity);

	
}