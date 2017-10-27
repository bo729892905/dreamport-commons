package com.dreamport.common.log;

import java.util.TimerTask;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 日志管理器
 * Created by ren.xiaobo on 2017/8/9.
 */
public class LogManager {
    /*异步操作记录日志的线程池*/
    private ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(10);

    private LogManager() {
    }

    private static class LogManageFactory{
        private static LogManager instance = new LogManager();
    }

    public static LogManager getInstance() {
        return LogManageFactory.instance;
    }

    public void executeLog(TimerTask task) {
        int OPERATE_DELAY_TIME = 10;
        executor.schedule(task, OPERATE_DELAY_TIME, TimeUnit.MILLISECONDS);
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return getInstance();
    }
}
