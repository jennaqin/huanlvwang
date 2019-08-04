package com.hlw.daoimpl;

import com.hlw.dao.IMemberDao;
import com.rock.util.JDBCUtil;

public class MemberDaoImpl implements IMemberDao{
	JDBCUtil util;

	public MemberDaoImpl() {
		util = new JDBCUtil();
	}

	@Override
	public int Count() {
		String sql = "SELECT COUNT (*) FROM member";
		
		int a=util.getCount(sql);
		System.out.println(a);
		return a;
	}

	@Override
	public int eCount() {
		util = new JDBCUtil();
		String sql = "SELECT COUNT (* ) FROM email";
		int b=util.getCount(sql);
		System.out.println(b);
		return b;
	}

	
}
