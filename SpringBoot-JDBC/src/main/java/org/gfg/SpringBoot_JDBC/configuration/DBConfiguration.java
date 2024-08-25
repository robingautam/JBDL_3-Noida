package org.gfg.SpringBoot_JDBC.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@Profile("qa")
public class DBConfiguration {


    @Bean
    public JdbcTemplate jdbcTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();

        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        driverManagerDataSource.setPassword("root");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/jbdl3_jdbcboot");

        jdbcTemplate.setDataSource(driverManagerDataSource);

        return jdbcTemplate;
    }
}
