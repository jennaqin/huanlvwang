package com.hlw.serviceimpl;

import com.hlw.dao.IManageDao;
import com.hlw.daoimpl.ManageDaoImpl;
import com.hlw.entries.Manage;
import com.hlw.service.IManageService;

public class ManageServiceImpl implements IManageService{
	IManageDao manageDao;
	public ManageServiceImpl() {
		manageDao = new ManageDaoImpl();
	}
	public Manage login(Manage manage){
		Manage m = manageDao.login(manage);
		return m;
	}
}
