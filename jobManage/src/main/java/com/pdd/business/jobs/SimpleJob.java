package com.pdd.business.jobs;

import com.pdd.business.entity.User;
import com.pdd.business.service.IUserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * Created by liugd on 16/1/13.
 */
public class SimpleJob {
    private static final Logger logger = Logger.getLogger(SimpleJob.class);
    @Autowired
    private IUserService userService;

    public void work() {
        logger.info("--------------------定时任务启动----------------------");
//        User user = userService.getUserByName("Tom");
//        logger.info("用户id:" + user.getId());
//        logger.info("用户名字:" + user.getName());
        List<User> users = userService.getAllUser();
        for (User u : users) {
            logger.info("用户id:" + u.getId());
            logger.info("用户名字:" + u.getName());
        }
        logger.info("------------------任务结束---当前时间:" + new Date().toString());
    }
}
