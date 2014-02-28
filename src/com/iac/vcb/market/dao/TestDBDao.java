package com.iac.vcb.market.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.iac.vcb.market.entity.TestDBEntity;

@Repository
public class TestDBDao extends MysqlDao implements ITestDBDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<TestDBEntity> loadAll() {
		return (List<TestDBEntity>) getCurrentSession().createQuery("from TestDBEntity").list();
	}

	@Override
	public boolean save(TestDBEntity user) {
		return getCurrentSession().save(user) == null ? false : true;

	}

}
