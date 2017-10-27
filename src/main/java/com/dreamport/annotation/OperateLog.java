package com.dreamport.annotation;

import com.dreamport.common.log.LogModule;
import com.dreamport.common.log.LogType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by ren.xiaobo on 2017/8/9.
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface OperateLog {
    LogModule module();

    LogType type();
}
