package com.example.demo.entity;

import java.util.Objects;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "category")
public class Category {
	
	
	@Id
    @Column(name ="category_id")
	private int categoryId;
	
	// title
	@Column(name ="title")
	private String title;
		 	 
	//slug
	@Column(name ="slug")
	private String slug;
		 
	//created_at
	@Column(name = "content")
	private String contentCategory;	
	
	public Category() {
		super();
	}

	public Category(int categoryId, String title, String slug, String contentCategory) {
		super();
		this.categoryId = categoryId;
		this.title = title;
		this.slug = slug;
		this.contentCategory = contentCategory;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getContentCategory() {
		return contentCategory;
	}

	public void setContentCategory(String contentCategory) {
		this.contentCategory = contentCategory;
	}
	
	

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", title=" + title + ", slug=" + slug + ", contentCategory="
				+ contentCategory + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(categoryId, contentCategory, slug, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		return categoryId == other.categoryId && Objects.equals(contentCategory, other.contentCategory)
				&& Objects.equals(slug, other.slug) && Objects.equals(title, other.title);
	}
	
	
	
}
