package com.cy.project.ssm.viewobject;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhy
 * @version 1.0.0
 * @function TODO
 * @date 2019年9月4日下午3:01:42
 * @place 工作地点
 * @remarks TODO
 */
public class OrderVO implements Serializable {
//    订单id
    private Integer orderId;
//    买家姓名
    private String memberName;
//    收货人姓名
    private String consigneeName;
//    订单价格
    private Integer totalPrice;
//    邮费
    private Integer postPrice;
//    实付价格
    private Integer payment;
//    订单状态
    private String orderStatus;
//    支付方式
    private String paymentWay;
//    订单创建时间
    private Date createTime;
//    商品名称
    private String skuName;
//    商品编号
    private Integer skuId;
//    产品属性规格
    private String skuDescription;
//    购买数量
    private Integer num;
//    收货地址
    private String consigneeAddress;
//    收货电话
    private String phone;
//    买家账号
    private String account;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getConsigneeName() {
        return consigneeName;
    }

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getPostPrice() {
        return postPrice;
    }

    public void setPostPrice(Integer postPrice) {
        this.postPrice = postPrice;
    }

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getPaymentWay() {
        return paymentWay;
    }

    public void setPaymentWay(String paymentWay) {
        this.paymentWay = paymentWay;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public String getSkuDescription() {
        return skuDescription;
    }

    public void setSkuDescription(String skuDescription) {
        this.skuDescription = skuDescription;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getConsigneeAddress() {
        return consigneeAddress;
    }

    public void setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "OrderVO{" +
                "orderId=" + orderId +
                ", memberName='" + memberName + '\'' +
                ", consigneeName='" + consigneeName + '\'' +
                ", totalPrice=" + totalPrice +
                ", postPrice=" + postPrice +
                ", payment=" + payment +
                ", orderStatus=" + orderStatus +
                ", paymentWay=" + paymentWay +
                ", createTime=" + createTime +
                ", skuName=" + skuName +
                ", skuId=" + skuId +
                ", skuDescription=" + skuDescription +
                ", num=" + num +
                ", consigneeAddress=" + consigneeAddress +
                ", phone=" + phone +
                ", account=" + account +
                '}';
    }
}
