package com.developers.SalesSans.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.developers.SalesSans.entities.Category;

public class CategoryDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;

	Set<SubCategoryDTO> subcategories = new HashSet<>();

	public CategoryDTO() {
	}

	public CategoryDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public CategoryDTO(Category entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		entity.getSubCategories().forEach(subcat -> this.subcategories.add(new SubCategoryDTO(subcat)));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<SubCategoryDTO> getSubcategories() {
		return subcategories;
	}
}
