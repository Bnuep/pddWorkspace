package com.pdd.business.jobs;


import org.apache.log4j.Logger;

import java.util.Date;

/**
 * Created by liugd on 16/1/13.
 */
public class SimpleJob {
    private static final Logger logger = Logger.getLogger(SimpleJob.class);
    public void work() {
        logger.info("--------------------定时任务启动----------------------");
        logger.info("------------------任务结束---当前时间:" + new Date().toString());
    }
}
