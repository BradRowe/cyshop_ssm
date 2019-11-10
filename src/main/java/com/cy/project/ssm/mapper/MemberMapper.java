package com.cy.project.ssm.mapper;

import com.cy.project.ssm.domain.Member;
import com.cy.project.ssm.domain.MemberAddName;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface MemberMapper extends Mapper<Member> {

    Integer updateStatusByIdMember(@Param("id") Integer id, @Param("status") Integer status);

    Integer insertNewMembers(@Param("name") String name,@Param("account") String account,@Param("password") String password,@Param("phone") String phone);
}