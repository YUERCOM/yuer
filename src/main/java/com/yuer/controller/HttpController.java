package com.yuer.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yuer.util.YResult;
import com.yuer.util.YuerJsonUtils;
import com.yuer.util.YuerUtils;
import com.yuer.util.http.model.AM009;
import com.yuer.util.http.model.AM010;
import com.yuer.util.http.model.CFDM001;
import com.yuer.util.http.model.CFNM001;
import com.yuer.util.http.model.CFSM001;
import com.yuer.util.http.model.CM007;
import com.yuer.util.http.model.DCIM;
import com.yuer.util.http.model.GetData;

@RestController
@RequestMapping(value = "/http")
public class HttpController {
	
	@RequestMapping(value = "/gaojing",method=RequestMethod.POST,produces = YuerUtils.APPLICATION_JSON)
	public String getGaojing(HttpServletRequest request,String username,String password){
		Map<String, String> paramMap = new HashMap<>();
		paramMap.put("username", username);
		paramMap.put("password", password);
		return YuerJsonUtils.objToJson(new YResult(paramMap));
	}
	
	/**
	 * 查询网管当前告警
	 * @param request
	 * @param username
	 * @param password
	 * @param am009
	 * @return
	 */
	@RequestMapping(value = "/am009",method=RequestMethod.POST,produces = YuerUtils.APPLICATION_JSON)
	public String am009(HttpServletRequest request,
			String username,String password,
			@RequestParam("AL_CAUSE")String alCause,@RequestParam("AL_LEVEL")String alLevel,
			@RequestParam("AL_TYPE")String alType,@RequestParam("AL_CREATE_TIME")String alCreateTime){
		Map<String, String> user = GetData.getUser();
		if(!user.get("username").equals(username)){
			return YuerJsonUtils.objToJson(new DCIM(false,"用户名错误"));
		}
		if(!user.get("password").equals(password)){
			return YuerJsonUtils.objToJson(new DCIM(false,"密码错误"));
		}
		
		System.out.println("告警原因：" + alCause);
		System.out.println("告警级别：" + alLevel);
		System.out.println("告警类型：" + alType);
		System.out.println("告警时间：" + alCreateTime);
		
		List<AM009> list = GetData.getAm009s();
		Map<String, Object> map = new HashMap<>();
		map.put("SUCCESS", true);
		map.put("ERRORCODE", "");
		map.put("result", list);
		
		return YuerJsonUtils.objToJson(map);
	}
	
	/**
	 * 查询设备当前告警
	 * @param request
	 * @param username
	 * @param password
	 * @param am010
	 * @return
	 */
	@RequestMapping(value = "/am010",method=RequestMethod.POST,produces = YuerUtils.APPLICATION_JSON)
	public String am010(HttpServletRequest request,
			String username,String password,
			@RequestParam("AL_CAUSE")String alCause,@RequestParam("AL_LEVEL")String alLevel,
			@RequestParam("AL_TYPE")String alType,@RequestParam("AL_CREATE_TIME")String alCreateTime){
		Map<String, String> user = GetData.getUser();
		if(!user.get("username").equals(username)){
			return YuerJsonUtils.objToJson(new DCIM(false,"用户名错误"));
		}
		if(!user.get("password").equals(password)){
			return YuerJsonUtils.objToJson(new DCIM(false,"密码错误"));
		}
		
		System.out.println("告警原因：" + alCause);
		System.out.println("告警级别：" + alLevel);
		System.out.println("告警类型：" + alType);
		System.out.println("告警时间：" + alCreateTime);
		
		List<AM010> list = GetData.getAm010s();
		Map<String, Object> map = new HashMap<>();
		map.put("SUCCESS", true);
		map.put("ERRORCODE", "");
		map.put("result", list);
		
		return YuerJsonUtils.objToJson(map);
	}
	
	/**
	 * 查询网管信息详情
	 * @param request
	 * @param nmId
	 * @return
	 */
	@RequestMapping(value = "/cfnm001",method=RequestMethod.POST,produces = YuerUtils.APPLICATION_JSON)
	public String cfnm001(HttpServletRequest request,
			String username,String password,
			@RequestParam("NMID")String nmId){
		Map<String, String> user = GetData.getUser();
		if(!user.get("username").equals(username)){
			return YuerJsonUtils.objToJson(new DCIM(false,"用户名错误"));
		}
		if(!user.get("password").equals(password)){
			return YuerJsonUtils.objToJson(new DCIM(false,"密码错误"));
		}
		
		System.out.println("厂家网管标识:" + nmId);
		
		CFNM001 cfnm001 = GetData.getCfnm001();
		Map<String, Object> map = new HashMap<>();
		map.put("SUCCESS", true);
		map.put("ERRORCODE", "");
		map.put("result", cfnm001);
		return YuerJsonUtils.objToJson(map);
	}
	
	/**
	 * 设备信息查询同步
	 * @param request
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping(value = "/cfdm001",method=RequestMethod.POST,produces = YuerUtils.APPLICATION_JSON)
	public String cfdm001(HttpServletRequest request,
			String username,String password){
		Map<String, String> user = GetData.getUser();
		if(!user.get("username").equals(username)){
			return YuerJsonUtils.objToJson(new DCIM(false,"用户名错误"));
		}
		if(!user.get("password").equals(password)){
			return YuerJsonUtils.objToJson(new DCIM(false,"密码错误"));
		}
		List<CFDM001> list = GetData.getCfdm001s();
		Map<String, Object> map = new HashMap<>();
		map.put("SUCCESS", true);
		map.put("ERRORCODE", "");
		map.put("result", list);
		return YuerJsonUtils.objToJson(map);
	}
	
	/**
	 * 查询设备信息详情
	 * @param request
	 * @param username
	 * @param password
	 * @param deId
	 * @return
	 */
	@RequestMapping(value = "/cfdm002",method=RequestMethod.POST,produces = YuerUtils.APPLICATION_JSON)
	public String cfdm002(HttpServletRequest request,
			String username,String password,
			@RequestParam("DEID")String deId){
		Map<String, String> user = GetData.getUser();
		if(!user.get("username").equals(username)){
			return YuerJsonUtils.objToJson(new DCIM(false,"用户名错误"));
		}
		if(!user.get("password").equals(password)){
			return YuerJsonUtils.objToJson(new DCIM(false,"密码错误"));
		}
		
		System.out.println("设备标识:" + deId);
		
		CFDM001 cfdm001 = GetData.getCfdm001();
		Map<String, Object> map = new HashMap<>();
		map.put("SUCCESS", true);
		map.put("ERRORCODE", "");
		map.put("result", cfdm001);
		return YuerJsonUtils.objToJson(map);
	}
	
	/**
	 * 监测点信息查询同步
	 * @param request
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping(value = "/cfsm001",method=RequestMethod.POST,produces = YuerUtils.APPLICATION_JSON)
	public String cfsm001(HttpServletRequest request,
			String username,String password){
		Map<String, String> user = GetData.getUser();
		if(!user.get("username").equals(username)){
			return YuerJsonUtils.objToJson(new DCIM(false,"用户名错误"));
		}
		if(!user.get("password").equals(password)){
			return YuerJsonUtils.objToJson(new DCIM(false,"密码错误"));
		}
		
		List<CFSM001> list = GetData.getCfsm001s();
		Map<String, Object> map = new HashMap<>();
		map.put("SUCCESS", true);
		map.put("ERRORCODE", "");
		map.put("result", list);
		return YuerJsonUtils.objToJson(map);
	}
	
	/**
	 * 查询监测点信息详情
	 * @param request
	 * @param username
	 * @param password
	 * @param suId
	 * @return
	 */
	@RequestMapping(value = "/cfsm002",method=RequestMethod.POST,produces = YuerUtils.APPLICATION_JSON)
	public String cfsm002(HttpServletRequest request,
			String username,String password,
			@RequestParam("SUID")String suId){
		Map<String, String> user = GetData.getUser();
		if(!user.get("username").equals(username)){
			return YuerJsonUtils.objToJson(new DCIM(false,"用户名错误"));
		}
		if(!user.get("password").equals(password)){
			return YuerJsonUtils.objToJson(new DCIM(false,"密码错误"));
		}
		
		System.out.println("监测点标识:" + suId);
		
		CFSM001 cfsm001 = GetData.getCfsm001();
		Map<String, Object> map = new HashMap<>();
		map.put("SUCCESS", true);
		map.put("ERRORCODE", "");
		map.put("result", cfsm001);
		return YuerJsonUtils.objToJson(map);
	}
	
	/**
	 * 查询设备当前性能
	 * @param request
	 * @param username
	 * @param password
	 * @param deId
	 * @param pmType
	 * @return
	 */
	@RequestMapping(value = "/cm007",method=RequestMethod.POST,produces = YuerUtils.APPLICATION_JSON)
	public String cm007(HttpServletRequest request,
			String username,String password,
			@RequestParam("DEID")String deId,
			@RequestParam("PM_TYPE")String pmType){
		Map<String, String> user = GetData.getUser();
		if(!user.get("username").equals(username)){
			return YuerJsonUtils.objToJson(new DCIM(false,"用户名错误"));
		}
		if(!user.get("password").equals(password)){
			return YuerJsonUtils.objToJson(new DCIM(false,"密码错误"));
		}
		
		System.out.println("设备标识:" + deId);
		System.out.println("性能监测点类型:" + pmType);
		
		List<CM007> list = GetData.getCm007s();
		Map<String, Object> map = new HashMap<>();
		map.put("SUCCESS", true);
		map.put("ERRORCODE", "");
		map.put("result", list);
		return YuerJsonUtils.objToJson(map);
	}
	
	/**
	 * 查询设备历史性能
	 * @param request
	 * @param username
	 * @param password
	 * @param deId
	 * @param pmPeriod
	 * @return
	 */
	@RequestMapping(value = "/cm008",method=RequestMethod.POST,produces = YuerUtils.APPLICATION_JSON)
	public String cm008(HttpServletRequest request,
			String username,String password,
			@RequestParam("DEID")String deId,
			@RequestParam("PM_PERIOD")String pmPeriod){
		Map<String, String> user = GetData.getUser();
		if(!user.get("username").equals(username)){
			return YuerJsonUtils.objToJson(new DCIM(false,"用户名错误"));
		}
		if(!user.get("password").equals(password)){
			return YuerJsonUtils.objToJson(new DCIM(false,"密码错误"));
		}
		
		System.out.println("设备标识:" + deId);
		System.out.println("性能监测周期:" + pmPeriod);
		
		List<CM007> list = GetData.getCm008s();
		Map<String, Object> map = new HashMap<>();
		map.put("SUCCESS", true);
		map.put("ERRORCODE", "");
		map.put("result", list);
		return YuerJsonUtils.objToJson(map);
	}
	
	/**
	 * 查询监测点当前性能
	 * @param request
	 * @param username
	 * @param password
	 * @param suId
	 * @param pmType
	 * @return
	 */
	@RequestMapping(value = "/cm009",method=RequestMethod.POST,produces = YuerUtils.APPLICATION_JSON)
	public String cm009(HttpServletRequest request,
			String username,String password,
			@RequestParam("SUID")String suId,
			@RequestParam("PM_TYPE")String pmType){
		Map<String, String> user = GetData.getUser();
		if(!user.get("username").equals(username)){
			return YuerJsonUtils.objToJson(new DCIM(false,"用户名错误"));
		}
		if(!user.get("password").equals(password)){
			return YuerJsonUtils.objToJson(new DCIM(false,"密码错误"));
		}
		
		System.out.println("监测点标识:" + suId);
		System.out.println("性能监测点类型:" + pmType);
		
		List<CM007> list = GetData.getCm009s();
		Map<String, Object> map = new HashMap<>();
		map.put("SUCCESS", true);
		map.put("ERRORCODE", "");
		map.put("result", list);
		return YuerJsonUtils.objToJson(map);
	}
	
	/**
	 * 查询监测点历史性能
	 * @param request
	 * @param username
	 * @param password
	 * @param suId
	 * @param pmPeriod
	 * @return
	 */
	@RequestMapping(value = "/cm010",method=RequestMethod.POST,produces = YuerUtils.APPLICATION_JSON)
	public String cm010(HttpServletRequest request,
			String username,String password,
			@RequestParam("SUID")String suId,
			@RequestParam("PM_PERIOD")String pmPeriod){
		Map<String, String> user = GetData.getUser();
		if(!user.get("username").equals(username)){
			return YuerJsonUtils.objToJson(new DCIM(false,"用户名错误"));
		}
		if(!user.get("password").equals(password)){
			return YuerJsonUtils.objToJson(new DCIM(false,"密码错误"));
		}
		
		System.out.println("监测点标识:" + suId);
		System.out.println("性能监测周期:" + pmPeriod);
		
		List<CM007> list = GetData.getCm010s();
		Map<String, Object> map = new HashMap<>();
		map.put("SUCCESS", true);
		map.put("ERRORCODE", "");
		map.put("result", list);
		return YuerJsonUtils.objToJson(map);
	}
	
}
