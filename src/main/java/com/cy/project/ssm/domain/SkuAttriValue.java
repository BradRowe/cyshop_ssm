package com.cy.project.ssm.domain;

import javax.persistence.*;

@Table(name = "`sku_attri_value`")
public class SkuAttriValue {
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * 属性值
     */
    @Column(name = "`value`")
    private String value;

    /**
     * 属性编号
     */
    @Column(name = "`attri_id`")
    private Integer attriId;

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
     * 获取属性值
     *
     * @return value - 属性值
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置属性值
     *
     * @param value 属性值
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 获取属性编号
     *
     * @return attri_id - 属性编号
     */
    public Integer getAttriId() {
        return attriId;
    }

    /**
     * 设置属性编号
     *
     * @param attriId 属性编号
     */
    public void setAttriId(Integer attriId) {
        this.attriId = attriId;
    }
}