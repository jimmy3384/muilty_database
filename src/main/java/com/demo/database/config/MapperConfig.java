package com.demo.database.config;

import com.base.BaseMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

import java.util.Properties;

/**
 * Created by xu.haifeng on 2017/8/10.
 */
@Configuration
public class MapperConfig {
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.demo.database.mapper");
        Properties properties = new Properties();
        // 这里要特别注意，不要把BaseMapper放到 basePackage 中，也就是不能同其他Mapper一样被扫描到。
        properties.setProperty("notEmpty", "false");
        properties.setProperty("IDENTITY", "MYSQL");
        mapperScannerConfigurer.setProperties(properties);
        mapperScannerConfigurer.setMarkerInterface(BaseMapper.class);
        return mapperScannerConfigurer;
    }
}
