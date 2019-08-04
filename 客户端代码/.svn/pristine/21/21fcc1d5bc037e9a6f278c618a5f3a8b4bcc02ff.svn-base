package com.hlw.daoimpl;

import java.util.List;

import com.hlw.dao.IApplyDao;
import com.hlw.entries.ChangeApply;
import com.hlw.entries.House;
import com.rock.util.JDBCUtil;

public class IApplyDaoImpl implements IApplyDao{
	JDBCUtil util;
	public IApplyDaoImpl(){
		util=new JDBCUtil();
	} 
	
	public int alterApply(ChangeApply changeapply) {
		String str = changeapply.getCaid();
		// TODO Auto-generated method stub
		String sql = "update ChangeApply set cacity=? where caid='"+str+"'";                             
		return util.runSql(sql, changeapply.getCacity());
	}
	public int alterAddress(ChangeApply changeapply) {
		String str = changeapply.getCaid();
		// TODO Auto-generated method stub
		String sql = "update ChangeApply set caddress=? where caid='"+str+"'";                             
		return util.runSql(sql, changeapply.getCaddress());
	}
	public int alterstartTime(ChangeApply changeapply) {
		String str = changeapply.getCaid();
		// TODO Auto-generated method stub
		String sql = "update ChangeApply set castarttime=? where caid='"+str+"'";                             
		return util.runSql(sql, changeapply.getCastarttime());
	}
	public int alteracomplishTime(ChangeApply changeapply) {
		String str = changeapply.getCaid();
		// TODO Auto-generated method stub
		String sql = "update ChangeApply set cacomplishtime=? where caid='"+str+"'";                             
		return util.runSql(sql, changeapply.getCacomplishtime());
	}
	public ChangeApply getChangeApplyById(String phone) {
		return util.queryById(ChangeApply.class, "select * from ChangeApply where caid=?", phone);
	}

}
