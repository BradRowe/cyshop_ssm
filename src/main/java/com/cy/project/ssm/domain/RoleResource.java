package com.cy.project.ssm.domain;

import javax.persistence.*;

@Table(name = "`role_resource`")
public class RoleResource {
    @Id
    @Column(name = "`id`")
    private Integer id;

    @Column(name = "`role_id`")
    private Integer roleId;

    @Column(name = "`resource_id`")
    private Integer resourceId;

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
     * @return role_id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * @param roleId
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * @return resource_id
     */
    public Integer getResourceId() {
        return resourceId;
    }

    /**
     * @param resourceId
     */
    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }
}