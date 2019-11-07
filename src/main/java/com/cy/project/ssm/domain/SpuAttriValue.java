package com.cy.project.ssm.domain;

import javax.persistence.*;

@Table(name = "`spu_attri_value`")
public class SpuAttriValue {
    /**
     * 编号
     */
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * spu属性id
     */
    @Column(name = "`spu_attr_id`")
    private Integer spuAttrId;

    /**
     * 属性值
     */
    @Column(name = "`value`")
    private String value;

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
     * 获取spu属性id
     *
     * @return spu_attr_id - spu属性id
     */
    public Integer getSpuAttrId() {
        return spuAttrId;
    }

    /**
     * 设置spu属性id
     *
     * @param spuAttrId spu属性id
     */
    public void setSpuAttrId(Integer spuAttrId) {
        this.spuAttrId = spuAttrId;
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
}