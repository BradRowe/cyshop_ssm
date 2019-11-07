package com.cy.project.ssm.domain;

import javax.persistence.*;

@Table(name = "`user`")
public class User {
    /**
     * 管理员id
     */
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * 管理员账号
     */
    @Column(name = "`user_account`")
    private String userAccount;

    /**
     * 管理员密码
     */
    @Column(name = "`user_password`")
    private String userPassword;

    /**
     * 管理员状态，1为已激活，2为未激活
     */
    @Column(name = "`status`")
    private Integer status;

    /**
     * 获取管理员id
     *
     * @return id - 管理员id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置管理员id
     *
     * @param id 管理员id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取管理员账号
     *
     * @return user_account - 管理员账号
     */
    public String getUserAccount() {
        return userAccount;
    }

    /**
     * 设置管理员账号
     *
     * @param userAccount 管理员账号
     */
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    /**
     * 获取管理员密码
     *
     * @return user_password - 管理员密码
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * 设置管理员密码
     *
     * @param userPassword 管理员密码
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * 获取管理员状态，1为已激活，2为未激活
     *
     * @return status - 管理员状态，1为已激活，2为未激活
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置管理员状态，1为已激活，2为未激活
     *
     * @param status 管理员状态，1为已激活，2为未激活
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}