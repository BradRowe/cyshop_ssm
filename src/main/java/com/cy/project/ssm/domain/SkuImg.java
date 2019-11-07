package com.cy.project.ssm.domain;

import javax.persistence.*;

@Table(name = "`sku_img`")
public class SkuImg {
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
     * 图片地址
     */
    @Column(name = "`url`")
    private String url;

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
     * 获取图片地址
     *
     * @return url - 图片地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置图片地址
     *
     * @param url 图片地址
     */
    public void setUrl(String url) {
        this.url = url;
    }
}