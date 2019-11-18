package com.example.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.model.GroceryItem;

public interface GroceryRepo  extends CrudRepository<GroceryItem, Integer>{
	
	List<GroceryItem> findAllName(String name);
	GroceryItem findbyGin(int gin);
	

}
