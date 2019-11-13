package com.cy.project.ssm.viewobject;

import com.cy.project.ssm.domain.SkuModel;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.List;

/**
 * @version 1.0.0
 * @ClassName SkuModelVO
 * @Description TODO
 * @Author Administrator
 * @date 2019/11/1022:49
 */
public class SkuModelVO  {

    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * 模型名称
     */
    @Column(name = "`name`")
    private String name;


    @Column(name = "`catalog3_name`")
    private String catalog3Name;

    @Override
    public String toString() {
        return "SkuModelVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", catalog3Name='" + catalog3Name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatalog3Name() {
        return catalog3Name;
    }

    public void setCatalog3Name(String catalog3Name) {
        this.catalog3Name = catalog3Name;
    }
}
