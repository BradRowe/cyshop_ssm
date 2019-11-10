package com.cy.project.ssm.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`comment`")
public class Comment {
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * spu编号
     */
    @Column(name = "`spu_id`")
    private Integer spuId;

    /**
     * sku编号
     */
    @Column(name = "`sku_id`")
    private Integer skuId;

    /**
     * 评论内容
     */
    @Column(name = "`content`")
    private String content;

    /**
     * 评价 1-5星
     */
    @Column(name = "`star`")
    private Integer star;

    /**
     * 用户id
     */
    @Column(name = "`member_id`")
    private Integer memberId;

    /**
     * 用户名称 
     */
    @Column(name = "`member_name`")
    private String memberName;

    /**
     * 发表时间
     */

    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss", timezone="GMT+8")
    @Column(name = "`publish_time`")
    private Date publishTime;


    /**
     * 是否匿名 0-否  1-是
     */
    @Column(name = "`hide`")
    private Integer hide;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取spu编号
     *
     * @return spu_id - spu编号
     */
    public Integer getSpuId() {
        return spuId;
    }

    /**
     * 设置spu编号
     *
     * @param spuId spu编号
     */
    public void setSpuId(Integer spuId) {
        this.spuId = spuId;
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
     * 获取评论内容
     *
     * @return content - 评论内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置评论内容
     *
     * @param content 评论内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取评价 1-5星
     *
     * @return star - 评价 1-5星
     */
    public Integer getStar() {
        return star;
    }

    /**
     * 设置评价 1-5星
     *
     * @param star 评价 1-5星
     */
    public void setStar(Integer star) {
        this.star = star;
    }

    /**
     * 获取用户id
     *
     * @return member_id - 用户id
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * 设置用户id
     *
     * @param memberId 用户id
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * 获取用户名称 
     *
     * @return member_name - 用户名称 
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * 设置用户名称 
     *
     * @param memberName 用户名称 
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    /**
     * 获取发表时间
     *
     * @return publish_time - 发表时间
     */
    public Date getPublishTime() {
        return publishTime;
    }

    /**
     * 设置发表时间
     *
     * @param publishTime 发表时间
     */
    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    /**
     * 获取是否匿名 0-否  1-是
     *
     * @return hide - 是否匿名 0-否  1-是
     */
    public Integer getHide() {
        return hide;
    }

    /**
     * 设置是否匿名 0-否  1-是
     *
     * @param hide 是否匿名 0-否  1-是
     */
    public void setHide(Integer hide) {
        this.hide = hide;
    }
}