package com.cy.project.ssm.domain;

import javax.persistence.*;

@Table(name = "`spu_attri`")
public class SpuAttri {
    /**
     * 编号
     */
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * 以spu为外键
     */
    @Column(name = "`spu_id`")
    private Integer spuId;

    /**
     * spu属性名称
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
     * 获取以spu为外键
     *
     * @return spu_id - 以spu为外键
     */
    public Integer getSpuId() {
        return spuId;
    }

    /**
     * 设置以spu为外键
     *
     * @param spuId 以spu为外键
     */
    public void setSpuId(Integer spuId) {
        this.spuId = spuId;
    }

    /**
     * 获取spu属性名称
     *
     * @return name - spu属性名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置spu属性名称
     *
     * @param name spu属性名称
     */
    public void setName(String name) {
        this.name = name;
    }
}