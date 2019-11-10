package com.cy.project.ssm.viewobject;

/**
 * @version 1.0.0
 * @ClassName Catalog3VO
 * @Description TODO
 * @Author Administrator
 * @date 2019/11/716:51
 */
public class Catalog3VO {
    private Integer id;

    private Integer pid;

    private String name;

    private String level = "三级分类";

    public Catalog3VO(Integer id, Integer pid, String name, String level) {
        this.id = id;
        this.pid = pid;
        this.name = name;
        this.level = level;
    }

    public Catalog3VO() {
    }

    @Override
    public String toString() {
        return "Catalog3VO{" +
                "id=" + id +
                ", pid=" + pid +
                ", name='" + name + '\'' +
                ", level='" + level + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
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
}
