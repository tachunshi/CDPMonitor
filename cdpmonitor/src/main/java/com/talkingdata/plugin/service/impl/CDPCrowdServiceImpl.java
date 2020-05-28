package com.talkingdata.plugin.service.impl;

import com.talkingdata.plugin.mapper.CDPCrowdMapper;
import com.talkingdata.plugin.service.CDPCrowdService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CDPCrowdServiceImpl implements CDPCrowdService {


    @Autowired(required = false)
    CDPCrowdMapper cdpCrowdMapper;

    @Override
    public void calcCrowd() {

    }
}
