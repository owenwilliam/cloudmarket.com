package com.owen.cloudmarket.portal.controllers;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.owen.cloudmarket.core.services.CommunityService;
import com.owen.cloudmarket.core.services.IMarketService;

/**
 * 默认控制器
 * 
 * @author OwenWilliam 2016-6-10
 * @since
 * @version v2.x.x
 *
 */
@Controller
public class DefaultController extends CloudstreetWebAppWCI
{
	@Autowired
	private IMarketService marketService;

	@Autowired
	@Qualifier("communityServiceImpl")
	private CommunityService communityService;

	@RequestMapping(value="/*", method={RequestMethod.GET,RequestMethod.HEAD})
	public String fallback(Model model, @RequestParam(value="spi", required=false) String spi) {
		
		if(StringUtils.isNotBlank(spi)){
			model.addAttribute("spi", spi);
		}

		return "index";
	}	
}
