package com.iac.vcb.market.service;

import java.util.List;

import com.iac.vcb.market.entity.TestDBEntity;

public interface ITestDBService {
	public List<TestDBEntity> loadAll();

	public boolean saveEntity(TestDBEntity user);
}
