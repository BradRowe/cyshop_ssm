package com.cy.project.ssm.service.impl;

import com.cy.project.ssm.domain.Catalog1;
import com.cy.project.ssm.domain.Catalog2;
import com.cy.project.ssm.domain.Catalog3;
import com.cy.project.ssm.mapper.Catalog1Mapper;
import com.cy.project.ssm.mapper.Catalog2Mapper;
import com.cy.project.ssm.mapper.Catalog3Mapper;
import com.cy.project.ssm.service.CatalogService;
import com.cy.project.ssm.viewobject.Catalog1VO;
import com.cy.project.ssm.viewobject.Catalog2VO;
import com.cy.project.ssm.viewobject.Catalog3VO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0.0
 * @ClassName CatalogServiceImpl
 * @Description TODO
 * @Author Administrator
 * @date 2019/11/716:59
 */
@Service
public class CatalogServiceImpl implements CatalogService {
    @Autowired
    private Catalog1Mapper catalog1Mapper;
    @Autowired
    private Catalog2Mapper catalog2Mapper;
    @Autowired
    private Catalog3Mapper catalog3Mapper;

    @Override
    public List<Catalog1> select1All() {

        return catalog1Mapper.selectAll();
    }

    @Override
    public List<Catalog2> select2All() {
        return catalog2Mapper.selectAll();
    }

    @Override
    public List<Catalog3> select3All() {
        return catalog3Mapper.selectAll();
    }

    @Override
    public List<Catalog1VO> getCatalog() {
        List<Catalog1> catalog1s = select1All();
        List<Catalog1VO> catalog1VOs = new ArrayList<>();
        for (Catalog1 c1 : catalog1s) {
            Catalog1VO catalog1VO = new Catalog1VO();
            catalog1VO.setId(c1.getId());
            catalog1VO.setName(c1.getName());
            catalog1VOs.add(catalog1VO);
        }
//        System.out.println(catalog1VOs);
        List<Catalog2> catalog2s = select2All();
        List<Catalog2VO> catalog2VOs = new ArrayList<>();
        for (Catalog2 c2 : catalog2s) {
            Catalog2VO catalog2VO = new Catalog2VO();
            catalog2VO.setId(c2.getId());
            catalog2VO.setName(c2.getName());
            catalog2VO.setPid(c2.getCatalog1Id());
            catalog2VOs.add(catalog2VO);
        }
//        System.out.println(catalog2VOs);
        List<Catalog3> catalog3s = select3All();
        List<Catalog3VO> catalog3VOs = new ArrayList<>();
        for (Catalog3 c3 : catalog3s) {
            Catalog3VO catalog3VO = new Catalog3VO();
            catalog3VO.setId(c3.getId());
            catalog3VO.setName(c3.getName());
            catalog3VO.setPid(c3.getCatalog2Id());
            catalog3VOs.add(catalog3VO);
        }
//        System.out.println(catalog3VOs);

        for (Catalog1VO c1o : catalog1VOs) {
            for (Catalog2VO c2o : catalog2VOs) {
                if (c2o.getPid().equals(c1o.getId())) {
                    c1o.getChildren().add(c2o);
                    for (Catalog3VO c3o : catalog3VOs) {
                        if (c3o.getPid().equals(c2o.getId())) {
                            c2o.getChildren().add(c3o);
                        }
                    }
                }
            }
        }
//        System.out.println(catalog1VOs);

        Catalog1VO catalog1VO = new Catalog1VO();


        return catalog1VOs;
    }

    @Override
    public Integer addCatalog(String level, String name, String pid) {
        Integer row = -1;

        switch (level) {
            case "一级分类":
                Catalog1 catalog1 = new Catalog1();
                catalog1.setName(name);
                row = catalog1Mapper.insert(catalog1);
                break;
            case "二级分类":
                Catalog2 catalog2 = new Catalog2();
                catalog2.setName(name);
                catalog2.setCatalog1Id(Integer.parseInt(pid));
                row = catalog2Mapper.insert(catalog2);
                break;
            case "三级分类":
                Catalog3 catalog3 = new Catalog3();
                catalog3.setName(name);
                catalog3.setCatalog2Id(Integer.parseInt(pid));
                row = catalog3Mapper.insert(catalog3);
                break;
        }

        return row;
    }

    @Override
    public Integer deleteCatalog(String level, String id) {
        Integer row = -1;

        switch (level) {
            case "一级分类":
                Catalog1 catalog1 = new Catalog1();
                catalog1.setId(Integer.parseInt(id));
                row = catalog1Mapper.delete(catalog1);
                break;
            case "二级分类":
                Catalog2 catalog2 = new Catalog2();
                catalog2.setId(Integer.parseInt(id));
                row = catalog2Mapper.delete(catalog2);
                break;
            case "三级分类":
                Catalog3 catalog3 = new Catalog3();
                catalog3.setId(Integer.parseInt(id));
                row = catalog3Mapper.delete(catalog3);
                break;
        }

        return row;
    }
}
