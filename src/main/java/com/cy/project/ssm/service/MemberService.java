package com.cy.project.ssm.service;

import com.cy.project.ssm.domain.Member;
import com.cy.project.ssm.domain.MemberAddName;

import java.util.List;

public interface MemberService {

//    查询信息将会员等级转换为文字形式
    List<MemberAddName> memberAndAll();

//    通过id更改会员状态
    boolean memberById(Integer id,Integer status);

//    通过会员的id找到会员等级的名称


    // 增加新会员
    boolean memberByNewMembers(String name, String account, String password, String phone);


}
