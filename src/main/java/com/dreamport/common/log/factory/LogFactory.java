package com.dreamport.common.log.factory;

import com.dreamport.domain.Log;

import java.util.Date;

/**
 * 日志对象创建工厂
 * Created by ren.xiaobo on 2017/8/9.
 */
public class LogFactory {
    public static Log createOperateLog(String logType,String logName,Long userId,String remark) {
        Log log = new Log();
        log.setLogType("1");
        log.setName(logName);
        log.setUserId(userId);
        log.setCreateTime(new Date());
        log.setSucceed(true);
        log.setRemark(remark);
        return log;
    }
}
