package com.talkingdata.plugin.common;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class ConfigParames {

    @Value("${monitor.update.frequency}")
    private Integer frequecyTime;
}
