package com.ibm.shopping.beans;

public class PhotoGallery {
	private int photoId, prodId;
	private String photoPath;
	
	public PhotoGallery() {
	
	}
	
	public PhotoGallery(int photoId, int prodId, String photoPath) {
		this.photoId = photoId;
		this.prodId = prodId;
		this.photoPath = photoPath;
	}

	public int getPhotoId() {
		return photoId;
	}
	public void setPhotoId(int photoId) {
		this.photoId = photoId;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getPhotoPath() {
		return photoPath;
	}
	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}
	
}
