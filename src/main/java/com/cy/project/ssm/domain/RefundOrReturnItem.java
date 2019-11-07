package com.cy.project.ssm.domain;

import javax.persistence.*;

@Table(name = "`refund_or_return_item`")
public class RefundOrReturnItem {
    /**
     * 编号
     */
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * 退货/款id
     */
    @Column(name = "`return_id`")
    private Integer returnId;

    /**
     * sku_id
     */
    @Column(name = "`sku_id`")
    private Integer skuId;

    /**
     * 数量
     */
    @Column(name = "`nums`")
    private Integer nums;

    /**
     * 价格
     */
    @Column(name = "`sku_price`")
    private Double skuPrice;

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
     * 获取退货/款id
     *
     * @return return_id - 退货/款id
     */
    public Integer getReturnId() {
        return returnId;
    }

    /**
     * 设置退货/款id
     *
     * @param returnId 退货/款id
     */
    public void setReturnId(Integer returnId) {
        this.returnId = returnId;
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
     * 获取数量
     *
     * @return nums - 数量
     */
    public Integer getNums() {
        return nums;
    }

    /**
     * 设置数量
     *
     * @param nums 数量
     */
    public void setNums(Integer nums) {
        this.nums = nums;
    }

    /**
     * 获取价格
     *
     * @return sku_price - 价格
     */
    public Double getSkuPrice() {
        return skuPrice;
    }

    /**
     * 设置价格
     *
     * @param skuPrice 价格
     */
    public void setSkuPrice(Double skuPrice) {
        this.skuPrice = skuPrice;
    }
}