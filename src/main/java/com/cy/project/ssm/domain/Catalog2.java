package com.cy.project.ssm.domain;

import javax.persistence.*;

@Table(name = "`catalog_2`")
public class Catalog2 {
    /**
     * 编号
     */
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * 一级菜单编号
     */
    @Column(name = "`catalog_1_id`")
    private Integer catalog1Id;

    /**
     * 二级菜单名称
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
     * 获取一级菜单编号
     *
     * @return catalog_1_id - 一级菜单编号
     */
    public Integer getCatalog1Id() {
        return catalog1Id;
    }

    /**
     * 设置一级菜单编号
     *
     * @param catalog1Id 一级菜单编号
     */
    public void setCatalog1Id(Integer catalog1Id) {
        this.catalog1Id = catalog1Id;
    }

    /**
     * 获取二级菜单名称
     *
     * @return name - 二级菜单名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置二级菜单名称
     *
     * @param name 二级菜单名称
     */
    public void setName(String name) {
        this.name = name;
    }
}