package com.cy.project.ssm.domain;

import javax.persistence.*;

@Table(name = "`member_address`")
public class MemberAddress {
    /**
     * 编号
     */
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * 用户编号
     */
    @Column(name = "`member_id`")
    private Integer memberId;

    /**
     * 省
     */
    @Column(name = "`province`")
    private String province;

    /**
     * 市
     */
    @Column(name = "`city`")
    private String city;

    /**
     * 区
     */
    @Column(name = "`district`")
    private String district;

    /**
     * 详细地址
     */
    @Column(name = "`specific_address`")
    private String specificAddress;

    /**
     * 收货人姓名
     */
    @Column(name = "`consignee_name`")
    private String consigneeName;

    /**
     * 联系电话
     */
    @Column(name = "`phone`")
    private String phone;

    /**
     * 是否为默认地址 0-否 1-是
     */
    @Column(name = "`defualt`")
    private Integer defualt;

    /**
     * 获取编号
     *
     * @return id - 编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户编号
     *
     * @return member_id - 用户编号
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * 设置用户编号
     *
     * @param memberId 用户编号
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * 获取省
     *
     * @return province - 省
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省
     *
     * @param province 省
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取市
     *
     * @return city - 市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置市
     *
     * @param city 市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取区
     *
     * @return district - 区
     */
    public String getDistrict() {
        return district;
    }

    /**
     * 设置区
     *
     * @param district 区
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * 获取详细地址
     *
     * @return specific_address - 详细地址
     */
    public String getSpecificAddress() {
        return specificAddress;
    }

    /**
     * 设置详细地址
     *
     * @param specificAddress 详细地址
     */
    public void setSpecificAddress(String specificAddress) {
        this.specificAddress = specificAddress;
    }

    /**
     * 获取收货人姓名
     *
     * @return consignee_name - 收货人姓名
     */
    public String getConsigneeName() {
        return consigneeName;
    }

    /**
     * 设置收货人姓名
     *
     * @param consigneeName 收货人姓名
     */
    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
    }

    /**
     * 获取联系电话
     *
     * @return phone - 联系电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置联系电话
     *
     * @param phone 联系电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取是否为默认地址 0-否 1-是
     *
     * @return defualt - 是否为默认地址 0-否 1-是
     */
    public Integer getDefualt() {
        return defualt;
    }

    /**
     * 设置是否为默认地址 0-否 1-是
     *
     * @param defualt 是否为默认地址 0-否 1-是
     */
    public void setDefualt(Integer defualt) {
        this.defualt = defualt;
    }
}