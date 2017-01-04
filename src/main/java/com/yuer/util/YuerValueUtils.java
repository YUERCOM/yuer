package com.yuer.util;

import java.util.List;

public class YuerValueUtils {
	
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
	
}
