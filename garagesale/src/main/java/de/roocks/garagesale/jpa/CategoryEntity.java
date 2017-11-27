package de.roocks.garagesale.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import de.roocks.garagesale.model.Category;

@Entity
@Table (name = "category")
public class CategoryEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column (name = "name")
	private String name;
	@Column (name = "description")
	private String description;
	
	public CategoryEntity() {
		super();
	}
	
	public CategoryEntity(Category category) {
		super();
		this.name = category.getName();
		this.description = category.getDescription();
	}
	// getters/setters
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
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
}
