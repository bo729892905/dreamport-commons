package com.dreamport.common.log;

/**
 * Created by ren.xiaobo on 2017/8/9.
 */
public enum LogModule {
    USER("0001", "用户管理");

    private final String value;
    private final String msg;

    LogModule(String value, String msg) {
        this.value = value;
        this.msg = msg;
    }

    public String value() {
        return this.value;
    }

    public String msg() {
        return this.msg;
    }
}
