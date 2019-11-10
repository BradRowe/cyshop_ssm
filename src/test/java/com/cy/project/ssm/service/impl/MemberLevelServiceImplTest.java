package com.cy.project.ssm.service.impl;

import com.cy.project.ssm.domain.MemberLevel;
import com.cy.project.ssm.service.MemberLevelService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-mybatis.xml")
public class MemberLevelServiceImplTest {

    @Autowired
    private MemberLevelService memberLevelService;

    @Test
    public void memberLevelAll() {

        List<MemberLevel> memberLevelList = memberLevelService.memberLevelAll();

        System.out.println(memberLevelList);

    }
}