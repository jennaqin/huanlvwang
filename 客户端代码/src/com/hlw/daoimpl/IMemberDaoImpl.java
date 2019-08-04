package com.hlw.daoimpl;

import com.hlw.dao.MemberDao;
import com.hlw.entries.Member;
import com.rock.util.JDBCUtil;

public class IMemberDaoImpl implements MemberDao{
	JDBCUtil util;

	public IMemberDaoImpl() {
		util = new JDBCUtil();
	}

	@Override
	public Member login(Member member) {
		String sql = "select memberPhone,password from member where memberPhone=? and password=?";
		Member m=util.queryById(Member.class, sql, member.getMemberphone(),member.getPassword());
		System.out.println(m);
		return m;
	}
	public Member getMemberByid(String memberphone){
		return util.queryById(Member.class, "select * from member where memberphone=?", memberphone);
	}
}



