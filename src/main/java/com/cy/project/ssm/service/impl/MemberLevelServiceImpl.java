package com.cy.project.ssm.service.impl;

import com.cy.project.ssm.domain.MemberLevel;
import com.cy.project.ssm.mapper.MemberLevelMapper;
import com.cy.project.ssm.service.MemberLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName: MemberLevelServiceImpl
 * @Description:
 * @Author: 罗海
 * @Date: 2019/11/10 12:44
 **/
@Service
@Transactional(timeout = 3)
public class MemberLevelServiceImpl implements MemberLevelService {

    @Autowired
    private MemberLevelMapper memberLevelMapper;

    @Override
    public List<MemberLevel> memberLevelAll() {

        List<MemberLevel> memberLevels = memberLevelMapper.selectMemberLevelAll();

        return memberLevels;
    }

    @Override
    public boolean memberLevelNewMemberLevels(Integer level, double discount, String name) {

        int num = memberLevelMapper.insertMemberLevelAll(level,discount,name);

        if (num > 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean memberLevelByIdAndNmameDiscount(int id, String name, double discount) {

        Integer num = memberLevelMapper.updateByIdAndNameAndDiscount(id,name,discount);

        if (num > 0){
            return true;
        }
        return false;
    }
}
