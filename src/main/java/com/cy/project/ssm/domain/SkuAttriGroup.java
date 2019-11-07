package com.cy.project.ssm.domain;

import javax.persistence.*;

@Table(name = "`sku_attri_group`")
public class SkuAttriGroup {
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * 属性编号
     */
    @Column(name = "`attri_id`")
    private Integer attriId;

    /**
     * 属性值编号
     */
    @Column(name = "`attri_value_id`")
    private Integer attriValueId;

    /**
     * 模型编号
     */
    @Column(name = "`model_id`")
    private Integer modelId;

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

    /**
     * 获取属性值编号
     *
     * @return attri_value_id - 属性值编号
     */
    public Integer getAttriValueId() {
        return attriValueId;
    }

    /**
     * 设置属性值编号
     *
     * @param attriValueId 属性值编号
     */
    public void setAttriValueId(Integer attriValueId) {
        this.attriValueId = attriValueId;
    }

    /**
     * 获取模型编号
     *
     * @return model_id - 模型编号
     */
    public Integer getModelId() {
        return modelId;
    }

    /**
     * 设置模型编号
     *
     * @param modelId 模型编号
     */
    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }
}