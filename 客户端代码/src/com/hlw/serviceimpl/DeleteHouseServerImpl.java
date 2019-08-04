package com.hlw.serviceimpl;

import java.util.List;

import com.hlw.dao.IDeleteHouseDao;
import com.hlw.daoimpl.DeleteHouseDaoImpl;
import com.hlw.entries.House;
import com.hlw.entries.PageInfo;
import com.hlw.service.IDeleteHouseServer;

public class DeleteHouseServerImpl implements IDeleteHouseServer{
	IDeleteHouseDao deleteHouseDao;
	
	public DeleteHouseServerImpl() {
		super();
		deleteHouseDao = new DeleteHouseDaoImpl();
	}
	@Override
	public List<House> queryByPage(String cpage) {
		if("".equals(cpage)||null==cpage){
			cpage="1";
		}
		int cp=Integer.parseInt(cpage);
		return deleteHouseDao.queryByPage(cp);
	}

	@Override
	public PageInfo queryByPage1(String cpage) {
		if("".equals(cpage)||null==cpage)
			cpage="1";
		System.out.println("safeafa");
		return deleteHouseDao.queryByPage1(cpage);
	}

	@Override
	public int deleteById(String memberphone) {
		// TODO Auto-generated method stub
		return deleteHouseDao.deleteById(memberphone);
	}

	@Override
	public int batchDelete(String ids) {
		// TODO Auto-generated method stub
		return deleteHouseDao.batchDelete(ids);
	}
	
	
}
