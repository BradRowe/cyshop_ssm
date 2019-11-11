package com.cy.project.ssm.service;

import com.cy.project.ssm.domain.MemberLevel;

import java.util.List;

/**
 * @ClassName: MemberLevelService
 * @Description:
 * @Author: 罗海
 * @Date: 2019/11/10 12:43
 **/
public interface MemberLevelService {

    List<MemberLevel> memberLevelAll();

    boolean memberLevelNewMemberLevels(Integer level, double discount, String name);

    boolean memberLevelByIdAndNmameDiscount(int id, String name, double discount);
}
