package org.resign.processor;

import org.resign.config.RestConfiguration;
import org.resign.repo.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.stereotype.Component;

@Component
public class ResourceProcessor implements org.springframework.hateoas.ResourceProcessor<org.springframework.hateoas.Resource<Resource>>{

	@Autowired
	RestConfiguration restConfiguration;
	
	public org.springframework.hateoas.Resource<Resource> process(org.springframework.hateoas.Resource<Resource> resource) {
		
		/*
		 * View resource image 
		 */
		resource.add(new Link(
				restConfiguration.getResignImagesHost() 
				+ restConfiguration.getResignImagesContext() 
				+ "/view/{imageId}","viewImage"));
		
        return resource;
	}
}
