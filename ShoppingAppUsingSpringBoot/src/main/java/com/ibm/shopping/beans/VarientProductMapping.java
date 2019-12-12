package com.ibm.shopping.beans;

public class VarientProductMapping {
	private int mappingId, varientId, prodId, price;

	public VarientProductMapping() {
	
	}

	public VarientProductMapping(int mappingId, int varientId, int prodId, int price) {
		this.mappingId = mappingId;
		this.varientId = varientId;
		this.prodId = prodId;
		this.price = price;
	}

	public int getMappingId() {
		return mappingId;
	}

	public void setMappingId(int mappingId) {
		this.mappingId = mappingId;
	}

	public int getVarientId() {
		return varientId;
	}

	public void setVarientId(int varientId) {
		this.varientId = varientId;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
