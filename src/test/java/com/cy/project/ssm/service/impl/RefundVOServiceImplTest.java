package com.cy.project.ssm.service.impl;

import com.cy.project.ssm.mapper.RefundVOMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-mybatis.xml")
public class RefundVOServiceImplTest {

    @Autowired
    private RefundVOMapper refundVOMapper;

    @Test
    public void changeRefundStatus() {
        int result = refundVOMapper.changeRefundStatus("1","1");
        System.out.println(result);
    }
}