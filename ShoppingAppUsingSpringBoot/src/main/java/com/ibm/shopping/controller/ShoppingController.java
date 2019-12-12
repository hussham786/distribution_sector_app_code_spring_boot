package com.ibm.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.shopping.beans.Category;
import com.ibm.shopping.beans.SubCategory;
import com.ibm.shopping.service.ShoppingService;

@RestController
public class ShoppingController {
	@Autowired
	ShoppingService service;

	// Category
	// start------------------------------------------------------------------------------------->

	// Checking whether the user is admin or not
	@RequestMapping("/checkuser/{email}/{password}")
	boolean checkUser(@PathVariable("email") String email, @PathVariable("password") String password) {
		return service.checkUser(email, password);
	}

	// Adding a category
	@RequestMapping(method = RequestMethod.POST, value = "/category/add")
	void addCategory(@RequestBody Category category) {
		service.addCategory(category);
	}

	// Updating a particular category
	@RequestMapping(method = RequestMethod.PUT, value = "/category/edit/{id}")
	void editCategory(@RequestBody Category category, @PathVariable("id") int catId) {
		service.editCategory(category, catId);
	}

	// Deleting a particular category
	@RequestMapping(method = RequestMethod.DELETE, value = "/category/delete/{id}")
	void deleteCategory(@PathVariable("id") int catId) {
		service.deleteCategory(catId);
	}

	// Searching a particular category
	@RequestMapping("/category/search/{searchData}")
	List<Category> fetchCatListBySearch(@PathVariable("searchData") String searchData) {
		return service.fetchCatListBySearch(searchData);
	}

	// Fetching the category list
	@RequestMapping("/category/all")
	List<Category> fetchAllCategory() {
		return service.fetchAllCategory();
	}

	// Category
	// end--------------------------------------------------------------------------------------------->

	// Sub Category start
	// ------------------------------------------------------------------------------------>

	// Adding a sub category
	@RequestMapping(method = RequestMethod.POST, value = "/subcategory/add/{catId}")
	void addSubCategory(@RequestBody SubCategory subCategory, @PathVariable("catId") int catId) {
		service.addSubCategory(subCategory, catId);
	}

	// Updating a sub category
	@RequestMapping(method = RequestMethod.PUT, value = "/subcategory/edit/{id}/{catId}")
	void editSubCategory(@RequestBody SubCategory subCategory, @PathVariable("id") int subCatId,
			@PathVariable("catId") int catId) {
		service.editSubCategory(subCategory, subCatId, catId);
	}
	
	// Searching for a particular sub category
	@RequestMapping("/subcategory/search/{searchData}")
	List<SubCategory> fetchSubCatListBySearch(@PathVariable("searchData") String searchData){
		return service.fetchSubCatListBySearch(searchData);
	}

	// Fetching sub category list
	@RequestMapping("/subcategory/all")
	List<SubCategory> fetchAllSubCategory() {
		return service.fetchAllSubCategory();
	}
}
