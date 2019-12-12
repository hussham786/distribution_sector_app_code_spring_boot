package com.ibm.shopping.beans;

import java.util.List;

public class SubCategory {
	private int subCatId, catId;
	private String subCatName, subCatDesc, addedDate;
	List<Category> catList;
	public SubCategory() {
		
	}
	
	public SubCategory(int subCatId, int catId, String subCatName, String subCatDesc, String addedDate, List<Category> catList) {
		this.subCatId = subCatId;
		this.catId = catId;
		this.subCatName = subCatName;
		this.subCatDesc = subCatDesc;
		this.addedDate = addedDate;
		this.catList = catList;
	}
	
	public List<Category> getCatList() {
		return catList;
	}

	public void setCatList(List<Category> catList) {
		this.catList = catList;
	}

	public int getSubCatId() {
		return subCatId;
	}
	public void setSubCatId(int subCatId) {
		this.subCatId = subCatId;
	}
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public String getSubCatName() {
		return subCatName;
	}
	public void setSubCatName(String subCatName) {
		this.subCatName = subCatName;
	}
	public String getSubCatDesc() {
		return subCatDesc;
	}
	public void setSubCatDesc(String subCatDesc) {
		this.subCatDesc = subCatDesc;
	}
	public String getAddedDate() {
		return addedDate;
	}
	public void setAddedDate(String addedDate) {
		this.addedDate = addedDate;
	}
	
}
