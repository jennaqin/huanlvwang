package com.hlw.daoimpl;

import java.util.List;

import com.hlw.dao.IChangeDao;
import com.hlw.entries.ChangeApply;
import com.hlw.entries.PageInfo;
import com.rock.util.JDBCUtil;

public class ChangeDaoImpl implements IChangeDao{
	JDBCUtil util;
	public ChangeDaoImpl(){
		util=new JDBCUtil();
	}
	
	/*@Override
	public List<ChangeApply> selectAll() {
		// TODO Auto-generated method stub
		return util.queryAll(ChangeApply.class,"select * from changeapply");
	}*/

	@Override
	public List<ChangeApply> queryByPage(int cp) {
		//String sql="select * from (select t.*, rownum rn from (select * from changeapply by caid asc)t where rownum <= "+cp*20+")where rn > "+(cp-1)*20;

		String sql = "select * from (select t.*, rownum rn from changeapply t where rownum <="+cp*20+") where rn >"+(cp-1)*20;
		System.out.println(util.queryAll(ChangeApply.class,sql));
		return  util.queryAll(ChangeApply.class,sql);
	}
	
	@Override
	public PageInfo queryByPage1(String cpage) {
		List<ChangeApply> all=this.queryByPage(Integer.parseInt(cpage));
		PageInfo pi=new PageInfo();
		pi.setCpage(Integer.parseInt(cpage));
		pi.setHos(all);
		return pi;
	}
	@Override
	public int deleteById(String caid) {
		String sql="delete from changeapply where caid=?";
		String sql1="insert into changeapplycopy(select * from changeapply where caid=?)";
		util.runSql(sql1, caid);
		return util.runSql(sql, caid);
	}
	@Override
	public int batchDelete(String ids) {
		String sql="delete from changeapply where caid in("+ids+")";
		System.out.println("ChangeDaoImpl.batchDelete()"+sql);
		String sql1="insert into changeapplycopy(select * from changeapply where caid in("+ids+"))";
		util.runSql(sql1);
		return util.runSql(sql);
	}

	
	
	
}
