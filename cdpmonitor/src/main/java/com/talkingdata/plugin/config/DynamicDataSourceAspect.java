package com.talkingdata.plugin.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DynamicDataSourceAspect {
    private static final Logger logger = LoggerFactory.getLogger(DynamicDataSourceAspect.class);

    @Before("@annotation(targetDataSources)")
    public void changeDataSource(JoinPoint point, DataSource targetDataSources) throws Throwable {
        String dsId = targetDataSources.value();
        if (DynamicDataSourceContextHolder.dataSourceIds.contains(dsId)) {
            logger.debug("Use DataSource :{} >", dsId, point.getSignature());
            DynamicDataSourceContextHolder.setDataSourceRouterKey(dsId);
        } else {
            logger.debug("数据源[{}]不存在，使用默认数据源 >{}", dsId, point.getSignature());
            DynamicDataSourceContextHolder.setDataSourceRouterKey(dsId);
        }
    }

    @After("@annotation(targetDataSources)")
    public void restoreDataSource(JoinPoint point, DataSource targetDataSources) {
        logger.debug("Revert DataSource : " + targetDataSources.value() + " > " + point.getSignature());
        DynamicDataSourceContextHolder.removeDataSourceRouterKey();

    }
}