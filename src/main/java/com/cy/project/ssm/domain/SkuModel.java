package com.cy.project.ssm.domain;

import javax.persistence.*;

@Table(name = "`sku_model`")
public class SkuModel {
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * 模型名称
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 三级分类编号
     */
    @Column(name = "`catalog3_id`")
    private Integer catalog3Id;

    @Override
    public String toString() {
        return "SkuModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", catalog3Id=" + catalog3Id +
                '}';
    }

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取模型名称
     *
     * @return name - 模型名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置模型名称
     *
     * @param name 模型名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取三级分类编号
     *
     * @return catalog3_id - 三级分类编号
     */
    public Integer getCatalog3Id() {
        return catalog3Id;
    }

    /**
     * 设置三级分类编号
     *
     * @param catalog3Id 三级分类编号
     */
    public void setCatalog3Id(Integer catalog3Id) {
        this.catalog3Id = catalog3Id;
    }
}