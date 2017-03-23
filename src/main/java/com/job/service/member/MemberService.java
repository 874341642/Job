package com.job.service.member;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.job.dao.member.MemberDao;
import com.job.entity.Entity;
import com.job.entity.member.MemberEntity;

@Service
public class MemberService {

	@Resource
	private MemberDao memberDao;

	public String getMemberAccountById(Long id) {
		MemberEntity member =(MemberEntity)memberDao.getById(id);
		System.out.println("member：" + JSONObject.toJSON(member));
////		List<MemberEntity> list = memberMapper.getMemberAll();		
////		System.out.println("members：" +JSONObject.toJSON(list));
//		entity = memberMapper.getMember(id);
		return member.getAccount();
	}
}
