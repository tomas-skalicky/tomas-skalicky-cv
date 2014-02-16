package com.skalicky.tomas.cv.persistence.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Loader of MongoDB properties from mongodb.properties file.
 * 
 * @author <a href="mailto:skalicky.tomas@gmail.com">Tomas Skalicky</a>
 */
@Configuration
@PropertySource("classpath:environment/mongodb.properties")
public class MongoProperties {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Value("${mongo.host.tunneled}")
    private String tunneledMongoHost;

    @Value("${mongo.port.tunneled}")
    private Integer tunneledMongoPort;

    @Value("${mongo.database.name}")
    private String mongoDatabaseName;

    public String getTunneledMongoHost() {
        return tunneledMongoHost;
    }

    public void setTunneledMongoHost(String tunneledMongoHost) {
        this.tunneledMongoHost = tunneledMongoHost;
    }

    public Integer getTunneledMongoPort() {
        return tunneledMongoPort;
    }

    public void setTunneledMongoPort(Integer tunneledMongoPort) {
        this.tunneledMongoPort = tunneledMongoPort;
    }

    public String getMongoDatabaseName() {
        return mongoDatabaseName;
    }

    public void setMongoDatabaseName(String mongoDatabaseName) {
        this.mongoDatabaseName = mongoDatabaseName;
    }
}
