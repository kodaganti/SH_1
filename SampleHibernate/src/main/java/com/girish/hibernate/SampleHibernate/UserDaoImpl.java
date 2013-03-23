package com.girish.hibernate.SampleHibernate;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao{

	public void save(User stock) {
		getHibernateTemplate().save(stock);
	}

	public void update(User stock) {
		getHibernateTemplate().update(stock);

	}

	public void delete(User stock) {
		getHibernateTemplate().delete(stock);

	}

	public User findByStockCode(String stockCode) {
		List list = getHibernateTemplate().find(
                "from Stock where Name=?",stockCode
          );
	return (User)list.get(0);
	}
}