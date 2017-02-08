package com.yuer.spring.quartz;

import java.util.Calendar;
import java.util.Date;

public class SpringQtz {
	
	private static int count = 0;
	
	protected void execute() throws InterruptedException{
//		long ms = System.currentTimeMillis();
//		Calendar calendar = Calendar.getInstance();
//		calendar.setTime(new Date(ms));
		
		System.out.println("(" + count++ + ")");
		System.out.println(Thread.currentThread().getName() + "正在执行查询...");
//		Thread.sleep(5000);
		System.out.println(Thread.currentThread().getName() + "正在执行删除...");
//		Thread.sleep(5000);
		System.out.println(Thread.currentThread().getName() + "删除成功...");
//		Thread.sleep(5000);
		
	}
	
	
}
