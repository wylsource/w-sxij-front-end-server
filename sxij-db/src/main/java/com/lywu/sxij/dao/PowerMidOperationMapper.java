package com.lywu.sxij.dao;

import com.lywu.sxij.entity.PowerMidOperation;
import com.lywu.sxij.entity.PowerMidOperationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PowerMidOperationMapper {
    int countByExample(PowerMidOperationExample example);

    int deleteByExample(PowerMidOperationExample example);

    int insert(PowerMidOperation record);

    int insertSelective(PowerMidOperation record);

    List<PowerMidOperation> selectByExample(PowerMidOperationExample example);

    int updateByExampleSelective(@Param("record") PowerMidOperation record, @Param("example") PowerMidOperationExample example);

    int updateByExample(@Param("record") PowerMidOperation record, @Param("example") PowerMidOperationExample example);

    List<PowerMidOperation> selectPage(PowerMidOperationExample example);
}