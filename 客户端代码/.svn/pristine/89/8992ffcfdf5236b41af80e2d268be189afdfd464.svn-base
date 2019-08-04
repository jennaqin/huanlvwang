package com.hlw.daoimpl;

import java.util.List;

import com.hlw.dao.IDeleteHouseDao;
import com.hlw.entries.ChangeApply;
import com.hlw.entries.House;
import com.hlw.entries.PageInfo;
import com.rock.util.JDBCUtil;

public class DeleteHouseDaoImpl implements IDeleteHouseDao{
	JDBCUtil util;
	public DeleteHouseDaoImpl() {
		util = new JDBCUtil();
	}
	@Override
	public List<House> queryByPage(int cp) {
		String sql = "select phone,housecity,houseaddr,housearea,housebedroom,househallroom,housebalconyroom,houserestroom,housekitchen,houselivingnum,housebedroomnum,housebeginliving,houseendliving from (select t.*, rownum rn from house t where rownum <="+cp*20+") where rn >"+(cp-1)*20;
		System.out.println(util.queryAll(House.class,sql));
		return  util.queryAll(House.class,sql);
	}
	@Override
	public PageInfo queryByPage1(String cpage) {
		List<House> all=this.queryByPage(Integer.parseInt(cpage));
		PageInfo pi=new PageInfo();
		pi.setCpage(Integer.parseInt(cpage));
		pi.setHos1(all);
		return pi;
	}
	@Override
	public int deleteById(String phone) {
		String sql="delete from house where phone =?";
		String sql1="insert into housecopy(select * from house where phone=?)";
		util.runSql(sql1, phone);
		return util.runSql(sql, phone );
	}
	@Override
	public int batchDelete(String ids) {
		String sql="delete from house where phone in("+ids+")";
		System.out.println("DeleteHouseDaoImpl.batchDelete()"+sql);
		String sql1="insert into housecopy(select * from house where phone in("+ids+"))";
		util.runSql(sql1);
		return util.runSql(sql);
	}
	
}
