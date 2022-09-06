package com.closon.essence;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

@Configuration
@Component
public class TaskTest implements SchedulingConfigurer {
    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
//        taskRegistrar.addFixedDelayTask(this::sysout, 1000);
        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        taskRegistrar.setScheduler(new ScheduledThreadPoolExecutor(5, threadFactory, new ThreadPoolExecutor.AbortPolicy()));
    }

    @Scheduled(initialDelay = 3000, fixedDelay = 2000)
    public void sysout() {
        System.out.println("定时任务，2秒执行一次" + LocalDateTime.now() + " 线程：" + Thread.currentThread().getName());
    }

    @Scheduled(initialDelay = 3000, fixedDelay = 2000)
    public void sysout2() {
        System.out.println("定时任务2，2秒执行一次" + LocalDateTime.now() + " 线程：" + Thread.currentThread().getName());
    }
}
