package com.yuer.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.yuer.model.UserMB;
import com.yuer.model.param.UserParam;
import com.yuer.model.util.UserUtil;
import com.yuer.service.UserService;
import com.yuer.util.YResult;
import com.yuer.util.YuerJsonUtils;
import com.yuer.util.YuerUtils;
import com.yuer.util.YuerValueUtils;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	/**
	 * 用户列表
	 * @param request
	 * @param model
	 * @param userParam
	 * @return
	 */
	@RequestMapping(value = "/userList",produces = YuerUtils.TEXT_HTML)
	public String userList(HttpServletRequest request,Model model,UserParam userParam){
		PageInfo<UserUtil> pageInfo = userService.selectUserInfo(userParam);
		model.addAttribute("pageInfo", pageInfo);
		model.addAttribute("userParam", userParam);
		return "system/yuer_user";
	}
	
	/**
	 * 跳转添加用户页面
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/gotoUserAdd",produces = YuerUtils.TEXT_HTML)
	public String gotoUserAdd(HttpServletRequest request,Model model){
		return "system/yuer_user_add";
	}
	
	/**
	 * 跳转修改用户页面
	 * @param request
	 * @param model
	 * @param userId
	 * @return
	 */
	@RequestMapping(value = "/gotoUserUpdate",produces = YuerUtils.TEXT_HTML)
	public String gotoUserUpdate(HttpServletRequest request,Model model,Integer userId){
		UserParam userParam = userService.selectByPrimaryKey(userId);
		model.addAttribute("userParam", userParam);
		return "system/yuer_user_add";
	}
	
	/**
	 * 添加修改操作
	 * @param request
	 * @param param
	 * @return
	 */
	@RequestMapping(value="/saveUser",method=RequestMethod.POST,produces = YuerUtils.APPLICATION_JSON)
	public @ResponseBody String saveUser(HttpServletRequest request,UserParam param){
		UserMB userMB = UserParam.userParamToUserMB(param);
		if(userMB == null){
			return YuerJsonUtils.objToJson(new YResult("error","服务器开小差..."));
		}
		if(YuerValueUtils.stringIsEmpty(userMB.getLoginName())){
			return YuerJsonUtils.objToJson(new YResult("error","登录名不能为空"));
		}
		if(YuerValueUtils.stringIsEmpty(userMB.getShowName())){
			return YuerJsonUtils.objToJson(new YResult("error","显示名不能为空"));
		}
		if(userMB.getDeptId() == null){
			return YuerJsonUtils.objToJson(new YResult("error","部门不能为空"));
		}
		if(userMB.getRoleId() == null){
			return YuerJsonUtils.objToJson(new YResult("error","角色不能为空"));
		}
		
		Integer result = userService.insertSelective(userMB);
		
		if(result == 1){
			return YuerJsonUtils.objToJson(new YResult("error","[" + userMB.getLoginName() + "] 已存在"));
		}
		
		return YuerJsonUtils.objToJson(new YResult());
	}
	
	@RequestMapping(value="/deleteUser",method=RequestMethod.POST,produces = YuerUtils.APPLICATION_JSON)
	public @ResponseBody String deleteUser(HttpServletRequest request,Integer id){
		return userService.deleteByPrimaryKey(id);
	}
	
	
	
}
