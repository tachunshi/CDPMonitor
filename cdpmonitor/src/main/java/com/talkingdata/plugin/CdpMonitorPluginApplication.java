package com.talkingdata.plugin;

import com.talkingdata.plugin.config.DynamicDataSourceRegister;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(DynamicDataSourceRegister.class)
@MapperScan("com.talkingdata.lugin.mapper")
public class CdpMonitorPluginApplication {

    public static void main(String[] args) {

    	SpringApplication.run(CdpMonitorPluginApplication.class, args);
    }
}
