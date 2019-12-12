package com.ibm.shopping.beans;

public class Category {
	private int catId;
	private String catName, catDesc, addedDate;
	
	public Category() {
		
	}
	
	public Category(int catId, String catName, String catDesc, String addedDate) {
		this.catId = catId;
		this.catName = catName;
		this.catDesc = catDesc;
		this.addedDate = addedDate;
	}

	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public String getCatDesc() {
		return catDesc;
	}
	public void setCatDesc(String catDesc) {
		this.catDesc = catDesc;
	}
	public String getAddedDate() {
		return addedDate;
	}
	public void setAddedDate(String addedDate) {
		this.addedDate = addedDate;
	}
	
}
