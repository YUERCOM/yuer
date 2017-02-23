package com.yuer.spring.aspect.authuser;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import com.yuer.util.YResult;
import com.yuer.util.YuerJsonUtils;
import com.yuer.util.YuerUtils;

@Component
@Aspect
public class AuthUserAspect implements Ordered {
	private static final Logger log = LoggerFactory.getLogger(AuthUserAspect.class);
	
	@Pointcut("@annotaion(com.yuer.spring.aspect.authuser.AuthUser)")
	public void authUserPointcut(){}
	
	@Around("authUserPointcut()")
	public Object authUser(ProceedingJoinPoint pjp) throws Throwable{
		Object[] args = pjp.getArgs();
		HttpServletRequest request = null;
		for(int i = 0; i < args.length; i++){
			if(args[i] instanceof HttpServletRequest){
				request = (HttpServletRequest) args[i];
				if(request.getSession().getAttribute("user") != null){
					log.info("登录用户");
					return pjp.proceed();
				}
			}
		}
		log.info("未登录用户");
		return YuerJsonUtils.objToJson(new YResult("error", "用户未登录"));
	}
	
	@Override
	public int getOrder() {
		return YuerUtils.ANNOTATION_ORDER_0;
	}

}
