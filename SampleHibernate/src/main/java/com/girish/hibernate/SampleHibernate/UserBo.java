package com.girish.hibernate.SampleHibernate;

public interface UserBo {

	void save(User stock);

	void update(User stock);

	void delete(User stock);

	User findByStockCode(String stockCode);
}
