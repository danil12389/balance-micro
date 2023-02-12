package ru.kazelin.balance.utils;

import org.springframework.jdbc.core.JdbcTemplate;

public class PostgresConnector {

    private final JdbcTemplate jdbcTemplate;

    public PostgresConnector(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


}

