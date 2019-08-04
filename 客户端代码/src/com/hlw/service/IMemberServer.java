package com.hlw.service;

import java.util.List;

import com.hlw.entries.Member;
import com.hlw.entries.PageInfo;

public interface IMemberServer {
	public List<Member> queryByPage(String cpage);
	public PageInfo queryByPage1(String cpage);
	public Member getT2();
}
