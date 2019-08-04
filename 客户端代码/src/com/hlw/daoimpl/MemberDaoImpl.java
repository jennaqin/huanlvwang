package com.hlw.daoimpl;

import java.util.List;

import com.hlw.dao.IMemberDao;
import com.hlw.entries.Member;
import com.hlw.entries.PageInfo;
import com.rock.util.JDBCUtil;

public class MemberDaoImpl implements IMemberDao{
	JDBCUtil util;
	public MemberDaoImpl(){
		util = new JDBCUtil();
	}
	@Override
	public List<Member> queryByPage(int cp) {
		Member member = new Member();
		String str = member.getMemberphone();
		String sql = "select * from member where memberphone = '"+str+"'";
		System.out.println(util.queryAll(Member.class,sql));
		return  util.queryAll(Member.class,sql);
	}

	@Override
	public List<Member> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageInfo queryByPage1(String cpage) {
		List<Member> all=this.queryByPage(Integer.parseInt(cpage));
		PageInfo pi=new PageInfo();
		pi.setCpage(Integer.parseInt(cpage));
		pi.setMem(all);
		return pi;
	}

	@Override
	public Member getT2() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
