package com.girish.hibernate.restclient;

public class Category {

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getTotal_items_in_this_category() {
		return total_items_in_this_category;
	}
	public void setTotal_items_in_this_category(long total_items_in_this_category) {
		this.total_items_in_this_category = total_items_in_this_category;
	}
	public String getPath_from_root() {
		return path_from_root;
	}
	public void setPath_from_root(String path_from_root) {
		this.path_from_root = path_from_root;
	}
	public String getChildren_categories() {
		return children_categories;
	}
	public void setChildren_categories(String children_categories) {
		this.children_categories = children_categories;
	}
	public String getSettings() {
		return settings;
	}
	public void setSettings(String settings) {
		this.settings = settings;
	}
	private String id;
	private String name;
	private long total_items_in_this_category;
	private String path_from_root;
	private String children_categories;
	private String settings;
}
