package com.cy.project.ssm.domain;

import javax.persistence.*;

@Table(name = "`member`")
public class Member {
    /**
     * 编号
     */
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * 用户等级
     */
    @Column(name = "`level_id`")
    private Integer levelId;

    /**
     * 用户账号
     */
    @Column(name = "`account`")
    private String account;

    /**
     * 用户密码
     */
    @Column(name = "`password`")
    private String password;

    /**
     * 用户姓名
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 用户状态 0 冻结 1 激活
     */
    @Column(name = "`status`")
    private Integer status;

    /**
     * 用户手机号
     */
    @Column(name = "`phone`")
    private String phone;

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
     * 获取用户等级
     *
     * @return level_id - 用户等级
     */
    public Integer getLevelId() {
        return levelId;
    }

    /**
     * 设置用户等级
     *
     * @param levelId 用户等级
     */
    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    /**
     * 获取用户账号
     *
     * @return account - 用户账号
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置用户账号
     *
     * @param account 用户账号
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 获取用户密码
     *
     * @return password - 用户密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置用户密码
     *
     * @param password 用户密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取用户姓名
     *
     * @return name - 用户姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置用户姓名
     *
     * @param name 用户姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取用户状态 0 冻结 1 激活
     *
     * @return status - 用户状态 0 冻结 1 激活
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置用户状态 0 冻结 1 激活
     *
     * @param status 用户状态 0 冻结 1 激活
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取用户手机号
     *
     * @return phone - 用户手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置用户手机号
     *
     * @param phone 用户手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
}