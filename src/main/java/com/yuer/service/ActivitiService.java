package com.yuer.service;

import java.util.HashMap;
import java.util.Map;

import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class ActivitiService {
	@Autowired
	private RepositoryService repositoryService;
	
	/**
	 * 根据流程key 和 资源文件部署流程
	 * @param processKey
	 * @param resourceName
	 * @return
	 */
	public String deployProcess(String processKey,String resourceName){
		String result = "";
		try {
			Map<String, Object> map = new HashMap<>();
			ObjectMapper objectMapper = new ObjectMapper();
			map.put("status", "success");
			Map<String, Object> resultMap = new HashMap<>();
			Deployment deployment = repositoryService.createDeployment()
					.name(processKey)
					.addClasspathResource("diagrams/" + resourceName + ".bpmn")
					.addClasspathResource("diagrams/" + resourceName + ".png")
					.deploy();
			
			resultMap.put("deployment_id", deployment.getId());
			resultMap.put("deployment_name", deployment.getName());
			map.put("result", resultMap);
			result = objectMapper.writeValueAsString(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	
	
	
}
