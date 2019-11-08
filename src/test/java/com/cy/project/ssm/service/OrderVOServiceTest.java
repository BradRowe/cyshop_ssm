package com.cy.project.ssm.service;

import com.cy.project.ssm.mapper.OrderVOMapper;
import com.cy.project.ssm.viewobject.OrderVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-mybatis.xml")
public class OrderVOServiceTest {
    @Autowired
    private OrderVOMapper orderVOMapper;
    @Test
    public void selectAll() {
        List<OrderVO> orderVOs = orderVOMapper.selectAll();
        System.out.println(orderVOs);
    }
    @Test
    public void selectOneByOrderId() {
        OrderVO orderVO = orderVOMapper.selectOneByOrderId(47);
        System.out.println(orderVO);
    }
}