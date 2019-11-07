package com.cy.project.ssm.domain;

import javax.persistence.*;

@Table(name = "`shopping_cart_item`")
public class ShoppingCartItem {
    /**
     * 编号
     */
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * 购物车id
     */
    @Column(name = "`cart_id`")
    private Integer cartId;

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
     * 获取购物车id
     *
     * @return cart_id - 购物车id
     */
    public Integer getCartId() {
        return cartId;
    }

    /**
     * 设置购物车id
     *
     * @param cartId 购物车id
     */
    public void setCartId(Integer cartId) {
        this.cartId = cartId;
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
}