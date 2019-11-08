package com.cy.project.ssm.viewobject;


import java.util.Date;

/**
 * @author lz - PC
 * @date 2019/11/8 - 14:41
 */
public class CommentVO {

    private Integer id;

    private Integer spu_id;

    private Integer sku_id;

    private String content;

    private Integer star;

    private Integer member_id;

    private String member_name;

    private Date publish_time;

    private Integer hide;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSpu_id() {
        return spu_id;
    }

    public void setSpu_id(Integer spu_id) {
        this.spu_id = spu_id;
    }

    public Integer getSku_id() {
        return sku_id;
    }

    public void setSku_id(Integer sku_id) {
        this.sku_id = sku_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public Integer getMember_id() {
        return member_id;
    }

    public void setMember_id(Integer member_id) {
        this.member_id = member_id;
    }

    public String getMember_name() {
        return member_name;
    }

    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }

    public Date getPublish_time() {
        return publish_time;
    }

    public void setPublish_time(Date publish_time) {
        this.publish_time = publish_time;
    }

    public Integer getHide() {
        return hide;
    }

    public void setHide(Integer hide) {
        this.hide = hide;
    }

    @Override
    public String toString() {
        return "CommentVO{" +
                "id=" + id +
                ", spu_id=" + spu_id +
                ", sku_id=" + sku_id +
                ", content='" + content + '\'' +
                ", star=" + star +
                ", member_id=" + member_id +
                ", member_name='" + member_name + '\'' +
                ", publish_time=" + publish_time +
                ", hide=" + hide +
                '}';
    }
}
