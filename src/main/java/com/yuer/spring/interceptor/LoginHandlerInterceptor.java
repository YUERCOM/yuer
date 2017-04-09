package com.yuer.spring.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.yuer.util.YuerUtils;

public class LoginHandlerInterceptor extends HandlerInterceptorAdapter {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginHandlerInterceptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response,
			Object handler) throws Exception{
		logger.info("===================================================================");
		logger.info("servletPath:" + request.getServletPath());
		logger.info("ServletContext:" + request.getServletContext());
		logger.info("requestURI:" + request.getRequestURI());
		logger.info("requestURL:" + request.getRequestURL());
		logger.info("===================================================================");
		if(request.getServletPath().endsWith("login")){
			logger.debug("登录页面不需要验证");
			return true;
		}
		if(request.getServletPath().endsWith("loginout")){
			logger.info("退出系统");
			request.getSession().invalidate();
			response.sendRedirect(request.getContextPath());
			return false;
		}
		if(request.getSession().getAttribute(YuerUtils.SESSION_USER) == null){
			response.sendRedirect(request.getContextPath());
			return false;
		}
		return true;
	}
	
	
}
