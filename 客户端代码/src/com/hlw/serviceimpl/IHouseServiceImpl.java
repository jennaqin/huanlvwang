package com.hlw.serviceimpl;

import java.util.List;

import com.hlw.dao.IHouseDao;
import com.hlw.daoimpl.IHouseDaoImpl;
import com.hlw.entries.House;
import com.hlw.entries.Register;
import com.hlw.service.IHouseService;

public class IHouseServiceImpl implements IHouseService {
	IHouseDao iHouseDao;

	public IHouseServiceImpl() {
		iHouseDao = new IHouseDaoImpl();
	}

	

	@Override
	public int save(House h) {
		// TODO Auto-generated method stub
		return iHouseDao.save(h);
	}



	@Override
	public House getHouseById(String phone) {
		return iHouseDao.getHouseById(phone);
	}
	
	
	
}
