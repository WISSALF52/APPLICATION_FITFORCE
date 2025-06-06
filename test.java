package org.example.sport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.junit.jupiter.api.Test;

    @SpringBootTest
    public class test {

        @Autowired
        private JdbcTemplate jdbcTemplate;

        @Test
        public void testDatabaseConnection() {
            String result = jdbcTemplate.queryForObject("SELECT 1", String.class);
            System.out.println("Database connection successful: " + result);
        }
    }

