package com.cy.project.ssm.mapper;

import com.cy.project.ssm.domain.MemberLevel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
@Repository
public interface MemberLevelMapper extends Mapper<MemberLevel> {

    List<MemberLevel> selectMemberLevelAll();

    Integer insertMemberLevelAll(@Param("level") Integer level,@Param("discount") double discount,@Param("name") String name);


    Integer updateByIdAndNameAndDiscount(@Param("id") Integer id,@Param("name") String name,@Param("discount") double discount);
}