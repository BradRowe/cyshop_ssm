package com.cy.project.ssm.TO;

/**
 * @version 1.0.0
 * @ClassName SkuMatchTO
 * @Description TODO
 * @Author 吴桐
 * @date 2019/11/1517:40
 */
public class SkuMatchTO {

    private String attri;

    private String value;

    @Override
    public String toString() {
        return "SkuMatchTO{" +
                "attri='" + attri + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public String getAttri() {
        return attri;
    }

    public void setAttri(String attri) {
        this.attri = attri;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
