package com.cy.project.ssm.mapper;

import com.cy.project.ssm.domain.MemberAddName;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface MemberAddNameMapper extends Mapper<MemberAddName> {

    List<MemberAddName> selectMemberAlls();

}
