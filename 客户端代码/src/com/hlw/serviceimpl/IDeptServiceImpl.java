package com.hlw.serviceimpl;

import java.util.List;

import com.hlw.dao.IDeptDao;
import com.hlw.daoimpl.IDeptDaoImpl;
import com.hlw.entries.Question;
import com.hlw.service.IDeptService;

public class IDeptServiceImpl implements IDeptService {
	private IDeptDao iDeptDao;
	
	public IDeptServiceImpl() {
		iDeptDao = new IDeptDaoImpl();
	}

	@Override
	public List<Question> getDepts() {
		return iDeptDao.getDepts();
	}

}
