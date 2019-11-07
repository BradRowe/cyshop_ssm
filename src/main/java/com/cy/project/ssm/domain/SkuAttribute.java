package com.cy.project.ssm.domain;

import javax.persistence.*;

@Table(name = "`sku_attribute`")
public class SkuAttribute {
    /**
     * 编号
     */
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * sku_id
     */
    @Column(name = "`sku_id`")
    private Integer skuId;

    /**
     * 属性名称
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
     * 获取sku_id
     *
     * @return sku_id - sku_id
     */
    public Integer getSkuId() {
        return skuId;
    }

    /**
     * 设置sku_id
     *
     * @param skuId sku_id
     */
    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    /**
     * 获取属性名称
     *
     * @return name - 属性名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置属性名称
     *
     * @param name 属性名称
     */
    public void setName(String name) {
        this.name = name;
    }
}