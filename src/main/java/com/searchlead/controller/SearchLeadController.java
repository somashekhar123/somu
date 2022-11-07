package com.searchlead.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.searchlead.DTO.LeadData;

@Controller
public class SearchLeadController {

	@RequestMapping("/searchpage")
	public String searchLeadPage()
	{
		return "searchlead";
		
	}
	
	@RequestMapping("/searchlead")
	public String searchLead(@RequestParam("id") long id,ModelMap m)
	{
		LeadRestClient client = new LeadRestClient();
		LeadData lead = client.getLeadById(id);
		m.addAttribute("l", lead);
		
		return "Search_Result";
	}
}
  