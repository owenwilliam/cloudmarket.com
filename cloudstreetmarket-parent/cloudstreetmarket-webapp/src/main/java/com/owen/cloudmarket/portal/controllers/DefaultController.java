package com.owen.cloudmarket.portal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.owen.cloudmarket.core.services.ICommunityService;
import com.owen.cloudmarket.core.services.IMarketService;

@Controller
public class DefaultController extends CloudstreetWebAppWCI
{
	@Autowired
	private IMarketService marketService;
	
	@Autowired
	private ICommunityService communityService;
	

	
	@RequestMapping(value="/*",method={RequestMethod.GET,RequestMethod.HEAD})
    public String fallback(Model model)
    {
		model.addAttribute("dailyMarketActivity", marketService.getLastDayMarketActivity("GDAXI"));
		model.addAttribute("dailyMarketsActivity", marketService.getLastDayMarketsOverview());
		model.addAttribute("recentUserActivity", communityService.getLastUserPublicActivity(10));
    	return "index";
    }
}
