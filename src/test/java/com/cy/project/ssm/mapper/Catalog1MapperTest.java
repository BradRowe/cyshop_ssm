package com.cy.project.ssm.mapper;

import com.cy.project.ssm.domain.Member;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-mybatis.xml")
public class Catalog1MapperTest {
    @Autowired
    private MemberMapper memberMapper;
    @Test
    public void select(){
        List<Member> members = memberMapper.selectAll();
        System.out.println(members);
    }
}