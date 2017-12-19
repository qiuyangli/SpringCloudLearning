package com.spring;

import javax.servlet.http.HttpServletRequest;

import com.alibaba.fastjson.JSONObject;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class AccessFilter extends ZuulFilter {
    
	@Override
	public String filterType() {
	    return "pre";
	}
    
	@Override
	public int filterOrder() {        
	    return 0;
	}
    
	@Override
	public boolean shouldFilter() {
	    return true;
	}
    
	@Override
	public Object run() {
	    RequestContext ctx = RequestContext.getCurrentContext();
	    HttpServletRequest request = ctx.getRequest();
	    Object accessToken = request.getParameter("accessToken");
	    JSONObject a = new JSONObject();
	    if (accessToken == null) {
	        a.put("errcode", "10000");
		a.put("description", "token is null");
		ctx.setResponseBody(a.toString());
		return ctx;
	    }
	    return null;
	}
	
}