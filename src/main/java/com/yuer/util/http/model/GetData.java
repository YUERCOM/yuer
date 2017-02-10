package com.yuer.util.http.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetData {
	
	/**
	 * 查询网管信息详情
	 * @return
	 */
	public static CFNM001 getCfnm001(){
		CFNM001 cfnm001 = new CFNM001();
		cfnm001.setNmName("网管名称_name");
		cfnm001.setNmType("网管类型_type");
		cfnm001.setNmVersion("网管版本_version");
		cfnm001.setNmVendor("生产厂商_vendor");
		cfnm001.setNmYgsbsl(20);
		cfnm001.setNmKgsbsl(18);
		return cfnm001;
	}
	
	public static Map<String, String> getUser(){
		Map<String, String> map = new HashMap<>();
		map.put("username", "zhangsan");
		map.put("password", "123456");
		return map;
	}
	
	public static List<AM009> getAm009s(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		List<AM009> list = new ArrayList<>();
		{
			AM009 am009 = new AM009();
			am009.setAlId("1");
			am009.setAlObjType("告警对象类型1");
			am009.setAlObjId("11");
			am009.setAlCause("告警原因1");
			am009.setAlLevel("1");
			am009.setAlType("告警类型1");
			am009.setAlCreateTime(sdf.format(new Date()));
			am009.setAlDesc("告警描述1");
			list.add(am009);
		}
		{
			AM009 am009 = new AM009();
			am009.setAlId("2");
			am009.setAlObjType("告警对象类型2");
			am009.setAlObjId("22");
			am009.setAlCause("告警原因2");
			am009.setAlLevel("2");
			am009.setAlType("告警类型2");
			am009.setAlCreateTime(sdf.format(new Date()));
			am009.setAlDesc("告警描述2");
			list.add(am009);
		}
		{
			AM009 am009 = new AM009();
			am009.setAlId("3");
			am009.setAlObjType("告警对象类型3");
			am009.setAlObjId("33");
			am009.setAlCause("告警原因3");
			am009.setAlLevel("3");
			am009.setAlType("告警类型3");
			am009.setAlCreateTime(sdf.format(new Date()));
			am009.setAlDesc("告警描述3");
			list.add(am009);
		}
		
		return list;
	}
	
	public static List<AM010> getAm010s(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		List<AM010> list = new ArrayList<>();
		{
			AM010 am010 = new AM010();
			am010.setAlId("1");
			am010.setAlObjType("告警对象类型1");
			am010.setAlObjId("11");
			am010.setAlCause("告警原因1");
			am010.setAlLevel("告警级别1");
			am010.setAlType("告警类型1");
			am010.setAlCreateTime(sdf.format(new Date()));
			list.add(am010);
		}
		{
			AM010 am010 = new AM010();
			am010.setAlId("2");
			am010.setAlObjType("告警对象类型2");
			am010.setAlObjId("22");
			am010.setAlCause("告警原因2");
			am010.setAlLevel("告警级别2");
			am010.setAlType("告警类型2");
			am010.setAlCreateTime(sdf.format(new Date()));
			list.add(am010);
		}
		{
			AM010 am010 = new AM010();
			am010.setAlId("3");
			am010.setAlObjType("告警对象类型1");
			am010.setAlObjId("33");
			am010.setAlCause("告警原因3");
			am010.setAlLevel("告警级别3");
			am010.setAlType("告警类型3");
			am010.setAlCreateTime(sdf.format(new Date()));
			list.add(am010);
		}
		return list;
	}
	
	public static List<CFDM001> getCfdm001s(){
		List<CFDM001> list = new ArrayList<>();
		{
			CFDM001 cfdm001 = new CFDM001();
			cfdm001.setDeId("设备标识_1");
			cfdm001.setDeName("设备名称_11");
			cfdm001.setDeType("设备类型_11");
			cfdm001.setDeVersion("设备版本_11");
			cfdm001.setDeVendor("设备厂商_11");
			list.add(cfdm001);
		}
		{
			CFDM001 cfdm001 = new CFDM001();
			cfdm001.setDeId("设备标识_2");
			cfdm001.setDeName("设备名称_22");
			cfdm001.setDeType("设备类型_22");
			cfdm001.setDeVersion("设备版本_22");
			cfdm001.setDeVendor("设备厂商_22");
			list.add(cfdm001);
		}
		{
			CFDM001 cfdm001 = new CFDM001();
			cfdm001.setDeId("设备标识_3");
			cfdm001.setDeName("设备名称_3");
			cfdm001.setDeType("设备类型_3");
			cfdm001.setDeVersion("设备版本_3");
			cfdm001.setDeVendor("设备厂商_3");
			list.add(cfdm001);
		}
		return list;
	}
	
	public static CFDM001 getCfdm001(){
		CFDM001 cfdm001 = new CFDM001();
		cfdm001.setDeId("设备标识_0");
		cfdm001.setDeName("设备名称_0");
		cfdm001.setDeType("设备类型_0");
		cfdm001.setDeVersion("设备版本_0");
		cfdm001.setDeVendor("设备厂商_0");
		cfdm001.setDeAlarmState("设备告警状态_0");
		return cfdm001;
	}
	
	public static List<CFSM001> getCfsm001s(){
		List<CFSM001> list = new ArrayList<>();
		{
			CFSM001 cfsm001 = new CFSM001();
			cfsm001.setDeCode("设备标识_1");
			cfsm001.setSuId("监测点标识_1");
			cfsm001.setSuParentId("父资源标识_1");
			cfsm001.setSuParentType("父资源类型_1");
			cfsm001.setSuName("监测点名称_1");
			cfsm001.setSuType("监测点类型_1");
			cfsm001.setSuServerState("监测点服务状态_1");
			cfsm001.setSuSn("监测点序号_1");
			cfsm001.setSuUnit("遥测单位_1");
			list.add(cfsm001);
		}
		{
			CFSM001 cfsm001 = new CFSM001();
			cfsm001.setDeCode("设备标识_2");
			cfsm001.setSuId("监测点标识_2");
			cfsm001.setSuParentId("父资源标识_2");
			cfsm001.setSuParentType("父资源类型_2");
			cfsm001.setSuName("监测点名称_2");
			cfsm001.setSuType("监测点类型_2");
			cfsm001.setSuServerState("监测点服务状态_2");
			cfsm001.setSuSn("监测点序号_2");
			cfsm001.setSuUnit("遥测单位_2");
			list.add(cfsm001);
		}
		{
			CFSM001 cfsm001 = new CFSM001();
			cfsm001.setDeCode("设备标识_3");
			cfsm001.setSuId("监测点标识_3");
			cfsm001.setSuParentId("父资源标识_3");
			cfsm001.setSuParentType("父资源类型_3");
			cfsm001.setSuName("监测点名称_3");
			cfsm001.setSuType("监测点类型_3");
			cfsm001.setSuServerState("监测点服务状态_3");
			cfsm001.setSuSn("监测点序号_3");
			cfsm001.setSuUnit("遥测单位_3");
			list.add(cfsm001);
		}
		return list;
	}
	
	public static CFSM001 getCfsm001(){
		CFSM001 cfsm001 = new CFSM001();
		cfsm001.setSuId("监测点标识_0");
		cfsm001.setSuParentId("父资源标识_0");
		cfsm001.setSuParentType("父资源类型_0");
		cfsm001.setSuName("监测点名称_0");
		cfsm001.setSuType("监测点类型_0");
		cfsm001.setSuServerState("监测点服务状态_0");
		cfsm001.setSuSn("监测点序号_0");
		cfsm001.setSuUnit("遥测单位_0");
		return cfsm001;
	}
	
	public static CM007 getCm007s(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		CM007 cm007 = new CM007();
		cm007.setPeCode("性能编号_1");
		cm007.setPmParamName("性能监测参数名称_1");
		cm007.setPmParamUnit("性能监测参数单位_1");
		cm007.setPmParamValue("11");
		cm007.setPmPeriod("性能检测周期_1");
		cm007.setPmTime(sdf.format(new Date()));
//		List<CM007> list = new ArrayList<>();
//		{
//			CM007 cm007 = new CM007();
//			cm007.setPmParamName("性能监测参数名称_1");
//			cm007.setPmParamUnit("性能监测参数单位_1");
//			cm007.setPmParamValue("性能监测参数值_1");
//			cm007.setPmTime(sdf.format(new Date()));
//			list.add(cm007);
//		}
//		{
//			CM007 cm007 = new CM007();
//			cm007.setPmParamName("性能监测参数名称_2");
//			cm007.setPmParamUnit("性能监测参数单位_2");
//			cm007.setPmParamValue("性能监测参数值_2");
//			cm007.setPmTime(sdf.format(new Date()));
//			list.add(cm007);
//		}
		return cm007;
	}
	
	public static List<CM007> getCm008s(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		List<CM007> list = new ArrayList<>();
		{
			CM007 cm007 = new CM007();
			cm007.setPeCode("性能编号_1");
			cm007.setPmLocation("性能监测位置_11");
			cm007.setPmParamName("性能监测参数名称_11");
			cm007.setPmParamUnit("性能监测参数单位_11");
			cm007.setPmParamValue("111");
			cm007.setPmPeriod("性能检测周期_11");
			cm007.setPmTime(sdf.format(new Date()));
			list.add(cm007);
		}
		{
			CM007 cm007 = new CM007();
			cm007.setPeCode("性能编号_2");
			cm007.setPmLocation("性能监测位置_2");
			cm007.setPmParamName("性能监测参数名称_2");
			cm007.setPmParamUnit("性能监测参数单位_2");
			cm007.setPmParamValue("11");
			cm007.setPmPeriod("性能检测周期_1");
			cm007.setPmTime(sdf.format(new Date()));
			list.add(cm007);
		}
		{
			CM007 cm007 = new CM007();
			cm007.setPeCode("性能编号_3");
			cm007.setPmLocation("性能监测位置_3");
			cm007.setPmParamName("性能监测参数名称_3");
			cm007.setPmParamUnit("性能监测参数单位_3");
			cm007.setPmParamValue("33");
			cm007.setPmPeriod("性能检测周期_3");
			cm007.setPmTime(sdf.format(new Date()));
			list.add(cm007);
		}
		return list;
	}
	
	public static CM007 getCm009s(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		CM007 cm007 = new CM007();
		cm007.setPeCode("性能编号_1");
		cm007.setPmParamName("性能监测参数名称_1");
		cm007.setPmParamUnit("性能监测参数单位_1");
		cm007.setPmParamValue("11");
		cm007.setPmPeriod("性能检测周期_1");
		cm007.setPmTime(sdf.format(new Date()));
//		List<CM007> list = new ArrayList<>();
//		{
//			CM007 cm007 = new CM007();
//			cm007.setPeCode("性能编号_3");
//			cm007.setPmParamName("性能监测参数名称_1");
//			cm007.setPmParamUnit("性能监测参数单位_1");
//			cm007.setPmParamValue("性能监测参数值_1");
//			cm007.setPmTime(sdf.format(new Date()));
//			list.add(cm007);
//		}
//		{
//			CM007 cm007 = new CM007();
//			cm007.setPmParamName("性能监测参数名称_2");
//			cm007.setPmParamUnit("性能监测参数单位_2");
//			cm007.setPmParamValue("性能监测参数值_2");
//			cm007.setPmTime(sdf.format(new Date()));
//			list.add(cm007);
//		}
		return cm007;
	}
	
	public static List<CM007> getCm010s(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		List<CM007> list = new ArrayList<>();
		{
			CM007 cm007 = new CM007();
			cm007.setPeCode("性能编号_1");
			cm007.setPmLocation("性能监测位置_1");
			cm007.setPmParamName("性能监测参数名称_1");
			cm007.setPmParamUnit("性能监测参数单位_1");
			cm007.setPmParamValue("11");
			cm007.setPmPeriod("性能检测周期_1");
			cm007.setPmTime(sdf.format(new Date()));
			list.add(cm007);
		}
		{
			CM007 cm007 = new CM007();
			cm007.setPeCode("性能编号_2");
			cm007.setPmLocation("性能监测位置_2");
			cm007.setPmParamName("性能监测参数名称_2");
			cm007.setPmParamUnit("性能监测参数单位_2");
			cm007.setPmParamValue("11");
			cm007.setPmPeriod("性能检测周期_1");
			cm007.setPmTime(sdf.format(new Date()));
			list.add(cm007);
		}
		return list;
	}
	
	
}
