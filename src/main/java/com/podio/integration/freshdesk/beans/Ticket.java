package com.podio.integration.freshdesk.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class Ticket {
	
	private List<String> cc_emails;
	private List<String> fwd_emails;
	private List<String> reply_cc_emails;
	private boolean fr_escalated;
	private boolean spam;
	private String email_config_id;
	private String group_id;
	private int priority;
	private long requester_id;
	private long responder_id;
	private int source;
	private long company_id;
	private int status;
	private String subject;
	private int ticketId;
	private String description_text;
	
	public List<String> getCc_emails() {
		return cc_emails;
	}
	public void setCc_emails(List<String> cc_emails) {
		this.cc_emails = cc_emails;
	}
	public List<String> getFwd_emails() {
		return fwd_emails;
	}
	public void setFwd_emails(List<String> fwd_emails) {
		this.fwd_emails = fwd_emails;
	}
	public List<String> getReply_cc_emails() {
		return reply_cc_emails;
	}
	public void setReply_cc_emails(List<String> reply_cc_emails) {
		this.reply_cc_emails = reply_cc_emails;
	}
	public boolean isFr_escalated() {
		return fr_escalated;
	}
	public void setFr_escalated(boolean fr_escalated) {
		this.fr_escalated = fr_escalated;
	}
	public boolean isSpam() {
		return spam;
	}
	public void setSpam(boolean spam) {
		this.spam = spam;
	}
	public String getEmail_config_id() {
		return email_config_id;
	}
	public void setEmail_config_id(String email_config_id) {
		this.email_config_id = email_config_id;
	}
	public String getGroup_id() {
		return group_id;
	}
	public void setGroup_id(String group_id) {
		this.group_id = group_id;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public long getRequester_id() {
		return requester_id;
	}
	public void setRequester_id(long requester_id) {
		this.requester_id = requester_id;
	}
	public long getResponder_id() {
		return responder_id;
	}
	public void setResponder_id(long responder_id) {
		this.responder_id = responder_id;
	}
	public int getSource() {
		return source;
	}
	public void setSource(int source) {
		this.source = source;
	}
	public long getCompany_id() {
		return company_id;
	}
	public void setCompany_id(long company_id) {
		this.company_id = company_id;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getTicketId() {
		return ticketId;
	}
	@JsonProperty("id")
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public String getDescription_text() {
		return description_text;
	}
	public void setDescription_text(String description_text) {
		this.description_text = description_text;
	}
	@Override
	public String toString() {
		return "Ticket [cc_emails=" + cc_emails + ", fwd_emails=" + fwd_emails + ", reply_cc_emails=" + reply_cc_emails
				+ ", fr_escalated=" + fr_escalated + ", spam=" + spam + ", email_config_id=" + email_config_id
				+ ", group_id=" + group_id + ", priority=" + priority + ", requester_id=" + requester_id
				+ ", responder_id=" + responder_id + ", source=" + source + ", company_id=" + company_id + ", status="
				+ status + ", subject=" + subject + ", ticketId=" + ticketId + ", description_text=" + description_text
				+ "]";
	}
	
	
	
}
