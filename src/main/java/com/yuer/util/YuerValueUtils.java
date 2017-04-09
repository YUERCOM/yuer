package com.yuer.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class YuerValueUtils {
	
	private static final Logger logger = LoggerFactory.getLogger(YuerValueUtils.class);
	
	/**
	 * 判断字符串是否为空
	 * @param param
	 * @return
	 */
	public static boolean stringIsEmpty(String param){
		if(param == null || "".equals(param.trim())){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * 判断String 是否可以转换为int
	 * @param param
	 * @return
	 */
	public static boolean isInteger(String param){
		try{
			Integer.valueOf(param);
			return true;
		}catch (Exception e) {
			return false;
		}
	}
	
	/**
     * 数组长度为0返回true
     *
     * @param array
     * @param <T>
     * @return
     */
    public static <T> boolean arrayIsEmpty(T[] array) {
        if (array == null || array.length == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 
     * 集合长度为0返回true
     * @param list
     * @return
     */
    public static <T> boolean listIsEmpty(List<T> list) {
        if (list == null || list.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * String 转  Date
     * @param param
     * @return
     */
    public static Date stringToDateyyyyMMddHHmmss(String param){
    	try {
    		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        	if(stringIsEmpty(param)){
        		return new Date();
        	}
        	return sdf.parse(param);
		} catch (Exception e) {
			return new Date();
		}
    	
    }
    
    /**
     * date 转  String yyyy-MM-dd HH:mm:ss
     * @param date
     * @return
     */
    public static String dateToStringyyyyMMddHHmmss(Date date){
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	try {
    		if(date == null){
    			return sdf.format(new Date());
    		}
    		return sdf.format(date);
		} catch (Exception e) {
			return sdf.format(new Date());
		}
    }
	
}
