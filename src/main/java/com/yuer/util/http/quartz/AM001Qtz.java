package com.yuer.util.http.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.yuer.util.YuerCoreUtils;
import com.yuer.util.YuerJsonUtils;
import com.yuer.util.http.HttpClientUtils;
import com.yuer.util.http.model.DCIM;

public class AM001Qtz {
	private static int count = 0;
	protected void execute() throws InterruptedException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Map<String, String> paramMap = new HashMap<>();
		paramMap.put("token", "8e8f6e7820d0428dbe33d22311d5d64c");
		paramMap.put("wpCode", (count++) + "");									//告警流水号
		paramMap.put("deTypeCode", "告警对象类型");								//告警对象类型
		paramMap.put("deCode", "0");								//告警对象标识
		paramMap.put("wpCause", "告警原因");									//告警原因
		paramMap.put("wpLevel", "1");									//告警级别
		paramMap.put("wpType", "告警类型");										//告警类型
		paramMap.put("createTime", sdf.format(new Date()));					//告警产生时间
		paramMap.put("wpDesc", "告警描述告警描述");								//告警描述
//		paramMap.put("ALID", (count++) + "");									//告警流水号
//		paramMap.put("AL_OBJ_TYPE", "告警对象类型");								//告警对象类型
//		paramMap.put("AL_OBJ_ID", "告警对象标识");								//告警对象标识
//		paramMap.put("AL_CAUSE", "告警原因");									//告警原因
//		paramMap.put("AL_LEVEL", "告警级别");									//告警级别
//		paramMap.put("AL_TYPE", "告警类型");										//告警类型
//		paramMap.put("AL_CREATE_TIME", sdf.format(new Date()));					//告警产生时间
//		paramMap.put("AL_DESC", "告警描述告警描述");								//告警描述
		System.out.println("");
		System.out.println(YuerJsonUtils.objToJson(paramMap));
		System.out.println("");
		
		String json = HttpClientUtils.httpPostRequest(YuerCoreUtils.getProperty("am001_url"), paramMap, null);
		System.out.println("===============================================================");
		System.out.println(json);
		System.out.println("===============================================================");
//		DCIM dcim = YuerJsonUtils.jsonToObj(json, DCIM.class);
//		System.out.println("是否成功：" + dcim.isSuccess());
//		if(!dcim.isSuccess()){
//			System.out.println("错误编码：" + dcim.getErrorcode());
//		}
	}
	
}
