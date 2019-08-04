package com.hlw.daoimpl;


import com.hlw.dao.IManageDao;
import com.hlw.entries.Manage;
import com.rock.util.JDBCUtil;

public class ManageDaoImpl implements IManageDao {
	JDBCUtil util;

	public ManageDaoImpl() {
		util = new JDBCUtil();
	}
	@Override
	public Manage login(Manage manage) {
		String sql = "select email,password from manage where email=? and password=?";
		Manage m=util.queryById(Manage.class, sql, manage.getEmail(),manage.getPassword());
		System.out.println(m);
		return m;
	}
	
}
