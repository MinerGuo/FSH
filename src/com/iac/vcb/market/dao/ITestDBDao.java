package com.iac.vcb.market.dao;

import java.util.List;

import com.iac.vcb.market.entity.TestDBEntity;

public interface ITestDBDao {
	public List<TestDBEntity> loadAll();
	
	public boolean save(TestDBEntity user);
}
