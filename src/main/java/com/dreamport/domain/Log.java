package com.dreamport.domain;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by ren.xiaobo on 2017/8/9.
 */
@TableName("t_log")
public class Log implements Serializable {
    private static final long serialVersionUID = 2554675162458055989L;

    private Long id;
    /**
     * 操作类型
     */
    private String logType;
    /**
     * 操作名称
     */
    private String name;
    /**
     * 用户ID
     */
    private Long userId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 是否成功
     */
    private Boolean succeed;
    /**
     * 备注
     */
    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getSucceed() {
        return succeed;
    }

    public void setSucceed(Boolean succeed) {
        this.succeed = succeed;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", logType='" + logType + '\'' +
                ", name='" + name + '\'' +
                ", userId=" + userId +
                ", createTime=" + createTime +
                ", succeed=" + succeed +
                ", remark='" + remark + '\'' +
                '}';
    }
}
