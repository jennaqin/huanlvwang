package com.hlw.serviceimpl;

import java.util.List;

import com.hlw.dao.IChangeDao;
import com.hlw.daoimpl.ChangeDaoImpl;
import com.hlw.entries.ChangeApply;
import com.hlw.entries.PageInfo;
import com.hlw.service.IChangeServer;

public class ChangeServerImpl implements IChangeServer{
	private IChangeDao changeDao;
	public ChangeServerImpl(){
		changeDao = new ChangeDaoImpl();
	}
	/*@Override
	public List<ChangeApply> allHouse() {
		// TODO Auto-generated method stub
		return changeDao.selectAll();
	}*/
	
	@Override
	public List<ChangeApply> queryByPage(String cpage) {
		if("".equals(cpage)||null==cpage){
			cpage="1";
		}
		int cp=Integer.parseInt(cpage);
		return changeDao.queryByPage(cp);
	}
	
	@Override
	public PageInfo queryByPage1(String cpage) {
		if("".equals(cpage)||null==cpage)
			cpage="1";
		System.out.println("safeafa");
		return changeDao.queryByPage1(cpage);
	}
	@Override
	public int deleteById(String caid) {
		// TODO Auto-generated method stub
		return changeDao.deleteById(caid);
	}
	@Override
	public int batchDelete(String ids) {
		// TODO Auto-generated method stub
		return changeDao.batchDelete(ids);
	}
}
