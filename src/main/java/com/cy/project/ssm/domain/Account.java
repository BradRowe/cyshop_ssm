package com.xuetang9.frame.ssm.domain;

import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;

/**
 * TODO
 *
 * @author 洋葱
 * @version 1.0.0
 * @date 2019/10/28 17:15
 * @place 公司
 * @copyright 老九学堂
 */
public class Account implements Serializable {

    private Integer id;

    @NotEmpty(message = "{account.username.required}")
    private String userName;

    private String userPassword;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }
}
