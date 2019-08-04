package com.hlw.serviceimpl;

import com.hlw.dao.FindPasswordDao;
import com.hlw.daoimpl.FindPasswordDaoImpl;
import com.hlw.entries.Member;
import com.hlw.entries.Question;
import com.hlw.service.FindPasswordServer;

public class FindPasswordServerImpl implements FindPasswordServer{

	FindPasswordDao findPasswordDao;
	
	public FindPasswordServerImpl() {
		findPasswordDao= new FindPasswordDaoImpl();
	}
	
	@Override
	public String findQuestion(String memberphone) {
		Member m= findPasswordDao.findQuestion(memberphone);
		return m.getQues();
	}
	@Override
	public String findPwd(String memberphone, String answer) {
		// TODO Auto-generated method stub
		return findPasswordDao.findPwd(memberphone, answer);
	}
	
}
