package com.owen.cloudmarket.portal.controllers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.WebContentInterceptor;

/**
 * 总的控制层，该层定义的东西与子类分享。如，在dispatcher-context.xml文件中设置
 * @author OwenWilliam
 *
 */
public class CloudstreetWebAppWCI extends WebContentInterceptor
{

	public CloudstreetWebAppWCI()
	{
		setRequireSession(false);
		setCacheSeconds(120);
		setSupportedMethods("GET","POST","OPTIONS","HEAD");
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
		//super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception
	{
		// TODO Auto-generated method stub
		//super.afterCompletion(request, response, handler, ex);
	}
	
	
	
}
