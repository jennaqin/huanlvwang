package com.hlw.daoimpl;

import java.util.List;

import com.hlw.dao.IDeptDao;
import com.hlw.entries.Question;
import com.rock.util.JDBCUtil;

public class IDeptDaoImpl implements IDeptDao {
	JDBCUtil util;
	
	public IDeptDaoImpl() {
		util = new JDBCUtil();
	}

	@Override
	public List<Question> getDepts() {
		return util.queryAll(Question.class, "select * from question");
	}

}
