package com.dreamport.bo;

import com.wordnik.swagger.annotations.ApiModelProperty;

import javax.ws.rs.QueryParam;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by ren.xiaobo on 2017/7/31.
 */
public class UserBO implements Serializable {
    private static final long serialVersionUID = -2435901068762717484L;

    /**
     * 用户名
     */
    @ApiModelProperty(value = "用户名")
    @QueryParam("username")
    private String username;
    /**
     * 真实姓名
     */
    @ApiModelProperty(value = "真实姓名")
    @QueryParam("realName")
    private String realName;
    /**
     * 性别
     */
    @ApiModelProperty(value = "性别：0-男，1-女")
    @QueryParam("gender")
    private Integer gender;
    /**
     * 手机号
     */
    @ApiModelProperty(value = "手机号")
    @QueryParam("mobilePhone")
    private String mobilePhone;
    /**
     * 邮箱
     */
    @ApiModelProperty(value = "性别：0-男，1-女")
    @QueryParam("email")
    private String email;
    /**
     * 是否锁定
     */
    @ApiModelProperty(value = "锁定状态")
    @QueryParam("locked")
    private Boolean locked;
    /**
     * 角色id
     */
    @QueryParam("roleId")
    private Long roleId;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "UserBO{" +
                "username='" + username + '\'' +
                ", realName='" + realName + '\'' +
                ", gender=" + gender +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", email='" + email + '\'' +
                ", locked=" + locked +
                ", roleId=" + roleId +
                '}';
    }
}
