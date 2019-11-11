package com.cy.project.ssm.web;

import com.cy.project.ssm.domain.MemberAddName;
import com.cy.project.ssm.mapper.MemberMapper;
import com.cy.project.ssm.service.MemberService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-mybatis.xml")
public class MemberControllerTest {

    @Autowired
    private MemberService memberService;

    @Test
    public void memberListByAll() {

        List<MemberAddName> members = memberService.memberAndAll();
        System.out.println(members);

    }
}