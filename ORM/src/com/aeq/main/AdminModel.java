package com.aeq.main;

public class AdminModel {
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "AdminModel [id=" + id + ", name=" + name + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
