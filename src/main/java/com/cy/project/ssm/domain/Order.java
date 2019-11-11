package com.cy.project.ssm.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`order`")
public class Order {
    /**
     * 订单编号
     */
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * 用户编号
     */
    @Column(name = "`member_id`")
    private Integer memberId;

    /**
     * 配送地址编号
     */
    @Column(name = "`member_address_id`")
    private Integer memberAddressId;

    /**
     * 创建订单时间
     */
    @Column(name = "`creat_time`")
    private Date creatTime;

    /**
     * 支付时间
     */
    @Column(name = "`pay_time`")
    private Date payTime;

    /**
     * 原价格
     */
    @Column(name = "`total_price`")
    private Integer totalPrice;

    /**
     * 折扣
     */
    @Column(name = "`discounts`")
    private Integer discounts;

    /**
     * 邮费
     */
    @Column(name = "`post_price`")
    private Integer postPrice;

    /**
     * 支付价格
     */
    @Column(name = "`payment`")
    private Integer payment;

    /**
     * 支付方式编号
     */
    @Column(name = "`payment_way_id`")
    private Integer paymentWayId;

    /**
     * 订单状态 -0 已取消 1未付款 2已付款3 已发货 4 已收货 
     */
    @Column(name = "`status`")
    private Integer status;

    /**
     * 订单删除状态 -0 正常 -1 作废 
     */
    @Column(name = "`delete_status`")
    private Integer deleteStatus;

    /**
     * 获取订单编号
     *
     * @return id - 订单编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置订单编号
     *
     * @param id 订单编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户编号
     *
     * @return member_id - 用户编号
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * 设置用户编号
     *
     * @param memberId 用户编号
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * 获取配送地址编号
     *
     * @return member_address_id - 配送地址编号
     */
    public Integer getMemberAddressId() {
        return memberAddressId;
    }

    /**
     * 设置配送地址编号
     *
     * @param memberAddressId 配送地址编号
     */
    public void setMemberAddressId(Integer memberAddressId) {
        this.memberAddressId = memberAddressId;
    }

    /**
     * 获取创建订单时间
     *
     * @return creat_time - 创建订单时间
     */
    public Date getCreatTime() {
        return creatTime;
    }

    /**
     * 设置创建订单时间
     *
     * @param creatTime 创建订单时间
     */
    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    /**
     * 获取支付时间
     *
     * @return pay_time - 支付时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 设置支付时间
     *
     * @param payTime 支付时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 获取原价格
     *
     * @return total_price - 原价格
     */
    public Integer getTotalPrice() {
        return totalPrice;
    }

    /**
     * 设置原价格
     *
     * @param totalPrice 原价格
     */
    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * 获取折扣
     *
     * @return discounts - 折扣
     */
    public Integer getDiscounts() {
        return discounts;
    }

    /**
     * 设置折扣
     *
     * @param discounts 折扣
     */
    public void setDiscounts(Integer discounts) {
        this.discounts = discounts;
    }

    /**
     * 获取邮费
     *
     * @return post_price - 邮费
     */
    public Integer getPostPrice() {
        return postPrice;
    }

    /**
     * 设置邮费
     *
     * @param postPrice 邮费
     */
    public void setPostPrice(Integer postPrice) {
        this.postPrice = postPrice;
    }

    /**
     * 获取支付价格
     *
     * @return payment - 支付价格
     */
    public Integer getPayment() {
        return payment;
    }

    /**
     * 设置支付价格
     *
     * @param payment 支付价格
     */
    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    /**
     * 获取支付方式编号
     *
     * @return payment_way_id - 支付方式编号
     */
    public Integer getPaymentWayId() {
        return paymentWayId;
    }

    /**
     * 设置支付方式编号
     *
     * @param paymentWayId 支付方式编号
     */
    public void setPaymentWayId(Integer paymentWayId) {
        this.paymentWayId = paymentWayId;
    }

    /**
     * 获取订单状态 -0 已取消 1未付款 2已付款3 已发货 4 已收货
     *
     * @return status - 订单状态 -0 已取消 1未付款 2已付款3 已发货 4 已收货 
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置订单状态 -0 已取消 1未付款 2已付款3 已发货 4 已收货 
     *
     * @param status 订单状态 -0 已取消 1未付款 2已付款3 已发货 4 已收货
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取订单删除状态 -0 正常 -1 作废 
     *
     * @return delete_status - 订单删除状态 -0 正常 -1 作废 
     */
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * 设置订单删除状态 -0 正常 -1 作废 
     *
     * @param deleteStatus 订单删除状态 -0 正常 -1 作废 
     */
    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }
}