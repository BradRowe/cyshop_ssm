package com.cy.project.ssm.service.impl;

import com.cy.project.ssm.domain.Member;
import com.cy.project.ssm.mapper.MemberMapper;
import com.cy.project.ssm.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: MemberServiceImpl
 * @Description:
 * @Author: 罗海
 * @Date: 2019/11/7 10:21
 **/
@Service
@Transactional(readOnly = true,timeout = 3)
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public List<Member> memberAndAll() {

        Member member = new Member();
        List<Member> members = new ArrayList<Member>();
        members = memberMapper.selectAllMember();

        return members;
    }
}
