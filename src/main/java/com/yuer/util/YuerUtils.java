package com.yuer.util;

public class YuerUtils {
	
	////////////////////////////////////////////////////////////////////////////////////////////////
	//数据格式
	public static final String APPLICATION_JSON = "application/json;charset=utf-8";
    public static final String TEXT_HTML = "text/html;charset=UTF-8";
    public static final String APPLICATION_XML = "application/xml;charset=UTF-8";
    ////////////////////////////////////////////////////////////////////////////////////////////////
    
    //Session  key
    public static final String SESSION_USER = "YUER_USER";//用户信息
    public static final String SESSION_MENUS = "YUER_MENUS";//菜单信息
    public static final String SESSION_DEPTIDS = "YUER_DEPTIDS";//对应角色所管理的部门ID集合
    
    //aop注解执行优先级（值越小优先级越高）Annotation
  	public static final int ANNOTATION_ORDER_0 = 0;
  	public static final int ANNOTATION_ORDER_1 = 1;
  	public static final int ANNOTATION_ORDER_2 = 2;
  	public static final int ANNOTATION_ORDER_3 = 3;
  	public static final int ANNOTATION_ORDER_4 = 4;
  	public static final int ANNOTATION_ORDER_5 = 5;
  	public static final int ANNOTATION_ORDER_6 = 6;
  	public static final int ANNOTATION_ORDER_7 = 7;
  	public static final int ANNOTATION_ORDER_8 = 8;
  	public static final int ANNOTATION_ORDER_9 = 9;
  	public static final int ANNOTATION_ORDER_10 = 10;
    
    
    public static final String SUCCESS = "00000";//成功
	public static final String ERROR = "99999";//失败
	public static final String ERROR_STR = "服务器开小差了...";//失败
	
	public static final String USER_EMPTY_CODE = "10000";//用户不存在
	public static final String USER_EMPTY_STR = "用户不存在，请修改后登录";
	public static final String PWD_ERROR_CODE = "10001";//密码不匹配
	public static final String PWD_ERROR_STR = "密码不匹配，请修改后登录";
	
	
	
    
	
}
