package com.wpeng.trsrd.utils;

import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * neo4j配置
 */
@Configuration
public class Neo4jConf {
    @Value("${spring.neo4j.uri}")
    private String url;
    @Value("${spring.neo4j.authentication.username}")
    private String username;
    @Value("${spring.neo4j.authentication.password}")
    private String password;

    @Bean(name = "driver")
    public Driver initDriver() {
        Driver driver;
        try {
            driver = GraphDatabase.driver(url, AuthTokens.basic(username, password));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return driver;
    }
}
