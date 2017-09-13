package com.demo.database.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by xu.haifeng on 2017/8/10.
 */
@Aspect
@Component
public class SwitchToSecondDbAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(SwitchToSecondDbAspect.class);

    @Around("@annotation(com.demo.database.config.SecondDb)")
    public Object process(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        try {
            LOGGER.info("=============set db to DB2=============");
            DatabaseContextHolder.setDatabaseType(DatabaseType.DB2);
            return proceedingJoinPoint.proceed();
        } finally {
            DatabaseContextHolder.clearDatabaseType();
            LOGGER.info("=============restore db connection=============");
        }

    }
}
