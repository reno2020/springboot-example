package com.yanfei1819.timedtaskdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 定时任务
 */
@SpringBootApplication
@EnableScheduling
public class TimedTaskDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TimedTaskDemoApplication.class, args);
    }

}
