package com.skalicky.tomas.cv.persistence.config;

import java.net.UnknownHostException;

import javax.inject.Inject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

/**
 * @author <a href="mailto:skalicky.tomas@gmail.com">Tomas Skalicky</a>
 */
@Configuration
@ComponentScan(basePackages = SpringMongoConfig.BASE_APP_PACKAGE)
@EnableMongoRepositories(basePackages = SpringMongoConfig.BASE_REPOSITORY_PACKAGE)
public class SpringMongoConfig {

    static final String BASE_APP_PACKAGE = "com.skalicky.tomas.cv";
    static final String BASE_REPOSITORY_PACKAGE = BASE_APP_PACKAGE + ".persistence.repository";

    @Inject
    private MongoProperties mongoProperties;

    @Bean
    public Mongo mongo() throws UnknownHostException {
        return new MongoClient(mongoProperties.getTunneledMongoHost(), mongoProperties.getTunneledMongoPort());
    }

    @Bean
    public MongoDbFactory mongoDbFactory() throws Exception {
        return new SimpleMongoDbFactory(mongo(), mongoProperties.getMongoDatabaseName());
    }

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongoDbFactory());
    }
}
