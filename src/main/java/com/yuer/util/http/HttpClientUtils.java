package com.yuer.util.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

import org.apache.commons.collections4.MapUtils;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HttpClientUtils {
	
	private static final Logger log = LoggerFactory.getLogger(HttpClientUtils.class);
    private final static int TIMEOUT = 10000;
    
    public static String postJson(String url, Map<String, String> params,Map<String, String> headers){
        return httpPostRequest(url, params, headers);
    }

    public static String postJson(String url, Map<String, String> params,Map<String, String> headers, int timeout){
        return httpPostRequest(url, params, headers, timeout);
    }
    
    public static String httpPostRequest(String url, Map<String, String> paramMap, Map<String, String> headers){
        return httpPostRequest(url, paramMap, headers, TIMEOUT);
    }
    
    public static String httpPostRequest(String url,Map<String, String> paramMap,Map<String, String> headers, int timeout){
    	
    	if(MapUtils.isNotEmpty(paramMap)){
    		
    	}
    	
    	HttpClient httpClient = new HttpClient();
    	httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(timeout);
    	httpClient.getHttpConnectionManager().getParams().setSoTimeout(timeout);
    	
    	PostMethod request = null;
    	BufferedReader reader = null;
    	try {
			request = new PostMethod(url);
			request.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "UTF-8");
			if(MapUtils.isNotEmpty(paramMap)){
				for(String key : paramMap.keySet()){
					request.setParameter(key, paramMap.get(key));
				}
			}
			
			if(MapUtils.isNotEmpty(headers)){
				for(String key : headers.keySet()){
					request.setRequestHeader(key, headers.get(key));
				}
			}
			
			httpClient.executeMethod(request);
			
			if(request.getStatusCode() != 200){
				throw new Exception("对方服务器开小差了，status code "+request.getStatusCode());
			}
			
			reader = new BufferedReader(new InputStreamReader(request.getResponseBodyAsStream()));
			
			StringBuffer stringBuffer = new StringBuffer();
			String str = "";
			while((str = reader.readLine()) != null){
				stringBuffer.append(str);
			}
			
			return stringBuffer.toString();
		} catch (Exception e) {
			log.error("未知异常："+e.getMessage(), e);
		} finally {
            if(request != null){
                request.releaseConnection();//释放链接
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                	
                }
            }
        }
    	return "";
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	
}
