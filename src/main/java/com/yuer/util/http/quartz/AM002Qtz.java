package com.yuer.util.http.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.yuer.util.YuerCoreUtils;
import com.yuer.util.YuerJsonUtils;
import com.yuer.util.http.HttpClientUtils;
import com.yuer.util.http.model.DCIM;

public class AM002Qtz {
//	private static int count = 0;
	protected void execute() throws InterruptedException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Map<String, String> paramMap = new HashMap<>();
		paramMap.put("token", "8e8f6e7820d0428dbe33d22311d5d64c");
		paramMap.put("wpCode", "1");									//告警流水号
		paramMap.put("updateTime", sdf.format(new Date()));					//告警消除时间
		System.out.println("");
		System.out.println(YuerJsonUtils.objToJson(paramMap));
		System.out.println("");
		
		String json = HttpClientUtils.httpPostRequest(YuerCoreUtils.getProperty("am002_url"), paramMap, null);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(json);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//		DCIM dcim = YuerJsonUtils.jsonToObj(json, DCIM.class);
//		System.out.println("是否成功：" + dcim.isSuccess());
//		if(!dcim.isSuccess()){
//			System.out.println("错误编码：" + dcim.getErrorcode());
//		}
	}
	
	
}
