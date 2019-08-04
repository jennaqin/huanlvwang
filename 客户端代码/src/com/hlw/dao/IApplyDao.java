package com.hlw.dao;

import java.util.List;
import com.hlw.entries.ChangeApply;
import com.hlw.entries.House;

public interface IApplyDao {
	public int alterApply(ChangeApply changeapply);
	public int alterAddress(ChangeApply changeapply);
	public int alterstartTime(ChangeApply changeapply);
	public int alteracomplishTime(ChangeApply changeapply);
	public ChangeApply getChangeApplyById(String phone);
}
