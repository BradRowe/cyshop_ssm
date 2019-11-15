package com.cy.project.ssm.mapper;

import com.cy.project.ssm.domain.SkuAttribute;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.security.Signature;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-mybatis.xml")
public class SkuAttributeMapperTest {
@Autowired
    private SkuAttributeMapper skuAttributeMapper;

    @Test
    public void insert() {
        SkuAttribute skuAttribute = new SkuAttribute();
        skuAttribute.setName("测试属性");
        skuAttribute.setSkuId(1);
        skuAttributeMapper.insertOne(skuAttribute);
        System.out.println(skuAttribute.getId());
    }
}