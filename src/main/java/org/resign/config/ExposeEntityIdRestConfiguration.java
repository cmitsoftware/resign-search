package org.resign.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@Configuration
//@EnableMongoRepositories(basePackages = {"org.resign.repo"})
public class ExposeEntityIdRestConfiguration extends RepositoryRestConfigurerAdapter {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
//        config.exposeIdsFor(Resource.class);
//        config.exposeIdsFor(Tag.class);
//        config.exposeIdsFor(User.class);
//        config.exposeIdsFor(ResourceTag.class);
    }
    
}