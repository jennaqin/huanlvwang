package com.hlw.serviceimpl;

import java.util.List;

import com.hlw.dao.IMemberDao;
import com.hlw.daoimpl.MemberDaoImpl;
import com.hlw.entries.Member;
import com.hlw.entries.PageInfo;
import com.hlw.service.IMemberServer;

public class MemberServerImpl1 implements IMemberServer{
	IMemberDao iMemberDao;
	public MemberServerImpl1(){
		iMemberDao = new MemberDaoImpl();
	}
	@Override
	public List<Member> queryByPage(String cpage) {
		if("".equals(cpage)||null==cpage){
			cpage="1";
		}
		int cp=Integer.parseInt(cpage);
		return iMemberDao.queryByPage(cp);
	}
	@Override
	public PageInfo queryByPage1(String cpage) {
		if("".equals(cpage)||null==cpage)
			cpage="1";
		System.out.println("safeafa");
		return iMemberDao.queryByPage1(cpage);
	}
	@Override
	public Member getT2() {
		// TODO Auto-generated method stub
		return iMemberDao.getT2();
	}
	
	
}
