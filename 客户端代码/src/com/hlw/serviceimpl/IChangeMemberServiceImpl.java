package com.hlw.serviceimpl;

import java.util.List;

import com.hlw.dao.IChangeMemberDao;
import com.hlw.daoimpl.IChangeMemberDaoImpl;
import com.hlw.entries.Member;
import com.hlw.service.IChangeMemberService;


public class IChangeMemberServiceImpl implements IChangeMemberService {
	IChangeMemberDao icmdao;
	public IChangeMemberServiceImpl() {
		icmdao = new IChangeMemberDaoImpl();
	}

	public int alterPasswd(Member member){
		return icmdao.alterPasswd(member);
	}
	public int alterMemberid(Member member){
		return icmdao.alterMemberid(member);
	}
	public int alteranswer(Member member){
		return icmdao.alteranswer(member);
	}
	public int alterquestionid(Member member){
		return icmdao.alterquestionid(member);
	}
}
