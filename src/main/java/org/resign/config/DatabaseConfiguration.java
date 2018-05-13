package org.resign.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.MongoClient;

@Configuration
//@EnableMongoRepositories(basePackages = {"org.resign.repo"})
@PropertySource(
		value={"classpath:db.properties"},
        ignoreResourceNotFound = true)
public class DatabaseConfiguration extends AbstractMongoConfiguration {
	
	@Value("${db.host}")
    String host;
	
	@Value("${db.port}")
	Integer port;
	
	@Value("${db.name}")
    String name;
	
    @Override
    protected String getDatabaseName() {
        return name;
    }

	@Override
	public MongoClient mongoClient() {
		return new MongoClient(host, port);
	}
	
}