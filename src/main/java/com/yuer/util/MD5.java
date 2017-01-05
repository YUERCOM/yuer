package com.yuer.util;

import java.security.MessageDigest;

import org.apache.commons.codec.digest.DigestUtils;


public class MD5 {
	
	// 全局数组
	private final static String[] strDigits = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };
	
	/**
	 * 返回形式为数字与字符串
	 * @param bByte
	 * @return
	 */
	private static String byteToArrayString(byte bByte){
		int iRet = bByte;
		if(iRet < 0){
			iRet += 256;
		}
		int iD1 = iRet / 16;
		int iD2 = iRet % 16;
		return strDigits[iD1] + strDigits[iD2];
	}
	
	/**
	 * 返回形式为数字
	 * @param bByte
	 * @return
	 */
//	private static String byteToNum(byte bByte){
//		int iRet = bByte;
//		if(iRet < 0){
//			iRet += 256;
//		}
//		return String.valueOf(iRet);
//	}
	
	/**
	 * 转换字节数据为16进制字符串
	 * @param bByte
	 * @return
	 */
	private static String byteToString(byte[] bByte){
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<bByte.length;i++){
			sb.append(byteToArrayString(bByte[i]));
		}
		return sb.toString();
	}
	
	public static String calculate(String str){
		try{
			MessageDigest md = MessageDigest.getInstance("MD5");
			return byteToString(md.digest(str.getBytes()));
		}catch(Exception e){
			return "";
		}
	}
	
	public static String sha1(String str){
		return DigestUtils.sha1Hex(str);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
