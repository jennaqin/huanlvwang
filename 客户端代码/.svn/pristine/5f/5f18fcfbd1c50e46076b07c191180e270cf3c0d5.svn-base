package com.hlw.entries;

import java.util.List;

import com.rock.util.JDBCUtil;
//交换表
public class PageInfo {
	private int cpage;//当前页面
	private int pagesize;//每页显示几条数据
	private int count;//共有多少条数据
	private int count1;//house共有多少条数据
	private int count2;//member共有多少条记录
	private int maxpage;//共有多少页
	public List<ChangeApply> hos;
	public List<House> hos1;
	public List<Member> mem;
	
	
	public int getCount2() {
		String sql="select count(*) from member";
		JDBCUtil util=new JDBCUtil();
		System.out.println(util.getCount(sql));
		return util.getCount(sql);
	}
	public void setCount2(int count2) {
		this.count2 = count2;
	}
	public List<Member> getMem() {
		return mem;
	}
	public void setMem(List<Member> mem) {
		this.mem = mem;
	}
	public int getCpage() {
		return cpage;
	}
	public void setCpage(int cpage) {
		this.cpage = cpage;
	}
	public int getPagesize() {
		return 20;
	}
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	public int getCount1() {
		String sql="select count(*) from house";
		JDBCUtil util=new JDBCUtil();
		System.out.println(util.getCount(sql));
		return util.getCount(sql);
	}
	public void setCount1(int count1) {
		this.count1 = count1;
	}
	public int getCount() {
		String sql="select count(*) from changeapply";
		JDBCUtil util=new JDBCUtil();
		System.out.println(util.getCount(sql));
		return util.getCount(sql);
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getMaxpage() {
		return (this.getCount()+this.getPagesize()-1)/this.getPagesize();
	}
	public void setMaxpage(int maxpage) {
		this.maxpage = maxpage;
	}
	public List<ChangeApply> getHos() {
		return hos;
	}
	public void setHos(List<ChangeApply> hos) {
		this.hos = hos;
	}
	@Override
	public String toString() {
		return "PageInfo [cpage=" + cpage + ", pagesize=" + pagesize + ", count=" + count + ", count1=" + count1
				+ ", maxpage=" + maxpage + ", hos=" + hos + "]";
	}
	public List<House> getHos1() {
		return hos1;
	}
	public void setHos1(List<House> hos1) {
		this.hos1 = hos1;
	}
	
}
