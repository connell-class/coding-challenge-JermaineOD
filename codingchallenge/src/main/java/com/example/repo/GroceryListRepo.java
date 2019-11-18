package com.example.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.model.GroceryItem;
import com.example.model.GroceryList;



public interface GroceryListRepo  extends CrudRepository<GroceryList, Integer>{
	
	List<GroceryItem> findAllName(String name);
	GroceryItem findbyGin(int gin);
	

}
