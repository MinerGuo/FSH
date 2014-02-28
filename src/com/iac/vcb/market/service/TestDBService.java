package com.iac.vcb.market.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iac.vcb.market.dao.ITestDBDao;
import com.iac.vcb.market.entity.TestDBEntity;

@Service
@Transactional
public class TestDBService implements ITestDBService {

	@Resource
	private ITestDBDao testDBDao;

	@Override
	public List<TestDBEntity> loadAll() {
		return testDBDao.loadAll();
	}

	@Transactional(readOnly = false)
	@Override
	public boolean saveEntity(TestDBEntity user) {
		return testDBDao.save(user);
	}

}
