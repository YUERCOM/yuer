package com.yuer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yuer.service.ActivitiService;
import com.yuer.util.YuerUtils;

@RestController
@RequestMapping("/activiti")
public class ActivitiController {

	@Autowired
	private ActivitiService activitiService;
	
	@RequestMapping(value = "/test",method = RequestMethod.GET)
	public String test(){
		return "success";
	}
	
	/**
	 * 根据流程key 和 资源文件部署流程
	 * @param processKey
	 * @param resourceName
	 * @return
	 */
	@RequestMapping(value = "/deployProcess",method = RequestMethod.GET,produces = YuerUtils.APPLICATION_JSON)
	public String deployProcess(String processKey,String resourceName){
		return activitiService.deployProcess(processKey, resourceName);
	}
	
	
	
}
