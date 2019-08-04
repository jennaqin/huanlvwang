package com.hlw.serviceimpl;
import com.hlw.dao.IMemberDao;
import com.hlw.daoimpl.MemberDaoImpl;
import com.hlw.service.IMemberService;

public class MemberServiceImpl implements IMemberService{
	IMemberDao memberDao;
	public MemberServiceImpl() {
		memberDao = new MemberDaoImpl();
	}
	public int Count(){
		int m = memberDao.Count();
		return m;
	}
	public int eCount() {
		int b = memberDao.eCount();
		return b;
	}
}
