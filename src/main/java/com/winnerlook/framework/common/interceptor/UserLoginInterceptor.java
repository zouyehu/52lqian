package com.winnerlook.framework.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class UserLoginInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		System.out.println("访问路径："+request.getRequestURI());
    	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+ request.getContextPath();
    	System.out.println("项目路径："+basePath);
    	
    	if(request.getRequestURI().contains("home/")){
    		return true;
    	}
    	
    	if(request.getRequestURI().contains("logn/procity")){
    		return true;
    	}
    	if(request.getRequestURI().contains("logn/pcode")){
    		return true;
    	}
    	
    	String conString = request.getHeader("REFERER");
        if(StringUtils.isEmpty(conString)){
        	if(!request.getRequestURI().contains("home/")){
	        	response.sendRedirect(basePath+"/home/index.shtml");
	            return false;
        	}
        }
        
        if(request.getRequestURI().contains("logn/register")){
    		return true;
    	}
        
        String user = (String) request.getSession().getAttribute("phone");
        if(user != null){
        	return true;
        }else{
        	response.sendRedirect(basePath+"/home/index.shtml");
        	return false;
        }
    	
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		if(modelAndView != null){
    		String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+ request.getContextPath();
    		modelAndView.addObject("basePath", basePath);
    	}
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
	}

}
