package com.hlw.entries;

public class Question {
	private String deptno;
	private String ques;
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(String deptno, String ques) {
		super();
		this.deptno = deptno;
		this.ques = ques;
	}
	public String getDeptno() {
		return deptno;
	}
	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}
	public String getQues() {
		return ques;
	}
	public void setQues(String ques) {
		this.ques = ques;
	}
	@Override
	public String toString() {
		return "Question [deptno=" + deptno + ", ques=" + ques + "]";
	}
	
	
}
