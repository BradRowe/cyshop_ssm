package com.cy.project.ssm.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`refund_or_return_order`")
public class RefundOrReturnOrder {
    /**
     * 编号
     */
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * 会员id
     */
    @Column(name = "`member_id`")
    private Integer memberId;

    /**
     * 商品名称
     */
    @Column(name = "`spu_name`")
    private String spuName;

    /**
     * 订单号
     */
    @Column(name = "`order_id`")
    private Integer orderId;

    /**
     * 申请时间
     */
    @Column(name = "`creat_time`")
    private Date creatTime;

    /**
     * 退款金额 0-换货
     */
    @Column(name = "`count`")
    private Double count;

    /**
     * 退货/款原因
     */
    @Column(name = "`reason`")
    private String reason;

    /**
     * 操作 -1已撤销 0未处理 1已通过 2已完成
     */
    @Column(name = "`status`")
    private Integer status;

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
     * 获取会员id
     *
     * @return member_id - 会员id
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * 设置会员id
     *
     * @param memberId 会员id
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * 获取商品名称
     *
     * @return spu_name - 商品名称
     */
    public String getSpuName() {
        return spuName;
    }

    /**
     * 设置商品名称
     *
     * @param spuName 商品名称
     */
    public void setSpuName(String spuName) {
        this.spuName = spuName;
    }

    /**
     * 获取订单号
     *
     * @return order_id - 订单号
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * 设置订单号
     *
     * @param orderId 订单号
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取申请时间
     *
     * @return creat_time - 申请时间
     */
    public Date getCreatTime() {
        return creatTime;
    }

    /**
     * 设置申请时间
     *
     * @param creatTime 申请时间
     */
    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    /**
     * 获取退款金额 0-换货
     *
     * @return count - 退款金额 0-换货
     */
    public Double getCount() {
        return count;
    }

    /**
     * 设置退款金额 0-换货
     *
     * @param count 退款金额 0-换货
     */
    public void setCount(Double count) {
        this.count = count;
    }

    /**
     * 获取退货/款原因
     *
     * @return reason - 退货/款原因
     */
    public String getReason() {
        return reason;
    }

    /**
     * 设置退货/款原因
     *
     * @param reason 退货/款原因
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * 获取操作 -1已撤销 0未处理 1已通过 2已完成
     *
     * @return status - 操作 -1已撤销 0未处理 1已通过 2已完成
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置操作 -1已撤销 0未处理 1已通过 2已完成
     *
     * @param status 操作 -1已撤销 0未处理 1已通过 2已完成
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}