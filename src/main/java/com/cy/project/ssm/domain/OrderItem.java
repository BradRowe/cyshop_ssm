package com.cy.project.ssm.domain;

import javax.persistence.*;

@Table(name = "`order_item`")
public class OrderItem {
    /**
     * 订单项编号
     */
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * 订单编号
     */
    @Column(name = "`order_id`")
    private Integer orderId;

    /**
     * sku编号
     */
    @Column(name = "`sku_id`")
    private Integer skuId;

    /**
     * 商品数量
     */
    @Column(name = "`nums`")
    private Integer nums;

    /**
     * 获取订单项编号
     *
     * @return id - 订单项编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置订单项编号
     *
     * @param id 订单项编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取订单编号
     *
     * @return order_id - 订单编号
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * 设置订单编号
     *
     * @param orderId 订单编号
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取sku编号
     *
     * @return sku_id - sku编号
     */
    public Integer getSkuId() {
        return skuId;
    }

    /**
     * 设置sku编号
     *
     * @param skuId sku编号
     */
    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    /**
     * 获取商品数量
     *
     * @return nums - 商品数量
     */
    public Integer getNums() {
        return nums;
    }

    /**
     * 设置商品数量
     *
     * @param nums 商品数量
     */
    public void setNums(Integer nums) {
        this.nums = nums;
    }
}