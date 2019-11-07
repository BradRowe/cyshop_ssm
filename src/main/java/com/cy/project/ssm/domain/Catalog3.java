package com.cy.project.ssm.domain;

import javax.persistence.*;

@Table(name = "`catalog_3`")
public class Catalog3 {
    /**
     * 编号
     */
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * 二级分类名称
     */
    @Column(name = "`catalog_2_id`")
    private Integer catalog2Id;

    /**
     * 三级菜单名称
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 获取编号
     *
     * @return id - 编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取二级分类名称
     *
     * @return catalog_2_id - 二级分类名称
     */
    public Integer getCatalog2Id() {
        return catalog2Id;
    }

    /**
     * 设置二级分类名称
     *
     * @param catalog2Id 二级分类名称
     */
    public void setCatalog2Id(Integer catalog2Id) {
        this.catalog2Id = catalog2Id;
    }

    /**
     * 获取三级菜单名称
     *
     * @return name - 三级菜单名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置三级菜单名称
     *
     * @param name 三级菜单名称
     */
    public void setName(String name) {
        this.name = name;
    }
}