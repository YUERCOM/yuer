package com.yuer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yuer.model.DeptMB;
import com.yuer.model.param.DeptParam;
import com.yuer.model.util.DeptUtil;

public interface DeptMBMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DeptMB record);

    int insertSelective(DeptMB record);

    DeptMB selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DeptMB record);

    int updateByPrimaryKey(DeptMB record);
    
    List<DeptMB> selectDeptInfos();
    
    List<DeptUtil> deptPageInfo(DeptParam param);
    
}