package com.cy.project.ssm.domain;

import javax.persistence.*;

@Table(name = "`payment_method`")
public class PaymentMethod {
    /**
     * 编号
     */
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * 支付方式名称
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 支付码
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
     * 获取支付方式名称
     *
     * @return name - 支付方式名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置支付方式名称
     *
     * @param name 支付方式名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取支付码
     *
     * @return url - 支付码
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置支付码
     *
     * @param url 支付码
     */
    public void setUrl(String url) {
        this.url = url;
    }
}