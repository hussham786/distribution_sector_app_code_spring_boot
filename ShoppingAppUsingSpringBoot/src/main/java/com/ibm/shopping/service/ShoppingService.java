package com.ibm.shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.shopping.beans.Category;
import com.ibm.shopping.beans.SubCategory;
import com.ibm.shopping.dao.ShoppingDao;


@Service
public class ShoppingService {
	@Autowired
	ShoppingDao dao;
	
	public boolean checkUser(String email, String password) {
		
		return dao.checkUser(email, password);
	}

	public void addCategory(Category category) {
		dao.addCategory(category);
	}

	public List<Category> fetchAllCategory() {
		
		return dao.fetchAllCategory();
	}

	public void editCategory(Category category, int catId) {
		dao.editCategory(category, catId);
		
	}

	public List<Category> fetchCatListBySearch(String searchData) {
		
		return dao.fetchCatListBySearch(searchData);
	}

	public void deleteCategory(int catId) {
		dao.deleteCategory(catId);
		
	}

	public void addSubCategory(SubCategory subCategory, int catId) {
		dao.addSubCategory(subCategory, catId);
		
	}

	public List<SubCategory> fetchAllSubCategory() {
		return dao.fetchAllSubCategory();
	}

	public void editSubCategory(SubCategory subCategory, int subCatId, int catId) {
		dao.editSubCategory(subCategory, subCatId, catId);
		
	}

	public List<SubCategory> fetchSubCatListBySearch(String searchData) {
		return dao.fetchSubCatListBySearch(searchData);
		
	}

}
