package com.cy.project.ssm.mapper;

import com.cy.project.ssm.viewobject.SkuModelVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-mybatis.xml")
public class SkuModelVOMapperTest {
    @Autowired
    private SkuModelVOMapper skuModelVOMapper;

    @Test
    public void selectAll() {
      List<SkuModelVO> skuModelVOS;
        skuModelVOS = skuModelVOMapper.selectAll();
        System.out.println(skuModelVOS);
    }
}