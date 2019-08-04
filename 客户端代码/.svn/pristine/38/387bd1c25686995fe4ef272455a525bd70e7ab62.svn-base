package com.hlw.serviceimpl;

import java.util.List;

import com.hlw.dao.MemberDao;
import com.hlw.daoimpl.IMemberDaoImpl;
import com.hlw.entries.Member;
import com.hlw.service.IMemberService;

public class MemberServiceImpl implements IMemberService{
	MemberDao memberDao;
	public MemberServiceImpl() {
		memberDao = new IMemberDaoImpl();
	}
	public Member login(Member member){
		Member m = memberDao.login(member);
		return m;
	}
	public Member getMemberByid(String memberphone){
		return memberDao.getMemberByid(memberphone);
	}
}
