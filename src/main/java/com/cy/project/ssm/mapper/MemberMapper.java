package com.cy.project.ssm.mapper;

import com.cy.project.ssm.domain.Member;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface MemberMapper extends Mapper<Member> {

    List<Member> selectAllMember();

}