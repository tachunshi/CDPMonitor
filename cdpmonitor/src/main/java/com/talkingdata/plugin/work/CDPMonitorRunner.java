package com.talkingdata.plugin.work;

import com.talkingdata.plugin.entity.CDPTrait;

import com.talkingdata.plugin.service.CDPCrowdService;
import com.talkingdata.plugin.service.CDPTraitService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@EnableScheduling   // 2.开启定时任务
public class CDPMonitorRunner implements ApplicationRunner {

    @Autowired
    CDPTraitService cdpTraitService;

    @Autowired
    CDPCrowdService cdpCrowdService;



    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("启动后台指标抽取任务........");
        try {

            workMointor();

        }catch (RuntimeException e){
            log.error("抽取指标任务执行失败。。。。");
            e.printStackTrace();
        }

    }
    @Scheduled(cron = "0/5 * * * * ?")
    public void workMointor() {
        new Thread(() -> cdpTraitService.calcTrait()).start(); // 启动线程
        new Thread(() -> cdpCrowdService.calcCrowd()).start(); // 启动线程
    }


}
