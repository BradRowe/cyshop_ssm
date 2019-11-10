package com.cy.project.ssm.service.impl;

import com.cy.project.ssm.service.CatalogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-mybatis.xml")
public class CatalogServiceImplTest {
    @Autowired
    private CatalogService catalogService;

    @Test
    public void getCatalog() {
        catalogService.getCatalog();
    }

    @Test
    public void addCatalog() {
        catalogService.addCatalog("一级分类", "测试", null);
    }
}