package com.yuer.util.http.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.yuer.util.YuerCoreUtils;
import com.yuer.util.YuerJsonUtils;
import com.yuer.util.http.HttpClientUtils;
import com.yuer.util.http.model.DCIM;

public class CFNM002Qtz {
	private static int count = 0;
	protected void execute() throws InterruptedException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Map<String, String> paramMap = new HashMap<>();
		paramMap.put("token", "8e8f6e7820d0428dbe33d22311d5d64c");
		paramMap.put("NMID", (count++) + "");
		paramMap.put("sysName", "121212121");
//		paramMap.put("NM_VERSION", "厂家网管版本");
//		paramMap.put("NM_YGSBSL", "厂家网管管理设备数量");
//		paramMap.put("NM_KGSBSL", "厂家网管可管设备数量");
//		paramMap.put("UP_KGSBSL", sdf.format(new Date()));
		
//		paramMap.put("NMID", (count++) + "");
//		paramMap.put("NM_NAME", "厂家网管名称");
//		paramMap.put("NM_VERSION", "厂家网管版本");
//		paramMap.put("NM_YGSBSL", "厂家网管管理设备数量");
//		paramMap.put("NM_KGSBSL", "厂家网管可管设备数量");
//		paramMap.put("UP_KGSBSL", sdf.format(new Date()));
		System.out.println(YuerJsonUtils.objToJson(paramMap));
		
		String json = HttpClientUtils.httpPostRequest(YuerCoreUtils.getProperty("cfnm002_url"), paramMap, null);
		DCIM dcim = YuerJsonUtils.jsonToObj(json, DCIM.class);
		System.out.println("是否成功：" + dcim.isSuccess());
		if(!dcim.isSuccess()){
			System.out.println("错误编码：" + dcim.getErrorcode());
		}
	}
	
}
