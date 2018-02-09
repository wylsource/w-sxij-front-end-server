package com.lywu.sxij.dao;

import com.lywu.sxij.entity.RoleMidPower;
import com.lywu.sxij.entity.RoleMidPowerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleMidPowerMapper {
    int countByExample(RoleMidPowerExample example);

    int deleteByExample(RoleMidPowerExample example);

    int insert(RoleMidPower record);

    int insertSelective(RoleMidPower record);

    List<RoleMidPower> selectByExample(RoleMidPowerExample example);

    int updateByExampleSelective(@Param("record") RoleMidPower record, @Param("example") RoleMidPowerExample example);

    int updateByExample(@Param("record") RoleMidPower record, @Param("example") RoleMidPowerExample example);

    List<RoleMidPower> selectPage(RoleMidPowerExample example);
}