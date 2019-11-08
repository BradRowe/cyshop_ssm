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
public class RefundVO implements Serializable {
    private Integer orderId;
    private String memberName;
    private String consigneeName;
    private String phone;
    private Integer payment;
    private Integer refundStatus;
    private Date createTime;
    private Integer num;
    private Date paymentTime;
    private String paymentWay;
    private String account;
    private String skuName;
    private String reason;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    public Integer getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public String getPaymentWay() {
        return paymentWay;
    }

    public void setPaymentWay(String paymentWay) {
        this.paymentWay = paymentWay;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "RefundVO{" +
                "orderId=" + orderId +
                ", memberName='" + memberName + '\'' +
                ", consigneeName='" + consigneeName + '\'' +
                ", phone='" + phone + '\'' +
                ", payment=" + payment +
                ", refundStatus=" + refundStatus +
                ", createTime=" + createTime +
                ", num=" + num +
                ", paymentTime=" + paymentTime +
                ", paymentWay='" + paymentWay + '\'' +
                ", account='" + account + '\'' +
                ", skuName='" + skuName + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }
}
