package com.yuer.util;

import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class YuerJsonUtils {

	private static final Logger logger = LoggerFactory.getLogger(YuerJsonUtils.class);
	
	/**
	 * Object 对象转 Json 对象
	 * @param obj
	 * @return
	 */
	public static String objToJson(Object obj){
		if(obj == null){
			return null;
		}
		try {
			ObjectMapper mapper = new ObjectMapper();
			String json = mapper.writeValueAsString(obj);
			return json;
		} catch (Exception e) {
			logger.error("Object对象转Json对象出错");
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Json对象转Object对象
	 * @param json
	 * @param classs  转换后的Object对象类型
	 * @return
	 */
	public static <T> T jsonToObj(String json,Class<T> classs){
		if(json == null || json.trim().length() == 0){
			return null;
		}
		try {
			ObjectMapper mapper = new ObjectMapper();
			T t = mapper.readValue(json, classs);
			return t;
		} catch (Exception e) {
			logger.error("Json对象转Object对象出错");
			e.printStackTrace();
		}
		return null;
	}
	
}
