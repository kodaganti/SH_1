package com.girish.hibernate.SampleHibernate;

public class UserBoImpl implements UserBo{

	UserDao userDao;
	 
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void save(User user) {
		userDao.save(user);
	}

	public void update(User user) {
		
	}

	public void delete(User user) {
		
	}

	public User findByStockCode(String stockCode) {
		return null;
	}
}