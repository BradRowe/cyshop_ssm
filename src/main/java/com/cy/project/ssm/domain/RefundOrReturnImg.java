package com.cy.project.ssm.domain;

import javax.persistence.*;

@Table(name = "`refund_or_return_img`")
public class RefundOrReturnImg {
    /**
     * 编号
     */
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * 退货/款单id
     */
    @Column(name = "`return_id`")
    private Integer returnId;

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
     * 获取退货/款单id
     *
     * @return return_id - 退货/款单id
     */
    public Integer getReturnId() {
        return returnId;
    }

    /**
     * 设置退货/款单id
     *
     * @param returnId 退货/款单id
     */
    public void setReturnId(Integer returnId) {
        this.returnId = returnId;
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