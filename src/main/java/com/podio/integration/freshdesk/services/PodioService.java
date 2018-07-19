package com.podio.integration.freshdesk.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.event.EventListener;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.podio.APIFactory;
import com.podio.ResourceFactory;
import com.podio.contact.Profile;
import com.podio.oauth.OAuthClientCredentials;
import com.podio.oauth.OAuthUsernameCredentials;
import com.podio.user.UserAPI;

@Configuration
@PropertySource("classpath:application.properties")
public class PodioService {

	@Autowired
    private Environment env;
	
	@EventListener(ApplicationReadyEvent.class)
	public void connectPodio() {
		
		String clientSecret = env.getProperty("clientSecret");
		String clientId = env.getProperty("clientId");
		String username = env.getProperty("username");
		String password = env.getProperty("password");
		
		ResourceFactory resourceFactory = new ResourceFactory(new OAuthClientCredentials(clientId, clientSecret),
		        new OAuthUsernameCredentials(username, password));
		
		APIFactory apiFactory = new APIFactory(resourceFactory);
		
		UserAPI userAPI = apiFactory.getAPI(UserAPI.class);
		Profile profile = userAPI.getProfile();
		System.out.println(profile.getName());
		System.out.println(profile.getPhones());
		System.out.println(profile.getSkype());
	}

}
