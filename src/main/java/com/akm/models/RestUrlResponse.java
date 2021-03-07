package com.akm.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="REST_URL_RESPONSE")
public class RestUrlResponse {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String  url ;
	
	private String  response;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
	
	

}
