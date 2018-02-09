package com.lywu.sxij.dao;

import com.lywu.sxij.entity.Power;
import com.lywu.sxij.entity.PowerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PowerMapper {
    int countByExample(PowerExample example);

    int deleteByExample(PowerExample example);

    int insert(Power record);

    int insertSelective(Power record);

    List<Power> selectByExample(PowerExample example);

    int updateByExampleSelective(@Param("record") Power record, @Param("example") PowerExample example);

    int updateByExample(@Param("record") Power record, @Param("example") PowerExample example);

    List<Power> selectPage(PowerExample example);
}