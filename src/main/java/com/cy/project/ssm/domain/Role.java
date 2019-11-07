package com.cy.project.ssm.domain;

import javax.persistence.*;

@Table(name = "`role`")
public class Role {
    /**
     * 角色id
     */
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * 角色名称
     */
    @Column(name = "`role_name`")
    private String roleName;

    /**
     * 角色说明
     */
    @Column(name = "`description`")
    private String description;

    /**
     * 角色状态，1为角色启用，0为角色未启用
     */
    @Column(name = "`status`")
    private Integer status;

    /**
     * 获取角色id
     *
     * @return id - 角色id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置角色id
     *
     * @param id 角色id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取角色名称
     *
     * @return role_name - 角色名称
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 设置角色名称
     *
     * @param roleName 角色名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * 获取角色说明
     *
     * @return description - 角色说明
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置角色说明
     *
     * @param description 角色说明
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取角色状态，1为角色启用，0为角色未启用
     *
     * @return status - 角色状态，1为角色启用，0为角色未启用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置角色状态，1为角色启用，0为角色未启用
     *
     * @param status 角色状态，1为角色启用，0为角色未启用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}