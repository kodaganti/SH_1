package com.girish.hibernate.SampleHibernate;

import java.io.Serializable;

public class User implements Serializable{

//	private static final long serialVersionUID = -7528600547308827179L;
	private int userId;
	private String name;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}