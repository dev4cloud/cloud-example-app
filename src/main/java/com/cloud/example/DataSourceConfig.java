package com.cloud.example;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource getDataSource() {
        String dbName = System.getenv("APP_DATABASE");
        String dbUsername = System.getenv("APP_DATABASE_USER");
        String dbPassword = System.getenv("APP_DATABASE_PASSWORD");
        String dbUrl = System.getenv("APP_DATABASE_URL");
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:postgresql://" + dbUrl + "/" + dbName);
        dataSourceBuilder.username(dbUsername);
        dataSourceBuilder.password(dbPassword);
        return dataSourceBuilder.build();
    }
}
