package com.cy.project.ssm.domain;

import javax.persistence.*;

@Table(name = "`sku_attri`")
public class SkuAttri {
    @Id
    @Column(name = "`id`")
    private Integer id;

    @Column(name = "`name`")
    private String name;

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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}