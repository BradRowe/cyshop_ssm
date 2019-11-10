package com.cy.project.ssm.viewobject;

import javax.xml.registry.SaveException;
import java.io.Serializable;

/**
 * @author zhy
 * @version 1.0.0
 * @function TODO
 * @date 2019年9月4日下午3:01:42
 * @place 工作地点
 * @remarks TODO
 */
public class OrderVOC implements Serializable {

    private Integer orderId;

    private Integer skuId;

    private String skuName;

    private String skuDescription;

    private Integer num;

    private Integer price;

    private Integer sum;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "OrderVOC{" +
                "orderId=" + orderId +
                ", skuId=" + skuId +
                ", skuName='" + skuName + '\'' +
                ", skuDescription='" + skuDescription + '\'' +
                ", num=" + num +
                ", price=" + price +
                ", sum=" + sum +
                '}';
    }
}
