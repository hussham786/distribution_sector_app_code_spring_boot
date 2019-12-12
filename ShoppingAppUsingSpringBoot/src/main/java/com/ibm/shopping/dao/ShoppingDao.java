package com.ibm.shopping.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.ibm.shopping.beans.Category;
import com.ibm.shopping.beans.SubCategory;
import com.ibm.shopping.beans.User;

@Repository
public class ShoppingDao {

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

// Category section start ---------------------------------------------------------------------------------------->

	// Checking whether the user is an admin user or not
	public boolean checkUser(String email, String password) {
		String sql = "select * from User where email= :email and password= :password";
		boolean flag = false;
		SqlParameterSource parameterSource = new MapSqlParameterSource("email", email).addValue("password", password);
		List<User> userList = namedParameterJdbcTemplate.query(sql, parameterSource, new UserMapper());
		if (!userList.isEmpty())
			flag = true;
		return flag;
	}

	// User mapper
	class UserMapper implements RowMapper<User> {

		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			User user = new User(rs.getInt("userId"), rs.getInt("contactNumber"), rs.getString("fName"),
					rs.getString("lName"), rs.getString("email"), rs.getString("password"), rs.getString("address"),
					rs.getString("imgPath"));
			return user;
		}
	}

	// Adding a new Category
	public void addCategory(Category category) {
		String sql = "insert into Category(catName, catDesc) values(:catName, :catDesc)";
		SqlParameterSource parameterSource = new MapSqlParameterSource("catName", category.getCatName())
				.addValue("catDesc", category.getCatDesc());
		namedParameterJdbcTemplate.update(sql, parameterSource);

	}

	// Editing a particular category
	public void editCategory(Category category, int catId) {
		String sql = "update Category set catName = :catName, catDesc = :catDesc where catId = :catId";
		SqlParameterSource parameterSource = new MapSqlParameterSource("catName", category.getCatName())
				.addValue("catDesc", category.getCatDesc()).addValue("catId", catId);
		namedParameterJdbcTemplate.update(sql, parameterSource);
	}

	// Delete a particular category
	public void deleteCategory(int catId) {
		String sql = "delete from Category where catId = :catId";
		SqlParameterSource parameterSource = new MapSqlParameterSource("catId", catId);
		namedParameterJdbcTemplate.update(sql, parameterSource);
	}

	// Search category
	public List<Category> fetchCatListBySearch(String searchData) {
		String sql = "SELECT * FROM Category c WHERE c.catName OR c.catDesc OR c.catId LIKE :searchData";
		SqlParameterSource parameterSource = new MapSqlParameterSource("searchData", "%" + searchData + "%");
		return namedParameterJdbcTemplate.query(sql, parameterSource, new CategoryMapper());
	}

	// Fetching the category list
	public List<Category> fetchAllCategory() {
		String sql = "select * from Category";
		return namedParameterJdbcTemplate.query(sql, new CategoryMapper());
	}

	// Category mapper
	class CategoryMapper implements RowMapper<Category> {

		@Override
		public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
			Category category = new Category(rs.getInt("catId"), rs.getString("catName"), rs.getString("catDesc"),
					rs.getString("addedDate"));
			return category;
		}

	}

	// Fetching a particular category according to catId
	List<Category> fetchingCategoryByCatId(int catId) {
		String sql = "select * from Category where catId = :catId";
		SqlParameterSource parameterSource = new MapSqlParameterSource("catId", catId);
		return namedParameterJdbcTemplate.query(sql, parameterSource, new CategoryMapper());
	}

// Category section end ----------------------------------------------------------------------------------------->

// Sub Category section start ----------------------------------------------------------------------------------->

	// Adding a sub category
	public void addSubCategory(SubCategory subCategory, int catId) {
		String sql = "insert into SubCategory(catId, subCatName, subCatDesc) values(:catId, :subCatName, :subCatDesc)";
		SqlParameterSource parameterSource = new MapSqlParameterSource("catId", catId)
				.addValue("subCatName", subCategory.getSubCatName())
				.addValue("subCatDesc", subCategory.getSubCatDesc());
		namedParameterJdbcTemplate.update(sql, parameterSource);
	}

	// Update a sub category
	public void editSubCategory(SubCategory subCategory, int subCatId, int catId) {
		String sql = "update SubCategory set catId = :catId, subCatName = :subCatName, subCatDesc = :subCatDesc where subCatId = :subCatId";
		SqlParameterSource parameterSource = new MapSqlParameterSource("subCatName", subCategory.getSubCatName())
				.addValue("subCatDesc", subCategory.getSubCatDesc()).addValue("catId", catId)
				.addValue("subCatId", subCatId);
		namedParameterJdbcTemplate.update(sql, parameterSource);

	}

	// Searching a particular sub category
	public List<SubCategory> fetchSubCatListBySearch(String searchData) {
		String sql = "SELECT DISTINCT s.* FROM SubCategory s, Category c WHERE s.subCatName OR s.subCatDesc LIKE :searchData OR s.catId = (SELECT catId FROM Category WHERE catName LIKE :searchData LIMIT 0,1)";
		SqlParameterSource parameterSource = new MapSqlParameterSource("searchData", "%" + searchData + "%");
		return namedParameterJdbcTemplate.query(sql, parameterSource, new SubCategoryMapper());

	}

	// Sub Category mapper
	class SubCategoryMapper implements RowMapper<SubCategory> {

		@Override
		public SubCategory mapRow(ResultSet rs, int rowNum) throws SQLException {
			SubCategory subCategory = new SubCategory(rs.getInt("subCatId"), rs.getInt("catId"),
					rs.getString("subCatName"), rs.getString("subCatDesc"), rs.getString("addedDate"),
					fetchingCategoryByCatId(rs.getInt("catId")));
			return subCategory;
		}

	}

	// Fetching sub category list
	public List<SubCategory> fetchAllSubCategory() {
		String sql = "select * from SubCategory";
		return namedParameterJdbcTemplate.query(sql, new SubCategoryMapper());
	}

}
