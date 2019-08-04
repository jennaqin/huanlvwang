package com.hlw.dao;

import java.util.List;

import com.hlw.entries.Member;
import com.hlw.entries.Register;

public interface IRegisterDao {
	public int save(Member m);
}
