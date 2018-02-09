package com.lywu.sxij.dao;

import com.lywu.sxij.entity.PowerMidMenu;
import com.lywu.sxij.entity.PowerMidMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PowerMidMenuMapper {
    int countByExample(PowerMidMenuExample example);

    int deleteByExample(PowerMidMenuExample example);

    int insert(PowerMidMenu record);

    int insertSelective(PowerMidMenu record);

    List<PowerMidMenu> selectByExample(PowerMidMenuExample example);

    int updateByExampleSelective(@Param("record") PowerMidMenu record, @Param("example") PowerMidMenuExample example);

    int updateByExample(@Param("record") PowerMidMenu record, @Param("example") PowerMidMenuExample example);

    List<PowerMidMenu> selectPage(PowerMidMenuExample example);
}