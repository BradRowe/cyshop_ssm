package com.cy.project.ssm.domain;

import javax.persistence.*;

@Table(name = "`resource`")
public class Resource {
    /**
     * 资源id
     */
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * 资源名称
     */
    @Column(name = "`resource_name`")
    private String resourceName;

    /**
     * 该资源说明
     */
    @Column(name = "`description`")
    private String description;

    /**
     * url地址
     */
    @Column(name = "`url`")
    private String url;

    /**
     * 获取资源id
     *
     * @return id - 资源id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置资源id
     *
     * @param id 资源id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取资源名称
     *
     * @return resource_name - 资源名称
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * 设置资源名称
     *
     * @param resourceName 资源名称
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * 获取该资源说明
     *
     * @return description - 该资源说明
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置该资源说明
     *
     * @param description 该资源说明
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取url地址
     *
     * @return url - url地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置url地址
     *
     * @param url url地址
     */
    public void setUrl(String url) {
        this.url = url;
    }
}