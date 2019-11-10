package com.cy.project.ssm.viewobject;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss",timezone="GMT+8")
    private Date createTime;

    private String account;

    private String phone;

    private Date paymentTime;

    private String consigneePhone;

    private String consigneeAddress;

    private List<OrderVOC> children = new ArrayList<>();

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

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public String getConsigneePhone() {
        return consigneePhone;
    }

    public void setConsigneePhone(String consigneePhone) {
        this.consigneePhone = consigneePhone;
    }

    public String getConsigneeAddress() {
        return consigneeAddress;
    }

    public void setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress;
    }

    public List<OrderVOC> getChildren() {
        return children;
    }

    public void setChildren(List<OrderVOC> children) {
        this.children = children;
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
                ", orderStatus='" + orderStatus + '\'' +
                ", paymentWay='" + paymentWay + '\'' +
                ", createTime=" + createTime +
                ", account='" + account + '\'' +
                ", phone='" + phone + '\'' +
                ", paymentTime=" + paymentTime +
                ", consigneePhone='" + consigneePhone + '\'' +
                ", consigneeAddress='" + consigneeAddress + '\'' +
                ", children=" + children +
                '}';
    }
}
