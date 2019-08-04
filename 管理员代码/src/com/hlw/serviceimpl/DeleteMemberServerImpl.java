package com.hlw.serviceimpl;

import java.util.List;

import com.hlw.dao.IDeleteMemberDao;
import com.hlw.daoimpl.DeleteMemberDaoImpl;
import com.hlw.entries.Member;
import com.hlw.entries.PageInfo;
import com.hlw.service.IDeleteMemberServer;

public class DeleteMemberServerImpl implements IDeleteMemberServer{

	IDeleteMemberDao iDeleteMemberDao;
	public DeleteMemberServerImpl(){
		iDeleteMemberDao=new DeleteMemberDaoImpl();
	}
	@Override
	public List<Member> queryByPage(String cpage) {
		// TODO Auto-generated method stub
		if("".equals(cpage)||null==cpage){
			cpage="1";
		}
		int cp=Integer.parseInt(cpage);
		return iDeleteMemberDao.queryByPage(cp);
	}

	@Override
	public PageInfo queryByPage1(String cpage) {
		if("".equals(cpage)||null==cpage)
			cpage="1";
		System.out.println("safeafa");
		return iDeleteMemberDao.queryByPage1(cpage);
	}

	@Override
	public int deleteById(String memberphone) {
		// TODO Auto-generated method stub
		return iDeleteMemberDao.deleteById(memberphone); 
	}
}
