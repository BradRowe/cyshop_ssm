package com.cy.project.ssm.domain;

import javax.persistence.*;

@Table(name = "`spu`")
public class Spu {
    /**
     * 编号
     */
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * 一级分类编号
     */
    @Column(name = "`catalog_1_id`")
    private Integer catalog1Id;

    /**
     * 二级分类编号
     */
    @Column(name = "`catalog_2_id`")
    private Integer catalog2Id;

    /**
     * 三级分类编号
     */
    @Column(name = "`catalog_3_id`")
    private Integer catalog3Id;

    /**
     * spu名称
     */
    @Column(name = "`spu_name`")
    private String spuName;

    /**
     * spu描述
     */
    @Column(name = "`spu_description`")
    private String spuDescription;

    /**
     * 是否热推 0-否 1-是
     */
    @Column(name = "`hot`")
    private Integer hot;

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
     * 获取一级分类编号
     *
     * @return catalog_1_id - 一级分类编号
     */
    public Integer getCatalog1Id() {
        return catalog1Id;
    }

    /**
     * 设置一级分类编号
     *
     * @param catalog1Id 一级分类编号
     */
    public void setCatalog1Id(Integer catalog1Id) {
        this.catalog1Id = catalog1Id;
    }

    /**
     * 获取二级分类编号
     *
     * @return catalog_2_id - 二级分类编号
     */
    public Integer getCatalog2Id() {
        return catalog2Id;
    }

    /**
     * 设置二级分类编号
     *
     * @param catalog2Id 二级分类编号
     */
    public void setCatalog2Id(Integer catalog2Id) {
        this.catalog2Id = catalog2Id;
    }

    /**
     * 获取三级分类编号
     *
     * @return catalog_3_id - 三级分类编号
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

    /**
     * 获取spu名称
     *
     * @return spu_name - spu名称
     */
    public String getSpuName() {
        return spuName;
    }

    /**
     * 设置spu名称
     *
     * @param spuName spu名称
     */
    public void setSpuName(String spuName) {
        this.spuName = spuName;
    }

    /**
     * 获取spu描述
     *
     * @return spu_description - spu描述
     */
    public String getSpuDescription() {
        return spuDescription;
    }

    /**
     * 设置spu描述
     *
     * @param spuDescription spu描述
     */
    public void setSpuDescription(String spuDescription) {
        this.spuDescription = spuDescription;
    }

    /**
     * 获取是否热推 0-否 1-是
     *
     * @return hot - 是否热推 0-否 1-是
     */
    public Integer getHot() {
        return hot;
    }

    /**
     * 设置是否热推 0-否 1-是
     *
     * @param hot 是否热推 0-否 1-是
     */
    public void setHot(Integer hot) {
        this.hot = hot;
    }
}