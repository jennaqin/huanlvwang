package com.hlw.dao;

import java.util.List;
import com.hlw.entries.ChangeApply;
import com.hlw.entries.Member;

public interface IChangeMemberDao {
	public int alterPasswd(Member member);
	public int alterMemberid(Member member);
	public int alteranswer(Member member);
	public int alterquestionid(Member member);
}
