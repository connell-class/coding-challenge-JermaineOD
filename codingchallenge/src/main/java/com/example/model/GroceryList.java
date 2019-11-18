package com.example.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GroceryItemsList")
public class GroceryList {


	@Column
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int glin;
	
	
	private List<GroceryItem> gli;


	public int getGlin() {
		return glin;
	}


	public void setGlin(int glin) {
		this.glin = glin;
	}


	public List<GroceryItem> getGli() {
		return gli;
	}


	public void setGli(List<GroceryItem> gli) {
		this.gli = gli;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gli == null) ? 0 : gli.hashCode());
		result = prime * result + glin;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroceryList other = (GroceryList) obj;
		if (gli == null) {
			if (other.gli != null)
				return false;
		} else if (!gli.equals(other.gli))
			return false;
		if (glin != other.glin)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "GroceryList [glin=" + glin + ", gli=" + gli + "]\n";
	}


	public GroceryList(int glin, List<GroceryItem> gli) {
		super();
		this.glin = glin;
		this.gli = gli;
	}


	public GroceryList() {
		super();
	}
	
	
	
}
