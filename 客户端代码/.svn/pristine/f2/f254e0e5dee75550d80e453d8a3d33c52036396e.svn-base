package com.hlw.serviceimpl;

import java.util.List;

import com.hlw.dao.IRegisterDao;
import com.hlw.daoimpl.IRegisterDaoImpl;
import com.hlw.entries.Member;
import com.hlw.entries.Register;
import com.hlw.service.IRegisterService;

public class IRegisterServiceImpl implements IRegisterService {
	IRegisterDao iRegisterDao = null;
	
	public IRegisterServiceImpl() {
		iRegisterDao = new IRegisterDaoImpl();
	}

	@Override
	public int save(Member m) {
		// TODO Auto-generated method stub
		return iRegisterDao.save(m);
	}

}
