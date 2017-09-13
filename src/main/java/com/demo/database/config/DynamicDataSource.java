package com.demo.database.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by xu.haifeng on 2017/8/10.
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    protected Object determineCurrentLookupKey() {
        return DatabaseContextHolder.getDatabaseType();
    }
}
