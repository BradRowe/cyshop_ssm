package com.cy.project.ssm.domain;

import javax.persistence.*;

@Table(name = "`catalog_1`")
public class Catalog1 {
    /**
     * 编号
     */
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * 一级分类名称
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
     * 获取一级分类名称
     *
     * @return name - 一级分类名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置一级分类名称
     *
     * @param name 一级分类名称
     */
    public void setName(String name) {
        this.name = name;
    }
}