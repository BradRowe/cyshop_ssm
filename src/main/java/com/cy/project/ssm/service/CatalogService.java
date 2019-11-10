package com.cy.project.ssm.service;

import com.cy.project.ssm.domain.Catalog1;
import com.cy.project.ssm.domain.Catalog2;
import com.cy.project.ssm.domain.Catalog3;
import com.cy.project.ssm.viewobject.Catalog1VO;

import java.util.List;

/**
 * @version 1.0.0
 * @ClassName CatalogService
 * @Description TODO
 * @Author Administrator
 * @date 2019/11/716:58
 */
public interface CatalogService {
    /**
     * 查询所有一级分类
     * @return
     */
    List<Catalog1> select1All();

    /**
     * 查询所有二级分类
     * @return
     */
    List<Catalog2> select2All();

    /**
     * 查询所有三级分类
     * @return
     */
    List<Catalog3> select3All();

    /**
     * 组装三级分类
     * @return
     */
    List<Catalog1VO> getCatalog();

    /**
     * 添加分类
     * @param level 所属分类级别
     * @param name 分列名称
     * @param pid 父类id
     * @return
     */
    Integer addCatalog(String level,String name,String pid);

    /**
     * 删除分类
     * @param level 所属分类级别
     * @param id 分类id
     * @return
     */
    Integer deleteCatalog(String level, String id);
}
