package com.talkingdata.plugin.service.impl;

import com.talkingdata.plugin.common.ConfigParames;
import com.talkingdata.plugin.mapper.CDPTraitMapper;
import com.talkingdata.plugin.service.CDPCrowdService;
import com.talkingdata.plugin.service.CDPTraitService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.stereotype.Service;

@EnableScheduling
@Service
@Slf4j
public class CDPTraitServiceImpl implements CDPTraitService,SchedulingConfigurer {

    @Autowired(required = false)
    CDPTraitMapper cdpTraitMapper;

    @Autowired
    ConfigParames configParames;


    @Override
    @Scheduled(fixedRate = 220)
    public void calcTrait() {


    }

    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {

    }
}
