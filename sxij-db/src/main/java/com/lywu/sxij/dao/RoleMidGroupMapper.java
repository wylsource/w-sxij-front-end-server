package com.lywu.sxij.dao;

import com.lywu.sxij.entity.RoleMidGroup;
import com.lywu.sxij.entity.RoleMidGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleMidGroupMapper {
    int countByExample(RoleMidGroupExample example);

    int deleteByExample(RoleMidGroupExample example);

    int insert(RoleMidGroup record);

    int insertSelective(RoleMidGroup record);

    List<RoleMidGroup> selectByExample(RoleMidGroupExample example);

    int updateByExampleSelective(@Param("record") RoleMidGroup record, @Param("example") RoleMidGroupExample example);

    int updateByExample(@Param("record") RoleMidGroup record, @Param("example") RoleMidGroupExample example);

    List<RoleMidGroup> selectPage(RoleMidGroupExample example);
}