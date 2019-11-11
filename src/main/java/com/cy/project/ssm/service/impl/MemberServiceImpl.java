package com.cy.project.ssm.service.impl;

import com.cy.project.ssm.domain.Member;
import com.cy.project.ssm.domain.MemberAddName;
import com.cy.project.ssm.mapper.MemberAddNameMapper;
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
@Transactional(timeout = 3)
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberMapper memberMapper;

    @Autowired
    private MemberAddNameMapper memberAddNameMapper;

    @Override
    public List<MemberAddName> memberAndAll() {

        List<MemberAddName> members = new ArrayList<MemberAddName>();
        members = memberAddNameMapper.selectMemberAlls();

        return members;
    }

    @Override
    public boolean memberById(Integer id, Integer status) {

        Integer num = memberMapper.updateStatusByIdMember(id,status);

        if(num > 0){
            return true;
        }
        return false;
    }
    // 新增会员数据
    @Override
    public boolean memberByNewMembers(String name, String account, String password, String phone) {


        Integer num = memberMapper.insertNewMembers(name,account,password,phone);

        if (num > 0){
            return true;
        }
        return false;
    }


}
