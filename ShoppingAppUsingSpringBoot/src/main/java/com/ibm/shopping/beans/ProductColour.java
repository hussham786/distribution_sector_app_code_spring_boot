package com.ibm.shopping.beans;

public class ProductColour {
	private int colourId, prodId;
	private String colour;
	
	public ProductColour() {
		
	}
	
	public ProductColour(int colourId, int prodId, String colour) {
		this.colourId = colourId;
		this.prodId = prodId;
		this.colour = colour;
	}

	public int getColourId() {
		return colourId;
	}
	public void setColourId(int colourId) {
		this.colourId = colourId;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
}
