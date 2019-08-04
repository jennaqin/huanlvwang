package com.hlw.daoimpl;

import java.util.List;

import com.hlw.dao.IDeleteMemberDao;
import com.hlw.entries.Member;
import com.hlw.entries.PageInfo;
import com.rock.util.JDBCUtil;

public class DeleteMemberDaoImpl implements IDeleteMemberDao{
	JDBCUtil util;
	
	public DeleteMemberDaoImpl(){
		util= new JDBCUtil();
	}
	@Override
	public List<Member> queryByPage(int cp) {
		String sql = "select * from (select t.*, rownum rn from member t where rownum <="+cp*20+") where rn >"+(cp-1)*20;
		System.out.println(util.queryAll(Member.class,sql));
		return  util.queryAll(Member.class,sql);
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
	public int deleteById(String memberphone) {
		String sql="delete from member where memberphone=?";
		String sql1="insert into membercopy(select * from member where memberphone=?)";
		util.runSql(sql1, memberphone);
		return util.runSql(sql, memberphone);
	}
}
