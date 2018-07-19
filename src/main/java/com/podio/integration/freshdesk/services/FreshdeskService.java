package com.podio.integration.freshdesk.services;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Base64;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.podio.integration.freshdesk.beans.Contact;
import com.podio.integration.freshdesk.beans.Ticket;
import com.podio.integration.freshdesk.config.RestClientConfig;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;

@Service
public class FreshdeskService {

	@Autowired
	public RestClientConfig restClientConfig;

	public List<Contact> getAllContacts() {

		final String uri = "https://artis-akshay.freshdesk.com/api/v2/contacts";
		RestTemplate restTemplate = restClientConfig.restTemplate();

		HttpEntity<String> entity = new HttpEntity<String>(restClientConfig.createHeaders());
		ResponseEntity<List<Contact>> result = restTemplate.exchange(uri, HttpMethod.GET, entity,
				new ParameterizedTypeReference<List<Contact>>() {
				});
		
		System.out.println(result.getBody());

		return result.getBody();

	}
	
	public Contact getCurrentContact(long id) {
		final String uri = "https://artis-akshay.freshdesk.com/api/v2/contacts/" + id;
		RestTemplate restTemplate = restClientConfig.restTemplate();

		HttpEntity<String> entity = new HttpEntity<String>(restClientConfig.createHeaders());
		ResponseEntity<Contact> result = restTemplate.exchange(uri, HttpMethod.GET, entity,
				new ParameterizedTypeReference<Contact>() {
				});
		
		System.out.println(result.getBody());

		return result.getBody();
	}
	
	public List<Ticket> getAllTickets() {
		final String uri = "https://artis-akshay.freshdesk.com/api/v2/tickets";
		RestTemplate restTemplate = restClientConfig.restTemplate();

		HttpEntity<String> entity = new HttpEntity<String>(restClientConfig.createHeaders());
		ResponseEntity<List<Ticket>> result = restTemplate.exchange(uri, HttpMethod.GET, entity,
				new ParameterizedTypeReference<List<Ticket>>() {
				});
		
		System.out.println(result.getBody());

		return result.getBody();
	}
	
	public Ticket getCurrentTicket(int id) {
		final String uri = "https://artis-akshay.freshdesk.com/api/v2/tickets/" + id;
		RestTemplate restTemplate = restClientConfig.restTemplate();

		HttpEntity<String> entity = new HttpEntity<String>(restClientConfig.createHeaders());
		ResponseEntity<Ticket> result = restTemplate.exchange(uri, HttpMethod.GET, entity,
				new ParameterizedTypeReference<Ticket>() {
				});
		
		System.out.println(result.getBody());

		return result.getBody();
	}

}
