package com.dreamport.common;

/**
 * Created by ren.xiaobo on 2017/10/27.
 */
public enum StateEnum {
    INVALID(0, "无效"),
    VALID(1, "有效");

    private final Integer value;
    private final String msg;

    StateEnum(Integer value, String msg) {
        this.value = value;
        this.msg = msg;
    }

    public Integer value() {
        return this.value;
    }

    public String msg() {
        return this.msg;
    }

    public static StateEnum getValueOf(Integer value) {
        StateEnum[] var1 = values();
        for (StateEnum instance : var1) {
            if (instance.value.equals(value)) {
                return instance;
            }
        }

        throw new IllegalArgumentException("No matching constant for [" + value + "]");
    }
}
