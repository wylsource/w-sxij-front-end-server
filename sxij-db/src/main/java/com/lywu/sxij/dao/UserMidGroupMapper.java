package com.lywu.sxij.dao;

import com.lywu.sxij.entity.UserMidGroup;
import com.lywu.sxij.entity.UserMidGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMidGroupMapper {
    int countByExample(UserMidGroupExample example);

    int deleteByExample(UserMidGroupExample example);

    int insert(UserMidGroup record);

    int insertSelective(UserMidGroup record);

    List<UserMidGroup> selectByExample(UserMidGroupExample example);

    int updateByExampleSelective(@Param("record") UserMidGroup record, @Param("example") UserMidGroupExample example);

    int updateByExample(@Param("record") UserMidGroup record, @Param("example") UserMidGroupExample example);

    List<UserMidGroup> selectPage(UserMidGroupExample example);
}