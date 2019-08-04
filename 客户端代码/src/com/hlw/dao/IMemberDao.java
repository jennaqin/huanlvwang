package com.hlw.dao;

import java.util.List;

import com.hlw.entries.Member;
import com.hlw.entries.PageInfo;

public interface IMemberDao {
	public List<Member> queryByPage(int cp);
	public List<Member> selectAll();
	public PageInfo queryByPage1(String cpage);
	public Member getT2();
}
