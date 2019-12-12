package com.ibm.shopping.beans;

public class Product {
	private int prodId, subCatId, stock, brandId;
	private String prodName, prodDesc, modelNo;

	public Product() {

	}

	public Product(int prodId, int subCatId, int stock, int brandId, String prodName, String prodDesc, String modelNo) {
		this.prodId = prodId;
		this.subCatId = subCatId;
		this.stock = stock;
		this.brandId = brandId;
		this.prodName = prodName;
		this.prodDesc = prodDesc;
		this.modelNo = modelNo;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public int getSubCatId() {
		return subCatId;
	}

	public void setSubCatId(int subCatId) {
		this.subCatId = subCatId;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdDesc() {
		return prodDesc;
	}

	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

}
