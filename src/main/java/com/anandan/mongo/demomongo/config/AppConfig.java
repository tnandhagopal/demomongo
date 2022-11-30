package com.anandan.mongo.demomongo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@EnableMongoRepositories(basePackages = {"com.anandan.mongo.demomongo"})
@Configuration
public class AppConfig {
}
