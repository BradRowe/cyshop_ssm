package com.cy.project.ssm.viewobject;


import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0.0
 * @ClassName Catalog1VO
 * @Description TODO
 * @Author Administrator
 * @date 2019/11/716:20
 */
public class Catalog1VO {
    private Integer id;

    private String name;

    private String level = "1";

    private List<Catalog2VO> children = new ArrayList<>();

    public Catalog1VO(Integer id, String name, String level, List<Catalog2VO> children) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.children = children;
    }

    public Catalog1VO() {
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public List<Catalog2VO> getChildren() {
        return children;
    }

    public void setChildren(List<Catalog2VO> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Catalog1VO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", level='" + level + '\'' +
                ", children=" + children +
                '}';
    }
}
