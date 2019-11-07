package com.cy.project.ssm.domain;

import javax.persistence.*;

@Table(name = "`spu_img`")
public class SpuImg {
    /**
     * 编号
     */
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * spu_id
     */
    @Column(name = "`spu_id`")
    private Integer spuId;

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
     * 获取spu_id
     *
     * @return spu_id - spu_id
     */
    public Integer getSpuId() {
        return spuId;
    }

    /**
     * 设置spu_id
     *
     * @param spuId spu_id
     */
    public void setSpuId(Integer spuId) {
        this.spuId = spuId;
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