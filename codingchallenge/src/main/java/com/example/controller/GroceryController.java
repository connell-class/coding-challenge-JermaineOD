package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.GroceryItem;
import com.example.repo.GroceryRepo;

public class GroceryController {

	@Autowired
	GroceryRepo gR;
	
	@GetMapping(value="getAll")
	public @ResponseBody List<GroceryItem> getAllGrocery(){
		return (List<GroceryItem>) gR.findAll();
		
	}
	
	@PutMapping(value="/saveGross")
	public @ResponseBody boolean saveGrocery(@RequestBody GroceryItem groc){
		gR.save(groc);
		return true;
	}
	
}
