package com.searchlead.controller;

import org.springframework.web.client.RestTemplate;

import com.searchlead.DTO.LeadData;

public class LeadRestClient {
	
	public LeadData getLeadById(long id)
	{
		RestTemplate rest = new RestTemplate();
		LeadData lead = rest.getForObject("http://localhost:8080/api/leads/get/"+id, LeadData.class);
		return lead;
	}
	

}
