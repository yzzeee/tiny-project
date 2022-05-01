package com.eta.space.video;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest(
        properties = "spring.datasource.type=com.zaxxer.hikari.HikariDataSource"
)
public class DatasourceTests {

    static {
        System.setProperty("jasypt.encryptor.password", "eta");
    }

    @Autowired
    private DataSource dataSource;

    @Test
    public void hikariConnectionPoolIsConfigured() {
        assertEquals("com.zaxxer.hikari.HikariDataSource", dataSource.getClass().getName());
    }
}
