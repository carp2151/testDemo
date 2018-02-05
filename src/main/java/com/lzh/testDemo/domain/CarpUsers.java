package com.lzh.testDemo.domain;

import lombok.Data;

import java.util.Date;

@Data
public class CarpUsers {
    /**
     * 工号
     */
    private String number;
    /**
     * 昵称
     */
    private String username;
    /**
     * 所在组
     */
    private String groups;
    /**
     * 联系方式
     */
    private String phone;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;

    @Override
    public String toString() {
        return "CarpUsers{" +
                "number='" + number + '\'' +
                ", username='" + username + '\'' +
                ", groups='" + groups + '\'' +
                ", phone='" + phone + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    /**
     * 有参的构造方法
     *
     * @param number 工号
     * @param username 昵称
     * @param groups 所在组
     * @param phone 联系方式
     */
    public CarpUsers(String number, String username, String groups, String phone) {
        this.number = number;
        this.username = username;
        this.groups = groups;
        this.phone = phone;
    }

    public CarpUsers() {
    }
}
