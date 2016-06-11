package com.owen.cloudmarket.api.controllers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.WebContentInterceptor;

public class CloudstreetWebAppWCI extends WebContentInterceptor
{

	public CloudstreetWebAppWCI()
	{
		setRequireSession(false);
		setCacheSeconds(0);
	}

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler)
			throws ServletException
	{
		super.preHandle(request, response, handler);
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception
	{
		// TODO Auto-generated method stub
		super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception
	{
		// TODO Auto-generated method stub
		super.afterCompletion(request, response, handler, ex);
	}
	
	
	
}
