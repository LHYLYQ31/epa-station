/**
 * Copyright 2018 SinoSoft. All Rights Reserved.
 */
package com.sinosoft.station;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

import com.sinosoft.station.common.datasource.DynamicDataSourceRegister;

/**
 * <B>系统名称：epa-provider</B><BR>
 * <B>模块名称：程序的主入口</B><BR>
 * <B>中文类名：</B><BR>
 * <B>概要说明：</B><BR>
 * 
 * @author 中科软科技 lihaiyi
 * @since 2018年7月10日
 */
@SpringBootApplication
@Import({ DynamicDataSourceRegister.class }) // 注册动态多数据源
public class Run {
    private final static Logger logger = LoggerFactory.getLogger(Run.class);

    public static void main(String[] args) {
        logger.info("logms:{}", " welcome epa-provider System");
        SpringApplication.run(Run.class, args);

    }

    @Bean
    public TaskScheduler scheduledExecutorService() {
        ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
        scheduler.setPoolSize(8);
        scheduler.setThreadNamePrefix("scheduled-thread-");
        return scheduler;
    }

}
