package com.cy.project.ssm.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-mybatis.xml")
public class ISkuSericeTest {
    @Autowired
    private ISkuSerice skuSerice;
    @Test
    public void getAttri() {
       List<String> strings= skuSerice.getAttri("23");
        System.out.println(strings);
    }
}