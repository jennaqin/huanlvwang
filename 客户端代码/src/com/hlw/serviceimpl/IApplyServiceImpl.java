package com.hlw.serviceimpl;

import java.util.List;

import com.hlw.dao.IApplyDao;
import com.hlw.daoimpl.IApplyDaoImpl;
import com.hlw.entries.ChangeApply;
import com.hlw.entries.House;
import com.hlw.service.IApplyService;

public class IApplyServiceImpl implements IApplyService {
	IApplyDao iapplydao;

	public IApplyServiceImpl() {
		iapplydao = new IApplyDaoImpl();
	}

	public int alterApply(ChangeApply changeapply) {
		// TODO Auto-generated method stub
		return iapplydao.alterApply(changeapply);
	}
	public int alterAddress(ChangeApply changeapply){
		return iapplydao.alterAddress(changeapply);
	}
	public int alterstartTime(ChangeApply changeapply){
		return iapplydao.alterstartTime(changeapply);
	}
	public int alteracomplishTime(ChangeApply changeapply){
		return iapplydao.alteracomplishTime(changeapply);
	}
	public ChangeApply getChangeApplyById(String phone) {
		return iapplydao.getChangeApplyById(phone);
	}
}
