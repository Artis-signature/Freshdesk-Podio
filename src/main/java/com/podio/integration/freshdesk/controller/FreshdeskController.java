package com.podio.integration.freshdesk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.podio.integration.freshdesk.beans.Contact;
import com.podio.integration.freshdesk.beans.Ticket;
import com.podio.integration.freshdesk.services.FreshdeskService;
import com.sun.jersey.api.client.WebResource;

@RestController
public class FreshdeskController {
	
	@Autowired
	public FreshdeskService freshdeskService;
	
	@RequestMapping(value = "/contacts", method = RequestMethod.GET)
	public List<Contact> getAllContacts() {
		
		System.out.println("In freshdesk connection");
		Object contacts = freshdeskService.getAllContacts();
		List<Contact> contact = (List<Contact>) contacts;
		
		
		return contact;
	}
	
	@RequestMapping(value = "/contacts/{contactId}", method = RequestMethod.GET)
	public Contact getCurrentContact(@PathVariable("contactId") long contactId) {
		System.out.println("In single contact");
		Object object = freshdeskService.getCurrentContact(contactId);
		Contact currentContact = (Contact)object;
		return currentContact;
	}
	
	@RequestMapping(value = "/tickets", method = RequestMethod.GET)
	public List<Ticket> getAllTickets(){
		System.out.println("In getAllTickets");
		Object object = freshdeskService.getAllTickets();
		List<Ticket> tickets = (List<Ticket>)object;
		
		return tickets;
	}
	
	@RequestMapping(value = "/tickets/{ticketId}")
	public Ticket getCurrentTicket(@PathVariable("ticketId") int ticketId) {
		System.out.println("In single ticket");
		Object object = freshdeskService.getCurrentTicket(ticketId);
		Ticket currentTicket = (Ticket) object;
		return currentTicket;
	}

}
