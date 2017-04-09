package com.yuer.spring.staticVersion;

import javax.servlet.ServletContext;

import org.springframework.web.context.ServletContextAware;

import com.yuer.util.YuerCoreUtils;

public class StaticVersion implements ServletContextAware {
	private ServletContext servletContext;
	private String staticRoot;
	public ServletContext getServletContext() {
		return servletContext;
	}
	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
	}
	public String getStaticRoot() {
		return staticRoot;
	}
	public void setStaticRoot(String staticRoot) {
		this.staticRoot = staticRoot;
	}
	
	public void init(){
		staticRoot = "/" + YuerCoreUtils.getProperty("core.static.version");
		getServletContext().setAttribute("staticRoot", getServletContext().getContextPath() + staticRoot);
		getServletContext().setAttribute("rootPath", getServletContext().getContextPath());
		
	}

}
