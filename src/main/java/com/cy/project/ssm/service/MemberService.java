package com.cy.project.ssm.service;

import com.cy.project.ssm.domain.Member;

import java.util.List;

public interface MemberService {

    List<Member> memberAndAll();

//    通过id更改会员状态
    boolean memberById(Integer id,Integer status);

}
