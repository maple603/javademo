package com.javademo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @author maple
 * @name 金色木叶枫
 * @since Created time on 2017/7/30 下午7:31.
 */
@Configuration
public class DataSourceConfig {

    @Bean(name = "masterDataSource")
    @Qualifier("masterDataSource")
    @ConfigurationProperties(prefix="spring.datasource.master")
    public DataSource masterDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "slaveDataSource")
    @Qualifier("slaveDataSource")
    @Primary
    @ConfigurationProperties(prefix="spring.datasource.slave")
    public DataSource slaveDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "masterJdbcTemplate")
    public JdbcTemplate masterJdbcTemplate(
            @Qualifier("masterDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean(name = "slaveJdbcTemplate")
    public JdbcTemplate slaveJdbcTemplate(
            @Qualifier("slaveDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
