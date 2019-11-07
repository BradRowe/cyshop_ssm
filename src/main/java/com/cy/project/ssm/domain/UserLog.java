package com.cy.project.ssm.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`user_log`")
public class UserLog {
    /**
     * 后台管理日志表id
     */
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * 操作信息
     */
    @Column(name = "`mes`")
    private String mes;

    /**
     * 管理员id
     */
    @Column(name = "`user_id`")
    private Integer userId;

    /**
     * 操作时间
     */
    @Column(name = "`time`")
    private Date time;

    /**
     * 获取后台管理日志表id
     *
     * @return id - 后台管理日志表id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置后台管理日志表id
     *
     * @param id 后台管理日志表id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取操作信息
     *
     * @return mes - 操作信息
     */
    public String getMes() {
        return mes;
    }

    /**
     * 设置操作信息
     *
     * @param mes 操作信息
     */
    public void setMes(String mes) {
        this.mes = mes;
    }

    /**
     * 获取管理员id
     *
     * @return user_id - 管理员id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置管理员id
     *
     * @param userId 管理员id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取操作时间
     *
     * @return time - 操作时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置操作时间
     *
     * @param time 操作时间
     */
    public void setTime(Date time) {
        this.time = time;
    }
}