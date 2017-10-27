package com.dreamport.common.log;

/**
 * Created by ren.xiaobo on 2017/8/9.
 */
public enum LogType {
    ADD("1", "新增"),
    UPDATE("2", "修改"),
    DELETE("3", "删除");

    private final String value;
    private final String msg;

    LogType(String value, String msg) {
        this.value = value;
        this.msg = msg;
    }

    public String value() {
        return value;
    }

    public String msg() {
        return msg;
    }
}
