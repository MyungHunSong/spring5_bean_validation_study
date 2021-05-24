package spring5_bean_validation_study.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring5_bean_validation_study.exception.DuplicateMemberException;

@Service
public class MemberRegisterService {
	
	@Autowired
	private MemberDao memberDao;
		
	public Long regist(RegisterRequest req) {
		Member member = memberDao.selectByEmail(req.getEmail());
		if(member != null) {
			throw new DuplicateMemberException("dup email" + req.getEmail());
		}
		Member newMember = new Member(req.getEmail(),req.getName(), req.getPassword(),  LocalDateTime.now()); 
		memberDao.insert(newMember);
		return newMember.getId();
	}
}
